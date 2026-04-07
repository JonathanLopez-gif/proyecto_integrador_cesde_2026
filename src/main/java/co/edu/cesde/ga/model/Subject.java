package co.edu.cesde.ga.model;

public class Subject {

    // Atributos
    private Long subjectId;
    private String code;
    private String name;
    private Integer credits;
    private Long programId;

    // Constructor vacío
    public Subject(){
    }

    // Constructor lleno
    public Subject(Long subjectId, String code, String name, Integer credits, Long programId) {
        this.subjectId = subjectId;
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.programId = programId;
    }

    // Métodos de acceso
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

}
