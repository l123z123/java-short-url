package com.lzl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
    @GetMapping("/shorten")
    public String shorten(@RequestParam String longUrl) {
        String shortCode = longUrl.substring(0, Math.min(6, longUrl.length())).toUpperCase();
        return "https://su.com/" + shortCode;
    }
}