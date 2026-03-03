package co.edu.cesde.ga.model;

public class group {

    // Atributos
    private Long groupId;
    private String code;
    private String programId;
    private String periodId;
    private String shift;

    // Constructor vacío
    public group() {
    }

    // Constructor lleno
    public  group(Long groupId, String code, String programId, String periodId, String shift) {
        this.groupId = groupId;
        this.code = code;
        this.programId = programId;
        this.periodId = periodId;
        this.shift = shift;
    }

    // Métodos de acceso

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long GroupId) {
        this.groupId = GroupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getprogramId() {return programId;}

    public void setprogramId(String programaId) {this.programId =  programaId;}

    public String getperiodId() {
        return periodId;
    }

    public void setperiodId(String periodId) {
        this.periodId = periodId;
    }

    public String getshift() {
        return shift;
    }

    public void setshift(String shift) {
        this.shift = shift;
    }
}
