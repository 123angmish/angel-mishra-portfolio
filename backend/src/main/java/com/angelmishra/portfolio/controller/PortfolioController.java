package com.angelmishra.portfolio.controller;

import com.angelmishra.portfolio.dto.ApiResponse;
import com.angelmishra.portfolio.dto.PortfolioDataResponse;
import com.angelmishra.portfolio.model.Achievement;
import com.angelmishra.portfolio.model.ExperienceItem;
import com.angelmishra.portfolio.model.ProfileInfo;
import com.angelmishra.portfolio.model.Project;
import com.angelmishra.portfolio.model.SkillCategory;
import com.angelmishra.portfolio.service.PortfolioDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
public class PortfolioController {

    private final PortfolioDataService portfolioService;

    public PortfolioController(PortfolioDataService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<PortfolioDataResponse>> getAllData() {
        return ResponseEntity.ok(ApiResponse.ok("Portfolio data loaded successfully", portfolioService.getAllPortfolioData()));
    }

    @GetMapping("/profile")
    public ResponseEntity<ApiResponse<ProfileInfo>> getProfile() {
        return ResponseEntity.ok(ApiResponse.ok(portfolioService.getProfile()));
    }

    @GetMapping("/projects")
    public ResponseEntity<ApiResponse<List<Project>>> getProjects() {
        return ResponseEntity.ok(ApiResponse.ok(portfolioService.getProjects()));
    }

    @GetMapping("/achievements")
    public ResponseEntity<ApiResponse<List<Achievement>>> getAchievements() {
        return ResponseEntity.ok(ApiResponse.ok(portfolioService.getAchievements()));
    }

    @GetMapping("/skills")
    public ResponseEntity<ApiResponse<List<SkillCategory>>> getSkills() {
        return ResponseEntity.ok(ApiResponse.ok(portfolioService.getSkills()));
    }

    @GetMapping("/experience")
    public ResponseEntity<ApiResponse<List<ExperienceItem>>> getExperience() {
        return ResponseEntity.ok(ApiResponse.ok(portfolioService.getExperience()));
    }
}
