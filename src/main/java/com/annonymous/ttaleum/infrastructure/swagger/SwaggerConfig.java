package com.annonymous.ttaleum.infrastructure.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
  private static final String SECURITY_SCHEME_NAME = "authorization";

  @Bean
  public OpenAPI swagger() {
    return new OpenAPI()
      .components(
        new Components()
          .addSecuritySchemes(
                              SECURITY_SCHEME_NAME,
                              new SecurityScheme()
                                        .name(SECURITY_SCHEME_NAME)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
          )
      )
      .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
      .info(new Info()
            .title("따름 API 명세서")
            .description("따름 Backend API 명세서 입니다.")
            .version("0.1.0")
      );
  }
}
