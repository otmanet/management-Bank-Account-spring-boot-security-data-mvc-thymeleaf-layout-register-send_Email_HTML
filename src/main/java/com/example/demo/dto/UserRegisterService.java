package com.example.demo.dto;

public class UserRegisterService {
    private String email;
    private String password;
    private boolean enabled;
    private String username;

    public UserRegisterService() {
    }

    public UserRegisterService(String email, String password, boolean enabled, String username) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
