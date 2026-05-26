package co.edu.cesde.ga.exceptions;

public class TeacherException extends RuntimeException {

    public TeacherException(Long teacherId) { super("Maestro no encontrado"); }

    public TeacherException(String message) { super(message); }

}
