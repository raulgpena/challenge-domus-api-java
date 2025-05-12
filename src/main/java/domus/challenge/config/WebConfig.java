/*
 * @(#WebConfig.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.config;


// Package imports from spring framework
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 *
 *  <p>The class domus.challenge.config.WebConfig is a spring configuration class that enables web beans.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Configuration
 *  @see ComponentScan
 * */
@Configuration
@ComponentScan(basePackages = {"domus.challenge.controller"})
public class WebConfig { }