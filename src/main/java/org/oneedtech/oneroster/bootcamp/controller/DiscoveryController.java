package org.oneedtech.oneroster.bootcamp.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {
  private static final String OPENAPI_FILE = "oas/onerosterv1p2rostersservice_openapi3_v1p0.json";

  @GetMapping("/1edtech/eduapi/base/v1p0/discovery")
  public ResponseEntity<Resource> getDiscoveryDocument() {
    try {
      ClassPathResource resource = new ClassPathResource(OPENAPI_FILE);

      if (!resource.exists()) {
        return ResponseEntity.notFound().build();
      }

      return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(resource);
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }
}
