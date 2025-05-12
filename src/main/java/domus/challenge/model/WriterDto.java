/*
 * @(#WriterDto.java 05/10/2025
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
 *  <p>The class domus.challenge.entity.WriterDto is a dto class that represents a writer dto.</p>
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
public class WriterDto {

    // Private fields definition.
    // Id writer.
    private Long id;

    // Writer name.
    private String name;

    // Writer last name.
    private String lastName;
}