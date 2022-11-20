package com.example.webclientdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Book {
    @JsonProperty("ISBN:0201558025")
    private ISBN0201558025 isbn0201558025;
    @JsonProperty("LCCN:93005405")
    private LCCN93005405 lccn93005405;
}
