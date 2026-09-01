package com.angelmishra.portfolio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContactRequest(
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    String name,

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Please provide a valid email address")
    String email,

    String subject,

    @NotBlank(message = "Message cannot be blank")
    @Size(min = 10, max = 2000, message = "Message must be between 10 and 2000 characters")
    String message
) {}
