/*
 * @(#DirectorRepository.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.repository;


// Package imports from jdk 21.
import java.util.List;

// Package imports from spring framework
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// Package imports from domus.challenge.entity
import domus.challenge.entity.DirectorEntity;
import domus.challenge.model.DirectorDto;


/**
 *
 *  <p>The class domus.challenge.repository.DirectorRepository is a repository interface that extends JpaRepository</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Repository
 *  @see JpaRepository
 *  @see DirectorEntity
 * */
@Repository
public interface DirectorRepository extends JpaRepository<DirectorEntity, Long> {


    // Query methods can be defined here if needed
    /**
     *  <p>Method to find directors with more than a specified number of movies</p>
     *
     *  @param movieCount the minimum number of movies a director should have
     *  @return List of directors.
     *
     *  @see Query
     *  @see Param
     *  @see DirectorEntity
     *  @see DirectorDto
     * */
    @Query("SELECT new domus.challenge.model.DirectorDto(d.name, d.lastName) " +
            "FROM DirectorEntity d " +
            "WHERE SIZE(d.movies) > :movieCount ORDER BY d.name ASC")
    List<DirectorDto> findDirectorsWithMoreThanNMovies(@Param("movieCount") int movieCount);
}