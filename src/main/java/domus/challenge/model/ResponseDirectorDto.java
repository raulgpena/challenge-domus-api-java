/*
 * @(#ResponseDirectorDto.java 05/10/2025
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


/**
 *
 *  <p>The class domus.challenge.entity.ResponseDirectorDto is a dto class that represents a director list.</p>
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
public class ResponseDirectorDto {

    // List of movies.
    private List<String> directors;
}