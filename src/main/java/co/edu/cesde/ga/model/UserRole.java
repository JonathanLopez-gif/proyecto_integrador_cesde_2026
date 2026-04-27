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
        this.userId = userId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}
