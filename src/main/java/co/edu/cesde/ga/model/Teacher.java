package co.edu.cesde.ga.model;

public class Teacher extends Person {

    // Atributos propios
    private Long teacherId;

    // Constructor vacío
    public Teacher() {
        super();
    }

    // Constructor lleno
    public Teacher(Long teacherId, Long userId, String documentType, String documentNumber,
                   String firstName, String lastName, String status) {
        super(userId, documentType, documentNumber, firstName, lastName, status);
        if (teacherId == null) {
            throw new NullPointerException("El ID del maestro es obligatorio");
        }
        if (userId == null) {
            throw new NullPointerException("El ID del usuario es obligatorio");
        }
        if (documentType == null || documentType.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de documento es obligatorio");
        }
        if (documentNumber == null || documentNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de documento es obligatorio");
        }
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del maestro es obligatorio");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido del maestro es obligatorio");
        }
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado del maestro es obligatorio");
        }
        this.teacherId = teacherId;
    }

    // Getter
    public Long getTeacherId() {
        return teacherId;
    }

    // Setter
    public void setTeacherId(Long teacherId) {
        if (teacherId == null) {
            throw new NullPointerException("El ID del maestro es obligatorio");
        }
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "teacherId = " + getTeacherId() + "\n" +
                ", userId = " + getUserId() + "\n" +
                ", documentType = " + getDocumentType() + "\n" +
                ", documentNumber = " + getDocumentNumber() + "\n" +
                ", firstName = " + getFirstName() + "\n" +
                ", lastName = " + getLastName() + "\n" +
                ", status = " + getStatus() +
                " }";

    }

}
