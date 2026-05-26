package co.edu.cesde.ga.model;

public class Grade {

    // Atributos
    private Integer gradeId;
    private Integer groupSubjectId;
    private Long studentId;
    private Double finalScore;
    private String observation;

    // Constructor vacío
    public Grade(){
    }

    // Constructor lleno
    public Grade(Integer gradeId, Integer groupSubjectId, Long studentId, Double finalScore, String observation) {
        this.gradeId = gradeId;
        this.groupSubjectId = groupSubjectId;
        this.studentId = studentId;
        this.finalScore = finalScore;
        this.observation = observation;
    }

    // Métodos de acceso
    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(Integer groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

}
