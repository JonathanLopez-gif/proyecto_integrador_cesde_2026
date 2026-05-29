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

        setUserId(userId);
        setDocumentType(documentType);
        setDocumentNumber(documentNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setStatus(status);

    }

    // Métodos de acceso
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        if (userId == null) {
            throw new NullPointerException("El ID es obligatorio");
        }
        this.userId = userId;
    }

    public String getDocumentType() { return documentType; }

    public void setDocumentType(String documentType) {
        if (documentType == null) {
            throw new NullPointerException("El tipo de documento no puede ser nulo");
        }
        if (documentType.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de documento no puede estar vacío");
        }
        this.documentType = documentType; }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        if (documentNumber == null) {
            throw new NullPointerException("El número de documento no puede ser nulo");
        }
        if (documentNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de documento no puede estar vacío");
        }
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("El nombre no puede ser nulo");
        }
        if (firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("El apellido no puede ser nulo");
        }
        if (lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null) {
            throw new NullPointerException("El estado no puede ser nulo");
        }
        if (status.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacío");
        }
        this.status = status;
    }

}
