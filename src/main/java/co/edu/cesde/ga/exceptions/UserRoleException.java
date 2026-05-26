package co.edu.cesde.ga.exceptions;

public class UserRoleException extends RuntimeException {

    public UserRoleException(Long roleId) { super("Rol de usuario no existe"); }

    public UserRoleException(String message) { super(message); }

}
