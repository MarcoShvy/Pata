package com.adoption.pata.model.user;

public record RegisterDTO(String name, String email, String password, UserRole role) {
}
