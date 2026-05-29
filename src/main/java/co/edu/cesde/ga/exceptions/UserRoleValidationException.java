package co.edu.cesde.ga.exceptions;

public class UserRoleValidationException extends RuntimeException {

    public UserRoleValidationException(Long roleId) {
        super("Rol de usuario " + roleId + " no encontrado");
    }

    public UserRoleValidationException(String message) {
        super(message);
    }

}