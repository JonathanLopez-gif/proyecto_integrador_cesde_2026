package co.edu.cesde.ga.model;

import co.edu.cesde.ga.exceptions.UserRoleValidationException;

public class UserRole {

    // Atributos
    private Long userId;
    private Long roleId;

    // Constructor vacío
    public UserRole() {
    }

    // Constructor lleno
    public UserRole(Long userId, Long roleId) {

        setUserId(userId);
        setRoleId(roleId);

    }

    // Métodos de acceso

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        if (userId == null) {
            throw new UserRoleValidationException("Usuario con ID " + userId + " no encontrado");
        }
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        if (roleId == null) {
            throw new UserRoleValidationException(roleId);
        }
        this.roleId = roleId;
    }

}
