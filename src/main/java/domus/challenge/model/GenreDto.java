/*
 * @(#GenreDto.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.model;


// Package imports from lombok.
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 *  <p>The class domus.challenge.entity.GenreDto is a dto class that represents a genre dto.</p>
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
public class GenreDto {

    // Private fields definition.
    // Id genre.
    private Long id;

    // Name genre.
    private String name;

    // Description genre.
    private String description;
}