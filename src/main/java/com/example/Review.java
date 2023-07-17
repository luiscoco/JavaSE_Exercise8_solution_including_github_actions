package com.example;

public class Review {
    private Person reviewer;
    private String content;
    
    public Review(Person reviewer, String content) {
        this.reviewer = reviewer;
        this.content = content;
    }
    
    public Person getReviewer() {
        return reviewer;
    }
    
    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Reviewer: " + reviewer.getName() + ", Content: " + content;
    }
}

