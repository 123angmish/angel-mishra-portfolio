package com.angelmishra.portfolio.model;

import java.util.List;

public record ExperienceItem(
    String period,
    String role,
    String organization,
    String description,
    List<String> highlights
) {}
