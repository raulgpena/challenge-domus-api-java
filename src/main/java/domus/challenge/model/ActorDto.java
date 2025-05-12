/*
 * @(#ActorDto.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.model;


// Package imports from jdk 21.
import java.util.List;

// Package imports from lombok.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Package imports from this project.
import domus.challenge.entity.MovieEntity;


/**
 *
 *  <p>The class domus.challenge.entity.ActorDto is a dto class that represents a actor.</p>
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
public class ActorDto {


    // Private fields definition.
    // Id Actor.
    private Long id;

    // Name actor.
    private String name;

    // Last name actor.
    private String lastName;

    // List of movies.
    private List<MovieEntity> movies;
}