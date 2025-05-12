/*
 * @(#MovieEntity.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.entity;


// Package imports from jdk 21
import java.time.LocalDate;
import java.util.List;

// Package imports from jakarta
import jakarta.persistence.*;

// Package imports from lombok.
import lombok.*;


/**
 *
 *  <p>The class domus.challenge.entity.MovieEntity is a data class that represents a movie entity</p>
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
@Table(name = "movies")
@Entity
public class MovieEntity {

    // Private fields definition.
    // Id movie.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie", nullable = false, unique = true)
    private Long id;

    // Title movie.
    @Column(name = "title_movie", nullable = false, length = 100)
    private String title;

    // Year movie release.
    @Column(name = "year_movie", nullable = false)
    private int year;

    // Rating movie.
    @Column(name = "rated_movie", nullable = false, length = 50)
    private String rated;

    // Release date movie.
    @Column(name = "release_movie", nullable = false)
    private LocalDate release;

    // Duration movie.
    @Column(name = "runtime_movie", nullable = false)
    private int runtime;

    // Genre movie.
    @ManyToOne
    @JoinColumn(name = "id_genre", nullable = false)
    private GenreEntity genre;

    // Director movie.
    @ManyToOne
    @JoinColumn(name = "id_director", nullable = false)
    private DirectorEntity director;

    // Writer movie.
    @ManyToOne
    @JoinColumn(name = "id_writer", nullable = false)
    private WriterEntity writer;

    // Actors list.
    @ManyToMany
    @JoinTable(
            name = "movie_actors",
            joinColumns = @JoinColumn(name = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_actor")
    )
    private List<ActorEntity> actors;
}