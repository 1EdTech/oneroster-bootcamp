package org.oneedtech.oneroster.bootcamp;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Resource Server Security Configuration This configuration class sets up the security filter
 * chains for the resource server.
 */
@Configuration
@EnableWebSecurity
public class ResourceServerSecurityConfig {
  /**
   * Require authorization for all requests to "/ims/**" and scope "articles.read"
   *
   * @param http
   * @return
   * @throws Exception
   */
  @Bean
  @Order(1)
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.securityMatcher("/ims/**")
      .authorizeHttpRequests(authorize -> authorize
        .requestMatchers("/ims/oneroster/rostering/v1p2/discovery/imsorv1p2_rostering_openapi3_v1p0.json").permitAll()
        .anyRequest()
        .hasAnyAuthority(
          "SCOPE_https://purl.imsglobal.org/spec/or/v1p2/scope/roster-core.readonly",
          "SCOPE_https://purl.imsglobal.org/spec/or/v1p2/scope/roster.readonly",
          "SCOPE_https://purl.imsglobal.org/spec/or/v1p2/scope/roster-demographics.readonly"))
      .oauth2ResourceServer(oauth2 -> oauth2.jwt(withDefaults()));
    return http.build();
  }
}
