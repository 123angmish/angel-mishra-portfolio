package com.angelmishra.portfolio.model;

import java.util.Map;

public record ProfileInfo(
    String name,
    String eyebrow,
    String headline,
    String intro,
    String email,
    String githubUrl,
    String linkedinUrl,
    String resumeUrl,
    String location,
    Map<String, String> facts
) {}
