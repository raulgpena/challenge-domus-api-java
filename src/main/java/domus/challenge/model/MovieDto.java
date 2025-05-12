/*
 * @(#MovieDto.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.model;


// Package imports from jdk 21.
import java.time.LocalDate;
import java.util.List;

// Package imports from lombok.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 *  <p>The class domus.challenge.entity.MovieDto a dto class that represents a movie dto.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Data
 *  @see AllArgsConstructor
 *  @see NoArgsConstructor
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    // Private fields definition.
    // Id movie.
    private Long id;

    // Title movie.
    private String title;

    // Year movie release.
    private int year;

    // Rating movie.
    private String rated;

    // Release date movie.
    private LocalDate release;

    // Duration movie.
    private int runtime;

    // Genre movie.
    private GenreDto genre;

    // Director movie.
    private DirectorDto director;

    // Writer movie.
    private WriterDto writer;

    // Actors list.
    private List<ActorDto> actors;
}