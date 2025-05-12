/*
 * @(#DomusBaseConfig.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.config;


// Package imports from spring framework
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 *
 *  <p>The class domus.challenge.config.DomusBaseConfig is a spring configuration base for this application.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Configuration
 *  @see Import
 *  @see RepositoryConfig
 *  @see ServiceConfig
 *  @see WebConfig
 *  @see ComponentScan
 * */
@Configuration
@Import({
        RepositoryConfig.class,
        ServiceConfig.class,
        WebConfig.class,
        OpenApiConfig.class
})
public class DomusBaseConfig { }