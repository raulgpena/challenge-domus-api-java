/*
 * @(#OpenApiConfig.java 05/10/2025
 * Copyright 2025 Raul Pena, Inc. All rights reserved.
 * RAUL PEÑA/CONFIDENTIAL
 * */

package domus.challenge.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 *  <p>The class domus.challenge.config.OpenApiConfig is a spring configuration base for open api setup.</p>
 *
 *  @author Raul Pena (raul.pena@gmail.com)
 *  @version 1.0
 *  @since jdk 21
 *  @see Configuration
 * */
@Configuration
public class OpenApiConfig {

    /**
     * Configures the OpenAPI documentation with custom metadata.
     *
     * @return an OpenAPI instance with the specified configuration.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Domus Challenge API")
                        .description("API documentation for the Domus Challenge project")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Raul Pena")
                                .email("raul.pena@gmail.com")
                                .url("https://www.raulpena.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}