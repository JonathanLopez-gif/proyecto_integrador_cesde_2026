package co.edu.cesde.ga.exceptions;

public class TeacherValidationException extends RuntimeException {

    public TeacherValidationException(Long teacherId) {
        super("Maestro con id " + teacherId + " no encontrado");
    }

    public TeacherValidationException(String message) {
        super(message);
    }

}