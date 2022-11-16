package com.example.webclientdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tweet {
    private String text;

    public Tweet(String text, String username) {
        this.text = text;
        this.username = username;
    }

    private String username;
}