package com.angelmishra.portfolio.service;

import com.angelmishra.portfolio.dto.ContactRequest;
import com.angelmishra.portfolio.model.ContactMessage;
import com.angelmishra.portfolio.repository.ContactMessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContactService {

    private static final Logger log = LoggerFactory.getLogger(ContactService.class);
    private final ContactMessageRepository repository;

    public ContactService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public ContactMessage processContactMessage(ContactRequest request) {
        log.info("Processing contact inquiry from: {} <{}>", request.name(), request.email());

        ContactMessage message = new ContactMessage(
            request.name().trim(),
            request.email().trim(),
            request.subject() != null ? request.subject().trim() : "Portfolio Contact",
            request.message().trim()
        );

        ContactMessage saved = repository.save(message);
        log.info("Contact message id={} saved successfully into database.", saved.getId());
        return saved;
    }

    public List<ContactMessage> getAllMessages() {
        return repository.findAllByOrderByCreatedAtDesc();
    }
}
