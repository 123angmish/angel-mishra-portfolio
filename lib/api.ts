export interface ProjectItem {
  num: string;
  name: string;
  type: string;
  copy: string;
  points: string[];
  stack: string;
  href: string;
  accent: string;
}

export interface AchievementItem {
  code: string;
  title: string;
  org: string;
  note: string;
}

export interface SkillCategoryItem {
  num: string;
  category: string;
  details: string;
}

export interface ExperienceItemData {
  period: string;
  role: string;
  organization: string;
  description: string;
  highlights: string[];
}

export interface ProfileInfoData {
  name: string;
  eyebrow: string;
  headline: string;
  intro: string;
  email: string;
  githubUrl: string;
  linkedinUrl: string;
  resumeUrl: string;
  location: string;
  facts?: Record<string, string>;
}

export interface PortfolioData {
  profile: ProfileInfoData;
  projects: ProjectItem[];
  achievements: AchievementItem[];
  skills: SkillCategoryItem[];
  experience: ExperienceItemData[];
}

export interface ContactPayload {
  name: string;
  email: string;
  subject?: string;
  message: string;
}

const API_BASE_URL =
  process.env.NEXT_PUBLIC_API_URL || "http://localhost:8080/api/v1";

export async function fetchPortfolioFromBackend(): Promise<PortfolioData | null> {
  try {
    const res = await fetch(`${API_BASE_URL}/portfolio`, {
      method: "GET",
      headers: {
        Accept: "application/json",
      },
      cache: "no-store",
    });

    if (!res.ok) return null;
    const json = await res.json();
    return json.data || null;
  } catch (err) {
    // Graceful fallback when backend is not running locally or when hosted statically
    return null;
  }
}

export async function submitContactToBackend(
  payload: ContactPayload
): Promise<{ success: boolean; message: string }> {
  try {
    const res = await fetch(`${API_BASE_URL}/contact`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
      },
      body: JSON.stringify(payload),
    });

    const json = await res.json();
    if (!res.ok || !json.success) {
      return {
        success: false,
        message: json.message || "Failed to submit message.",
      };
    }

    return {
      success: true,
      message: json.message || "Message sent successfully!",
    };
  } catch (err) {
    return {
      success: false,
      message: "Backend server is currently offline. Please contact via email directly.",
    };
  }
}
