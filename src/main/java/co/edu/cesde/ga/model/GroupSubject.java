package co.edu.cesde.ga.model;

public class GroupSubject {

    // Atributos
    private Integer groupSubjectId;
    private Integer groupId;
    private Long subjectId;
    private Long teacherId;

    // Constructor vacío
    public GroupSubject(){
    }

    // Constructor lleno
    public GroupSubject(Integer groupSubjectId, Integer groupId, Long subjectId, Long teacherId) {
        this.groupSubjectId = groupSubjectId;
        this.groupId = groupId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    // Métodos de acceso
    public Integer getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(Integer groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void setGroupSubjectId(Long aLong) {
    }
}
