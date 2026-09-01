package com.angelmishra.portfolio.dto;

import com.angelmishra.portfolio.model.Achievement;
import com.angelmishra.portfolio.model.ExperienceItem;
import com.angelmishra.portfolio.model.ProfileInfo;
import com.angelmishra.portfolio.model.Project;
import com.angelmishra.portfolio.model.SkillCategory;
import java.util.List;

public record PortfolioDataResponse(
    ProfileInfo profile,
    List<Project> projects,
    List<Achievement> achievements,
    List<SkillCategory> skills,
    List<ExperienceItem> experience
) {}
