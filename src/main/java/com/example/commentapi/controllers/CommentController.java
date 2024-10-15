package com.example.commentapi.controllers;

import com.example.commentapi.models.CommentRequest;
import com.example.commentapi.models.CommentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CommentController {

    @PostMapping("/humorize")
    public CommentResponse humorizeComment(@RequestBody CommentRequest request) {
        // Here we would send the comment to an AI model
        String humorizedComment = generateHumor(request.getComment());

        return new CommentResponse(humorizedComment);
    }

    private String generateHumor(String comment) {
        // This is a placeholder for AI logic, replace with actual model integration
        // For now, let's just return a simple transformation
        return "Humorized version of: " + comment + ". You rock!";
    }
}
