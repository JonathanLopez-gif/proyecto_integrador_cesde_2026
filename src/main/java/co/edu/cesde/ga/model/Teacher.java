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
        this.teacherId = teacherId;
    }

    // Getter
    public Long getTeacherId() {
        return teacherId;
    }

    // Setter
    public void setTeacherId(Long teacherId) {
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
