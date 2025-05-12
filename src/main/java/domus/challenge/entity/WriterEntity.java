/*
 * @(#WriterEntity.java 05/10/2025
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
 *  <p>The class domus.challenge.entity.WriterEntity is a data class that represents a writer entity</p>
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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "writers")
@Entity
public class WriterEntity {

    // Private fields definition.
    // Id writer.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_writer", nullable = false, unique = true)
    private Long id;

    // Writer name.
    @Column(name = "name_writer", nullable = false, length = 50)
    private String name;

    // Writer last name.
    @Column(name = "last_name_writer", nullable = false, length = 50)
    private String lastName;
}