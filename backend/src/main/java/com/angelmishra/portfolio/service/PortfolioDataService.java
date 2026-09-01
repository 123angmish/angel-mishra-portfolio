package com.angelmishra.portfolio.service;

import com.angelmishra.portfolio.dto.PortfolioDataResponse;
import com.angelmishra.portfolio.model.Achievement;
import com.angelmishra.portfolio.model.ExperienceItem;
import com.angelmishra.portfolio.model.ProfileInfo;
import com.angelmishra.portfolio.model.Project;
import com.angelmishra.portfolio.model.SkillCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PortfolioDataService {

    private final ProfileInfo profile = new ProfileInfo(
        "Angel Mishra",
        "Java backend developer · Full-stack engineer",
        "I build secure systems that hold up under pressure.",
        "I’m Angel Mishra, an ECE undergraduate turning real-world problems into robust Spring Boot APIs and thoughtful React experiences.",
        "angelmishraofficial@gmail.com",
        "https://github.com/123angmish",
        "https://www.linkedin.com/in/angel-mishra-992474345/",
        "/Angel-Mishra-Resume.pdf",
        "Rajasthan, India",
        Map.of(
            "gradYear", "2027",
            "hackathons", "3x",
            "research", "NIT KKR"
        )
    );

    private final List<Project> projects = List.of(
        new Project(
            "01",
            "CampusShare",
            "Java · Flagship",
            "A peer-to-peer campus marketplace engineered for safe rentals, purchases and physical handovers inside a university ecosystem.",
            List.of("Concurrency-safe booking", "Idempotent Razorpay webhooks", "Rotating refresh tokens"),
            "Java 21 · Spring Boot · React 19 · PostgreSQL · Spring Security",
            "https://github.com/123angmish/campus-share-project-",
            "#b6ff6c"
        ),
        new Project(
            "02",
            "HireVia",
            "Java · Full Stack",
            "A recruitment and applicant tracking platform connecting candidates and employers through secure messaging and an end-to-end hiring workflow.",
            List.of("Role-based API boundaries", "Server-side IDOR protection", "Live ATS pipeline"),
            "Java 21 · Spring Boot · React · Redux · PostgreSQL · JWT",
            "https://github.com/123angmish/hire-via-job-portal",
            "#89a8ff"
        ),
        new Project(
            "03",
            "AI Virality Predictor",
            "ML · NIT Internship",
            "A multimodal video-intelligence platform that evaluates short-form video pacing and engagement potential using computer vision, audio processing and regression.",
            List.of("R² 0.8824 selected baseline", "0–3s optical-flow hook analysis", "Five-model benchmark comparison"),
            "Python · FastAPI · OpenCV · Librosa · Scikit-learn · Next.js",
            "https://github.com/123angmish/ai-virality-predictor",
            "#ffb45c"
        ),
        new Project(
            "04",
            "FloodGuard AI",
            "Computer Vision · FYP",
            "A real-time flood monitoring prototype combining scene classification, surface-motion analysis and location-scoped alerts.",
            List.of("MobileNetV2 classifier", "Lucas–Kanade optical flow", "WebSocket telemetry"),
            "Python · FastAPI · TensorFlow · OpenCV · SQLite · WebSockets",
            "https://github.com/123angmish/floodguard-ai",
            "#54d6ff"
        ),
        new Project(
            "05",
            "Cooknetic AI",
            "Java · AI Integration",
            "A smart kitchen companion combining a Spring Boot backend with Gemini multimodal AI for ingredient recognition, meal planning and zero-waste recipes.",
            List.of("Multimodal fridge scanner", "14+ REST endpoints", "Voice and nutrition workflows"),
            "Java · Spring Boot · Maven · Gemini API · Web Speech API",
            "https://github.com/123angmish/Cooknetic-AI",
            "#ff8fa3"
        ),
        new Project(
            "06",
            "BreakChain AI",
            "Java · Applied AI",
            "An empathetic wellbeing platform with AI-assisted reflection, recovery tools, voice journaling and crisis-resource routing.",
            List.of("Multi-model AI support", "Java REST backend", "13 interactive support tools"),
            "Java · Maven · Gemini · OpenAI · Web Audio API",
            "https://github.com/123angmish/breakchain-AI",
            "#c39bff"
        )
    );

    private final List<Achievement> achievements = List.of(
        new Achievement("OSS", "GSSoC Contributor", "GirlScript Summer of Code", "Open-source contribution and collaborative development"),
        new Achievement("WEB3", "SheFi Participant", "SheFi learning community", "Web3 learning, community and emerging-technology exposure"),
        new Achievement("01", "First Runner-Up", "HackVerse 2025 · Banasthali Vidyapith", "Hackathon recognition"),
        new Achievement("02", "Second Place", "Triwizardathon 1.0 · MLSA GLA Chapter", "Technical competition recognition"),
        new Achievement("AI", "Research Intern", "NIT Kurukshetra · 2026", "Machine learning and computer-vision research"),
        new Achievement("HX", "HackIndia Participant", "HackIndia 2025", "Web3 and AI hackathon")
    );

    private final List<SkillCategory> skills = List.of(
        new SkillCategory("01", "Backend", "Java 21, Spring Boot, Spring Security, Spring Data JPA, Hibernate, REST APIs"),
        new SkillCategory("02", "Frontend", "React.js, Redux Toolkit, JavaScript, Tailwind CSS, accessible responsive UI"),
        new SkillCategory("03", "Data & delivery", "PostgreSQL, MySQL, Flyway, Docker, Maven, Git, GitHub, Postman"),
        new SkillCategory("04", "Security", "JWT, BCrypt, RBAC, ownership validation, rate limiting, secure payments"),
        new SkillCategory("05", "ML & vision", "Scikit-learn, TensorFlow, OpenCV, MobileNetV2, optical flow, regression and model evaluation")
    );

    private final List<ExperienceItem> experience = List.of(
        new ExperienceItem(
            "May — Jul 2026",
            "Research Intern",
            "· NIT Kurukshetra",
            "Developed the research prototype behind AI Virality Predictor, combining multimodal feature engineering with a reproducible machine-learning evaluation pipeline.",
            List.of(
                "OpenCV optical-flow analysis for motion and 0–3 second hook intensity",
                "Scene-change, pacing, brightness, contrast and visual feature extraction",
                "Librosa RMS audio-energy and acoustic peak analysis",
                "Compared Linear, Ridge, Gradient Boosting, HistGradientBoosting and Random Forest regressors",
                "Selected Linear Regression at R² 0.8824, RMSE 4.5194 and MAE 3.7105 on the documented benchmark",
                "Added inference, recommendations, history, visualizations and automated PDF reporting"
            )
        ),
        new ExperienceItem(
            "2023 — 2027",
            "B.Tech, Electronics & Communication",
            "· Banasthali Vidyapith",
            "Bridging core engineering with backend development, computer science fundamentals and applied machine learning.",
            List.of()
        ),
        new ExperienceItem(
            "2024 — 2026",
            "NSS Volunteer",
            "",
            "Contributed to community outreach, awareness campaigns and collaborative social initiatives.",
            List.of()
        )
    );

    public PortfolioDataResponse getAllPortfolioData() {
        return new PortfolioDataResponse(profile, projects, achievements, skills, experience);
    }

    public ProfileInfo getProfile() {
        return profile;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public List<SkillCategory> getSkills() {
        return skills;
    }

    public List<ExperienceItem> getExperience() {
        return experience;
    }
}
