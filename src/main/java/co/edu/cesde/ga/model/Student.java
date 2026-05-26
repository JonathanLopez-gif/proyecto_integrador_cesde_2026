package co.edu.cesde.ga.model;

import java.time.LocalDate;

public class Student extends Person {

    // Atributos propios
    private Long studentId;
    private String birthDate;

    // Constructor vacío
    public Student() {
        super();
    }

    // Constructor lleno
    public Student(Long studentId, Long userId, String documentType, String documentNumber,
                   String firstName, String lastName, String birthDate, String status) {

        super(userId, documentType, documentNumber, firstName, lastName, status);
        this.studentId = studentId;
        this.birthDate = birthDate;
    }

    // Getter
    public Long getStudentId() { return studentId; }
    public String getBirthDate() {
        return birthDate;
    }

    // Setter
    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentId = " + getStudentId() + "\n" +
                ", userId = " + getUserId() + "\n" +
                ", documentType = " + getDocumentType() + "\n" +
                ", documentNumber = " + getDocumentNumber() + "\n" +
                ", firstName = " + getFirstName() + "\n" +
                ", lastName = " + getLastName() + "\n" +
                ", birthDate = " + getBirthDate() + "\n" +
                ", status = " + getStatus() +
                " }";

    }

}
