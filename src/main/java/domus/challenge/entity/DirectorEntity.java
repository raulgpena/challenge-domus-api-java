/*
 * @(#DirectorEntity.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.entity;


// Package imports from jdk 21.
import java.util.List;

// Package imports from jakarta
import jakarta.persistence.*;

// Package imports from lombok.
import lombok.*;


/**
 *
 *  <p>The class domus.challenge.entity.DirectorEntity is a data class that represents a director entity</p>
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
@Table(name = "directors")
@Entity
public class DirectorEntity {

    // Private fields definition.
    // Id director.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_director", nullable = false, unique = true)
    private Long id;

    // Name director.
    @Column(name = "name_director", nullable = false, length = 50)
    private String name;

    // Last name director.
    @Column(name = "last_name_director", nullable = false, length = 50)
    private String lastName;

    // List of movies.
    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MovieEntity> movies;
}