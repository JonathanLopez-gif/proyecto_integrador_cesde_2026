package co.edu.cesde.ga.model;

import java.time.LocalDate;

public class User {

    // Atributos
    private Long userId;
    private String userName;
    private String email;
    private String passwordHash;
    private String status;
    private LocalDate createdAt;

    // Constructor vacío
    public User() {
    }

    // Constructor lleno
    public User(Long userId, String userName, String email, String passwordHash, String status, LocalDate createdAt) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Métodos de acceso
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

}
