package com.angelmishra.portfolio.controller;

import com.angelmishra.portfolio.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<ApiResponse<Map<String, Object>>> getHealth() {
        Map<String, Object> healthInfo = Map.of(
            "status", "UP",
            "service", "angel-mishra-portfolio-backend",
            "environment", "production-ready",
            "jvmVersion", Runtime.version().toString(),
            "serverTime", LocalDateTime.now()
        );
        return ResponseEntity.ok(ApiResponse.ok("Service healthy and running", healthInfo));
    }
}
