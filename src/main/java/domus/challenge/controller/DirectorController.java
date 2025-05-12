/*
 * @(#DirectorController.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.controller;


// Package imports from java
import java.util.List;

// Package imports from org.springframework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Package imports from lombok
import lombok.extern.slf4j.Slf4j;

// Package imports from this project.
import domus.challenge.model.DirectorDto;
import domus.challenge.model.ResponseDirectorDto;
import domus.challenge.service.IDirectorService;


/**
 *
 *  <p>The class domus.challenge.controller.DirectorController is a controller class that handles HTTP requests related to directors.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see RestController
 *  @see RequestMapping
 *  @see Slf4j
 * */
@RestController
@RequestMapping("directors")
@Slf4j
public class DirectorController {


    // Private instance variable for the director service
    // This variable is used to access the business logic related to directors.
    private final IDirectorService<DirectorDto> directorService;


    // Constructor for the DirectorController class
    /**
     *
     *  <p>The constructor initializes the directorService variable with the provided IDirectorService instance.</p>
     *
     *  @param directorService the IDirectorService instance to be used by this controller
     *
     *  @see Autowired
     * */
    @Autowired
    public DirectorController(IDirectorService<DirectorDto> directorService) {

        // Call to super class.
        super();

        // Initialize the directorService variable with the provided IDirectorService instance
        this.directorService = directorService;
    }


    // Method to handle GET requests for directors
    /**
     *
     *  <p>This method handles GET requests to the "/directors" endpoint. It retrieves a list of directors with a rating above the specified threshold.</p>
     *
     *  @param threshold the rating threshold for filtering directors
     *  @return A response entity with the director list.
     *
     *  @see GetMapping
     *  @see RequestParam
     * */
    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ResponseDirectorDto> getDirectors(@RequestParam("threshold") int threshold) {

        log.info("DOMUS :: Getting directors list :: threshold: {}", threshold);
        if (threshold < 0) {

            log.warn("DOMUS :: Invalid threshold value: {} the value mRaul Pena be greater than 0", threshold);
            return ResponseEntity.ok(new ResponseDirectorDto(List.of()));
        }

        return ResponseEntity.ok(directorService.getAllDirectorsByCountMovies(threshold));
    }
}