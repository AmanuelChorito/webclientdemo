package com.example.webclientdemo.controller;

import com.example.webclientdemo.dto.Book;
import com.example.webclientdemo.dto.ISBN0201558025;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class LibraryWebController {



    @GetMapping("/books")
    public Book getTweetsBlocking() {
        final String uri = getSlowServiceUri();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Book> response = restTemplate.exchange(
                uri, HttpMethod.GET, null,
                new ParameterizedTypeReference<Book>() {
                });

        Book result = response.getBody();
        return result;
    }



    private String getSlowServiceUri() {
        return "https://openlibrary.org/api/books?bibkeys=ISBN:0201558025,LCCN:93005405&format=json";
    }
}
