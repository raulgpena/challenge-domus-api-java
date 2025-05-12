/*
 * @(#IDirectorService.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.service;


// Package imports from this`project.
import domus.challenge.model.ResponseDirectorDto;


/**
 *
 *  <p>The abstract class domus.challenge.service.IDirectorService is an interface that provides methods to manage directors</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 * */
public interface IDirectorService<T> {

    // Public instance methods.
    /**
     *
     *  <p>Method to get all directors by count movies.</p>
     *
     *  @param movies The number of movies to filter the directors.
     *  @return A new instance of ResponseDirectorDto containing the list of directors.
     *
     *  @see ResponseDirectorDto
     * */
    ResponseDirectorDto getAllDirectorsByCountMovies(int movies);
}