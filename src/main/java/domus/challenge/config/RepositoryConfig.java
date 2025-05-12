/*
 * @(#RepositoryConfig.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.config;


// Package imports from spring framework
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 *
 *  <p>The class domus.challenge.config.RepositoryConfig is a spring configuration class that enables JPA repositories.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Configuration
 *  @see EnableJpaRepositories
 *  @see EntityScan
 * */
@Configuration
//@EntityScan(basePackages = "domus.challenge.entity")
//@EnableJpaRepositories(basePackages = {"domus.challenge.repository"})
public class RepositoryConfig { }