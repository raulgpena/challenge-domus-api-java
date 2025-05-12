/*
 * @(#ActorEntity.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.entity;


// Package imports from jakarta
import jakarta.persistence.*;

// Package imports from lombok.
import lombok.*;

import java.util.List;


/**
 *
 *  <p>The class domus.challenge.entity.ActorEntity is a data class that represents a actor entity</p>
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
@Table(name = "actors")
@Entity
public class ActorEntity {


    // Private fields definition.
    // Id Actor.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actor", nullable = false, unique = true)
    private Long id;

    // Name actor.
    @Column(name = "name_actor", nullable = false, length = 50)
    private String name;

    // Last name actor.
    @Column(name = "last_name_actor", nullable = false, length = 50)
    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private List<MovieEntity> movies;
}