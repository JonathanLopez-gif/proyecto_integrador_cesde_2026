package co.edu.cesde.am.domain.model;

import co.edu.cesde.am.domain.exception.UserValidationException;

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

    public User(Long userId, String userName, String email,
                String passwordHash, String status, LocalDate createdAt) {

        setUserId(userId);
        setUserName(userName);
        setEmail(email);
        setPasswordHash(passwordHash);
        setStatus(status);
        setCreatedAt(createdAt);
    }

    // Métodos de acceso
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        if (userId == null) {
            throw new UserValidationException(userId);
        }
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new UserValidationException("El nombre del usuario es obligatorio");
        }
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new UserValidationException("El email del usuario  es obligatorio");
        }
        if (!email.contains("@")) {
            throw new UserValidationException("Email inválido");
        }
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        if (passwordHash == null ||  passwordHash.trim().isEmpty()) {
            throw new UserValidationException("La contraseña es obligatoria");
        }
        if (passwordHash.length() < 8) {
            throw new UserValidationException("La contraseña debe tener mínimo 8 caracteres");
        }
        this.passwordHash = passwordHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new UserValidationException("El estado del usuario es obligatorio");
        }
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        if (createdAt == null) {
            throw new UserValidationException("La fecha de creación del usuario es obligatoria");
        }
        if (createdAt.isAfter(LocalDate.now())) {
            throw new UserValidationException("No puede ingresar una fecha futura");
        }
        this.createdAt = createdAt;
    }

}
