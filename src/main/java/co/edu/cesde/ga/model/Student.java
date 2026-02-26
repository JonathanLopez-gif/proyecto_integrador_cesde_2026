package co.edu.cesde.ga.model;

import java.time.LocalDate;

public class Student extends Person {

    // Atributo propio
    private LocalDate birthDate;

    // Constructor vacío
    public Student() {
        super();
    }

    // Constructor lleno
    public Student(Long userId, String code, String documentNumber,
                   String firstName, String lastName, String status,
                   LocalDate birthDate) {

        super(userId, code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
    }

    // Getter
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Setter
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
