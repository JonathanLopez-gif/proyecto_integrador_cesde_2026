package co.edu.cesde.ga.model;

import java.time.LocalDate;

public class Period {

    // Atributos
    private Integer periodId;
    private String code;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor vacío
    public Period(){
    }

    // Constructor lleno
    public Period(Integer periodId, String code, LocalDate startDate, LocalDate endDate) {
        this.periodId = periodId;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Métodos de acceso
    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
