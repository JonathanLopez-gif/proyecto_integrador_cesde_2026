package co.edu.cesde.ga.exceptions;

public class UserException extends RuntimeException {

    public UserException(Long userId) {
        super("Usuario con id " + userId + " no encontrado");
    }

    public UserException(String message) {
        super(message);
    }

}