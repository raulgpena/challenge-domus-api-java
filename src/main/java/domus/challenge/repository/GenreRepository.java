/*
 * @(#GenreRepository.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.repository;


// Package imports from spring framework
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Package imports from project
import domus.challenge.entity.GenreEntity;


/**
 *
 *  <p>The class domus.challenge.repository.GenreRepository is a repository interface that extends JpaRepository</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Repository
 *  @see GenreEntity
 * */
@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {

    // CRaul Penaom query methods can be defined here if needed
}