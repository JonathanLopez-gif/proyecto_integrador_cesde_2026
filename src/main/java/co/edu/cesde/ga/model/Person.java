package co.edu.cesde.ga.model;

public abstract class Person {

    // Atributos
    private Long userId;
    private String documentType;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private String status;

    // Constructor vacío
    protected Person() {
    }

    // Constructor lleno
    protected Person(Long userId, String documentType, String documentNumber, String firstName, String lastName, String status) {
        this.userId = userId;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    // Métodos de acceso
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDocumentType() { return documentType; }

    public void setDocumentType(String documentType) { this.documentType = documentType; }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
