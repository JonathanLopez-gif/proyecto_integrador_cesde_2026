package co.edu.cesde.ga.model;

public class UserRole {

    // Atributos
    private Long userId;
    private Long rolId;

    // Constructor vacío
    public UserRole() {
    }

    // Constructor lleno
    public UserRole(Long userId, Long rolId) {
        this.userId = userId;
        this.rolId = rolId;
    }

    // Métodos de acceso

    public Long getUserId() {
        return userId;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

}
