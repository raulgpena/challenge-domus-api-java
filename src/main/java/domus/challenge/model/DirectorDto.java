/*
 * @(#DirectorDto.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.model;


// Package imports from jdk 21.
import java.util.List;

// Package imports from lombok.
import lombok.Data;
import lombok.NoArgsConstructor;

// Package imports from this project.
import domus.challenge.entity.MovieEntity;


/**
 *
 *  <p>The class domus.challenge.entity.DirectorDto is a dto class that represents a director dto.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Data
 *  @see NoArgsConstructor
 * */
@Data
@NoArgsConstructor
public class DirectorDto {


    // Constructor with parameters.
    /**
     *  <p>The constructor DirectorDto(String name, String lastName) is a constructor that initializes the fields of the class</p>
     *
     *  @param name name director.
     *  @param lastName Last  name director.
     * */
    public DirectorDto(String name, String lastName) {

        // Call to super class.
        super();

        // Initialize the fields.
        this.name = name;
        this.lastName = lastName;
    }

    /**
     *
     *  <p>The constructor DirectorDto(Long id, String name, String lastName) is a constructor that initializes the fields of the class</p>
     *
     *  @param id id director.
     *  @param name name director.
     *  @param lastName Last  name director.
     * */
    public DirectorDto(Long id, String name, String lastName) {

        // Call to super class.
        super();

        // Initialize the fields.
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }


    // Private fields definition.
    // Id director.
    private Long id;

    // Name director.
    private String name;

    // Last name director.
    private String lastName;

    // List of movies.
    private List<MovieEntity> movies;
}