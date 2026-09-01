package com.angelmishra.portfolio.controller;

import com.angelmishra.portfolio.dto.ApiResponse;
import com.angelmishra.portfolio.dto.ContactRequest;
import com.angelmishra.portfolio.model.ContactMessage;
import com.angelmishra.portfolio.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<?>> submitMessage(@Valid @RequestBody ContactRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String firstError = bindingResult.getAllErrors().getFirst().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.error(firstError));
        }

        ContactMessage saved = contactService.processContactMessage(request);
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(ApiResponse.ok("Thank you! Your message has been received.", saved));
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<ContactMessage>>> getAllMessages() {
        return ResponseEntity.ok(ApiResponse.ok(contactService.getAllMessages()));
    }
}
