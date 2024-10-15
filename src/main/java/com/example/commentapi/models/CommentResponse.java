package com.example.commentapi.models;


public class CommentResponse {
    private String humorizedComment;

    // Constructor
    public CommentResponse() {}

    public CommentResponse(String humorizedComment) {
        this.humorizedComment = humorizedComment;
    }

    // Getter
    public String getHumorizedComment() {
        return humorizedComment;
    }

    public void setHumorizedComment(String humorizedComment) {
        this.humorizedComment = humorizedComment;
    }
}