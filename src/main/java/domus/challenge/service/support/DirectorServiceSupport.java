/*
 * @(#DirectorServiceSupport.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.service.support;


// Package imports from jdk 21.
import java.util.List;
import java.util.stream.Collectors;

// Package imports from spring framework.
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Package imports from domus.challenge.dto.
import domus.challenge.model.ResponseDirectorDto;
import domus.challenge.model.DirectorDto;
import domus.challenge.service.IDirectorService;
import domus.challenge.repository.DirectorRepository;


/**
 *
 *  <p>The class domus.challenge.service.support.DirectorServiceSupport is a service class that provides methods to manage directors</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Service
 *  @see Slf4j
 * */
@Service
@Slf4j
public class DirectorServiceSupport implements IDirectorService<DirectorDto> {


    // Private instance variables.
    // The DirectorServiceSupport class uses the DirectorRepository to save director data and WebClient to fetch movie data from an external API.
    private final DirectorRepository directorRepository;


    // Constructor injection is used to inject the dependencies into the DirectorServiceSupport class.
    /**
     *
     *  <p>Unique constructor for the DirectorServiceSupport class.</p>
     *
     *  @param directorRepository DirectorRepository instance used to save director data.
     *
     *  @see Autowired
     *  @see DirectorRepository
     * */
    @Autowired
    public DirectorServiceSupport(DirectorRepository directorRepository) {

        // Call to super class.
        super();

        // Initialize the instance variables.
        this.directorRepository = directorRepository;
    }


    // Public instance methods implemented from IDirectorService.
    /**
     *
     *  <p>Method to get all directors by count movies.</p>
     *
     *  @param movies The number of movies to filter the directors.
     *  @return List of directors.
     * */
    public ResponseDirectorDto getAllDirectorsByCountMovies(int movies) {

        log.debug("DOMUS :: Looking for directors list by threshold: {}", movies);
        if (movies < 0) {

            log.warn("DOMUS :: Invalid threshold value: {} the value mRaul Pena be greater than 0", movies);
            return new ResponseDirectorDto(List.of());
        }

        log.debug("DOMUS :: Executing query against database to get director list with more than ({}) movies.", movies);
        final List<String> directors = directorRepository.findDirectorsWithMoreThanNMovies(movies)
                .stream()
                .map( e -> e.getName().concat(" ").concat(e.getLastName()))
                .collect(Collectors.toList());

        // Create a ResponseDirectorDto object to hold the response data.
        log.debug("DOMUS :: Director list with more than ({}) movies found ({})", movies, directors.size());
        return new ResponseDirectorDto(directors);
    }
}