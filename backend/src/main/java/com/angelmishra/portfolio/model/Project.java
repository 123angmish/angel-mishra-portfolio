package com.angelmishra.portfolio.model;

import java.util.List;

public record Project(
    String num,
    String name,
    String type,
    String copy,
    List<String> points,
    String stack,
    String href,
    String accent
) {}
