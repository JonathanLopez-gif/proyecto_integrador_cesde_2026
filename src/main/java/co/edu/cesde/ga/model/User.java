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
        if (userId == null) {
            throw new NullPointerException("El ID del usuario es obligatorio");
        }
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del usuario es obligatorio");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email del usuario es obligatorio");
        }
        if (passwordHash == null || passwordHash.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña del usuario es obligatoria");
        }
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado del usuario es obligatorio");
        }
        if (createdAt == null) {
            throw new NullPointerException("La fecha de creación del usuario no puede ser nula");
        }
        if (createdAt.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("No puede ingresar una fecha futura");
        }
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
        if (userId == null) {
            throw new NullPointerException("El ID del usuario es obligatorio");
        }
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null) {
            throw new NullPointerException("El nombre del usuario no puede ser nulo");
        }
        if (userName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del usuario no puede estar vacío");
        }
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new NullPointerException("El email del usuario no puede ser nulo");
        }
        if (email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email del usuario no puede estar vacío");
        }
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        if (passwordHash == null) {
            throw new NullPointerException("La contraseña no puede ser nula");
        }
        if (passwordHash.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        }
        this.passwordHash = passwordHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null) {
            throw new NullPointerException("El estado del usuario no puede ser nulo");
        }
        if (status.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado del usuario no puede estar vacío");
        }
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        if (createdAt == null) {
            throw new NullPointerException("La fecha de creación del usuario no puede ser nula");
        }
        if (createdAt.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("No puede ingresar una fecha futura");
        }
        this.createdAt = createdAt;
    }

}
