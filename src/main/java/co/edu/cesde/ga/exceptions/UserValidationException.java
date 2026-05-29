package co.edu.cesde.ga.exceptions;

public class UserValidationException extends RuntimeException {

    public UserValidationException(Long userId) {
        super("Usuario con id " + userId + " no encontrado");
    }

    public UserValidationException(String message) {
        super(message);
    }

}