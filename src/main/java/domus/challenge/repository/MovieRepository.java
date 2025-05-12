/*
 * @(#MovieRepository.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.repository;


// Package imports from spring framework
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Package imports from domus.challenge.entity
import domus.challenge.entity.MovieEntity;


/**
 *
 *  <p>The class domus.challenge.repository.MovieRepository is a repository interface that extends JpaRepository</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Repository
 *  @see MovieEntity
 * */
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    // Query methods can be defined here if needed
}