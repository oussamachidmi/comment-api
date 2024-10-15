package com.example.commentapi.models;



public class CommentRequest {
    private String comment;

    // Constructor
    public CommentRequest() {}

    public CommentRequest(String comment) {
        this.comment = comment;
    }

    // Getters and Setters
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}