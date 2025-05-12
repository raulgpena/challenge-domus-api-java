/*
 * @(#GenreEntity.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.entity;


// Package imports from jakarta
import jakarta.persistence.*;

// Package imports from lombok.
import lombok.*;


/**
 *
 *  <p>The class domus.challenge.entity.GenreEntity is a data class that represents a genre entity</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Getter
 *  @see Setter
 *  @see AllArgsConstructor
 *  @see NoArgsConstructor
 *  @see Table
 *  @see Entity
 * */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "genres")
@Entity
public class GenreEntity {

    // Private fields definition.
    // Id genre.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genre", nullable = false, unique = true)
    private Long id;

    // Name genre.
    @Column(name = "name_genre", nullable = false, length = 50)
    private String name;

    // Description genre.
    @Column(name = "description_genre", nullable = false, length = 50)
    private String description;
}