/*
 * @(#ServiceConfig.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.config;


// Package imports from spring framework
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 *
 *  <p>The class domus.challenge.config.ServiceConfig is a spring configuration class that enables services beans.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Configuration
 *  @see ComponentScan
 * */
@Configuration
@ComponentScan(basePackages = {"domus.challenge.service.support"})
public class ServiceConfig { }