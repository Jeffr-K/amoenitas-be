package com.annonymous.ttaleum.infrastructure.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
  info = @Info(
    title = "TTALEUM API Specification",
    description = "API Specification",
    version = "v1"
  )
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

  @Bean
  public GroupedOpenApi chatOpenApi() {
    String[] paths = {"/v3/api-docs/**"};

    return GroupedOpenApi.builder()
      .group("TTALEUM V1")
      .pathsToMatch(paths)
      .build();
  }
}
