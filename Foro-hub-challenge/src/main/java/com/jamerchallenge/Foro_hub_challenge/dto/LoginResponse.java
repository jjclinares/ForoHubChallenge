package com.jamerchallenge.Foro_hub_challenge.dto;


public class LoginResponse {

    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

    // Getter
    public String getToken() {
        return token;
    }

    // Setter (opcional, si no es inmutable)
    public void setToken(String token) {
        this.token = token;
    }
}
