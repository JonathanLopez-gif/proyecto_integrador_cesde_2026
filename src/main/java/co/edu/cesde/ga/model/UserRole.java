package co.edu.cesde.ga.model;

public class UserRole {

    // Atributos
    private Long userId;
    private Long roleId;

    // Constructor vacío
    public UserRole() {
    }

    // Constructor lleno
    public UserRole(Long userId, Long roleId) {
        if (userId == null) {
            throw new NullPointerException("El ID del usuario es obligatorio");
        }
        if (roleId == null) {
            throw new NullPointerException("El ID del rol del usuario es obligatorio");
        }
        this.userId = userId;
        this.roleId = roleId;
    }

    // Métodos de acceso

    public Long getUserId() {
        return userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setUserId(Long userId) {
        if (userId == null) {
            throw new NullPointerException("El ID del usuario es obligatorio");
        }
        this.userId = userId;
    }

    public void setRoleId(Long roleId) {
        if (roleId == null) {
            throw new NullPointerException("El ID del rol del usuario es obligatorio");
        }
        this.roleId = roleId;
    }

}
