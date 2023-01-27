package com.example.demo;

import org.springframework.data.annotation.Id;

public record Student(@Id Long id, String name) {
}
