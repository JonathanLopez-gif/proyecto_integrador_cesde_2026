package co.edu.cesde.ga.model;

public class Teacher extends Person {

    // Constructor vacío
    public Teacher() {
        super();
    }

    // Constructor lleno
    public Teacher(Long userId, String code, String documentNumber,
                   String firstName, String lastName, String status) {
        super(userId, code, documentNumber, firstName, lastName, status);
    }

}
