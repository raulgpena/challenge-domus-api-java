/*
 * @(#ChallengeApplication.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge;


// Package imports from jdk 21.
import java.time.LocalDate;

// Package imports from spring framework
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

// Package imports from domus.challenge.config
import domus.challenge.config.DomusBaseConfig;

// Package imports from lombok
import lombok.extern.slf4j.Slf4j;


/**
 *
 *  <p>The class domus.challenge.ChallengeApplication is a boot class for this application
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Import
 *  @see DomusBaseConfig
 *  @see SpringBootApplication
 *  @see Slf4j
 * */
//@Import({
//        DomusBaseConfig.class
//})
@SpringBootApplication
@Slf4j
public class ChallengeApplication {

    /**
     * <p> The main method is the entry point of the application.
     *
     * @param args command line arguments
     * */
    public static void main(String[] args) {

        // Log the start of the application
        log.info("DOMUS :: Challenge :: Starting application...");
        SpringApplication.run(ChallengeApplication.class, args);
        log.info("DOMUS :: Challenge :: Application Started at {}", LocalDate.now());
    }
}