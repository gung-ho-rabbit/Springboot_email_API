package com.Lordesate.email_api.service;

import com.Lordesate.email_api.User;
import com.Lordesate.email_api.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    public User saveUser(User user) {
        // Save user to the database
        User savedUser = userRepository.save(user);

        // Send confirmation email
        String subject = "Registration Successful";
        String body = "Hi " + user.getName() + ",\n\nThank you for registering! Your data has been received.\n\nRegards,\nEmail App Team";

        emailService.sendEmail(user.getEmail(), subject, body);

        return savedUser;
    }

    // Other methods...
}
