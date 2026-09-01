import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Angel Mishra | Java Backend Developer",
  description: "Portfolio of Angel Mishra — Java, Spring Boot and React developer building secure, production-minded software.",
  icons: {
    icon: "/favicon.svg",
    shortcut: "/favicon.svg",
  },
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className="antialiased">{children}</body>
    </html>
  );
}
