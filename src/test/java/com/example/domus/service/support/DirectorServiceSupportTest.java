package com.example.domus.service.support;

import domus.challenge.model.DirectorDto;
import domus.challenge.model.ResponseDirectorDto;
import domus.challenge.repository.DirectorRepository;
import domus.challenge.service.support.DirectorServiceSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DirectorServiceSupportTest {

    @Mock
    private DirectorRepository directorRepositoryMock;

    @InjectMocks
    private DirectorServiceSupport directorServiceSupport;

    @Test
    void getAllDirectorsByCountMovies_handlesNullNames() {
        // Arrange
        DirectorDto director1 = new DirectorDto(null, "LastName1"); // Null name
        DirectorDto director2 = new DirectorDto("Name2", null);     // Null lastName
        DirectorDto director3 = new DirectorDto(null, null);        // Both null
        DirectorDto director4 = new DirectorDto("Name4", "LastName4"); // Both non-null

        List<DirectorDto> testDirectors = Arrays.asList(director1, director2, director3, director4);
        when(directorRepositoryMock.findDirectorsWithMoreThanNMovies(anyInt())).thenReturn(testDirectors);

        // Act
        ResponseDirectorDto response = null;
        Exception exception = null;
        try {
            response = directorServiceSupport.getAllDirectorsByCountMovies(1);
        } catch (Exception e) {
            exception = e;
        }

        // Assert
        assertNull(exception, "Service method threw an unexpected exception");
        assertNotNull(response, "Response should not be null");
        assertNotNull(response.getDirectors(), "Directors list in response should not be null");
        assertEquals(4, response.getDirectors().size(), "Expected 4 directors in the response");

        // Expected results after 'name.concat(" ").concat(lastName).trim()'
        // For director1 (null, "LastName1"): " LastName1".trim() -> "LastName1"
        // For director2 ("Name2", null): "Name2 ".trim() -> "Name2"
        // For director3 (null, null): " ".trim() -> ""
        // For director4 ("Name4", "LastName4"): "Name4 LastName4".trim() -> "Name4 LastName4"

        assertTrue(response.getDirectors().contains("LastName1"), "Missing director 'LastName1'");
        assertTrue(response.getDirectors().contains("Name2"), "Missing director 'Name2'");
        assertTrue(response.getDirectors().contains(""), "Missing director with empty string (both names null)");
        assertTrue(response.getDirectors().contains("Name4 LastName4"), "Missing director 'Name4 LastName4'");
    }

    @Test
    void getAllDirectorsByCountMovies_returnsEmptyListForNegativeThreshold() {
        // Arrange
        // No need to mock repository as it shouldn't be called for negative threshold

        // Act
        ResponseDirectorDto response = directorServiceSupport.getAllDirectorsByCountMovies(-1);

        // Assert
        assertNotNull(response, "Response should not be null");
        assertNotNull(response.getDirectors(), "Directors list in response should not be null");
        assertTrue(response.getDirectors().isEmpty(), "Expected empty list for negative threshold");
    }

    @Test
    void getAllDirectorsByCountMovies_returnsEmptyListWhenRepositoryReturnsEmpty() {
        // Arrange
        when(directorRepositoryMock.findDirectorsWithMoreThanNMovies(anyInt())).thenReturn(List.of());

        // Act
        ResponseDirectorDto response = directorServiceSupport.getAllDirectorsByCountMovies(1);

        // Assert
        assertNotNull(response, "Response should not be null");
        assertNotNull(response.getDirectors(), "Directors list in response should not be null");
        assertTrue(response.getDirectors().isEmpty(), "Expected empty list when repository returns empty");
    }
}
