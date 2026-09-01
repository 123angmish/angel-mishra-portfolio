# Angel Mishra — Developer Portfolio

[![Live Demo](https://img.shields.io/badge/Live_Portfolio-Visit_Website-00C7B7?style=for-the-badge&logo=google-chrome&logoColor=white)](https://123angmish.github.io/angel-mishra-portfolio/)
[![GitHub Pages](https://img.shields.io/badge/Deployed_on-GitHub_Pages-222222?style=for-the-badge&logo=github&logoColor=white)](https://123angmish.github.io/angel-mishra-portfolio/)
[![Next.js](https://img.shields.io/badge/Next.js_16-000000?style=for-the-badge&logo=nextdotjs&logoColor=white)](https://nextjs.org/)
[![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-38B2AC?style=for-the-badge&logo=tailwind-css&logoColor=white)](https://tailwindcss.com/)
[![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white)](https://www.typescriptlang.org/)

Personal developer portfolio website showcasing engineering projects, research, technical skills, and experience.

🌐 **Live Website**: [https://123angmish.github.io/angel-mishra-portfolio/](https://123angmish.github.io/angel-mishra-portfolio/)  
👤 **Portfolio of**: Angel Mishra  
💼 **Specialization**: Java Backend Development · Full-Stack Engineering · Machine Learning

---

## 🚀 Tech Stack

### Backend
- **Language**: Java 21 / 25
- **Framework**: Spring Boot 3.4.x (Spring Web, Spring Data JPA, Jakarta Validation)
- **Database**: H2 In-Memory Database (Persistent Console at `/h2-console`)
- **Build Tool**: Maven 3.9+

### Frontend
- **Framework**: [Next.js](https://nextjs.org/) 16 (App Router)
- **UI & Styling**: React 19, Tailwind CSS
- **Language**: TypeScript
- **Hosting**: GitHub Pages (CI/CD) / Standalone Spring Boot Static Hosting

---

## 📡 REST API Endpoints (Java Spring Boot)

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/v1/health` | Service health status & JVM runtime telemetry |
| `GET` | `/api/v1/portfolio` | Full portfolio aggregated payload |
| `GET` | `/api/v1/portfolio/profile` | Developer bio, social links & headline |
| `GET` | `/api/v1/portfolio/projects` | List of featured software projects |
| `GET` | `/api/v1/portfolio/skills` | Categorized technical skills matrix |
| `GET` | `/api/v1/portfolio/achievements` | Recognition & competition milestones |
| `POST` | `/api/v1/contact` | Validated contact form submission & message inbox |
| `GET` | `/api/v1/contact/all` | View received contact inquiries |

---

## 💻 Running the Full-Stack Application Locally

### 1. Start the Java Spring Boot Backend
```bash
cd backend
mvn spring-boot:run
```
*The Spring Boot REST API will start on `http://localhost:8080`.*  
*H2 Database console is accessible at `http://localhost:8080/h2-console`.*

### 2. Start the React Frontend
```bash
# In the root directory
npm install
npm run dev
```
*The frontend will run on `http://localhost:3000` and automatically communicate with the Spring Boot backend.*

---

## 📬 Contact & Connect

- **Email**: [angelmishraofficial@gmail.com](mailto:angelmishraofficial@gmail.com)
- **GitHub**: [@123angmish](https://github.com/123angmish)
- **LinkedIn**: [Angel Mishra](https://www.linkedin.com/in/angel-mishra-992474345/)
