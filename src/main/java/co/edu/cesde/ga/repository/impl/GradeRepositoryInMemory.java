package co.edu.cesde.ga.repository.impl;


import co.edu.cesde.ga.model.Grade;
import co.edu.cesde.ga.repository.GradeRepository;


import java.util.ArrayList;
import java.util.List;

public class GradeRepositoryInMemory implements GradeRepository {

    // Atributos

    private List<Grade> grades;
    private Long nextGradeId;

    // Constructor

    public GradeRepositoryInMemory(){
        this.grades = new ArrayList<>();
        this.nextGradeId = 1L;
    }

    // Sobrecarga de métodos

    @Override
    public Grade create(Grade grade){

        if (grade == null){
            return null;
        }

        grade.setGradeId(nextGradeId++);
        grades.add(grade);
        return grade;

    }

    @Override
    public List<Grade> findAll() {

        return new ArrayList<>(grades);

    }


    @Override
    public Grade findById(Long gradeId){

        if (gradeId == null){
            return null;
        }

        for (Grade grade : grades){

            if (gradeId.equals(grade.getGradeId())){
                return grade;
            }

        }

        return null;
    }

    @Override
    public boolean update(Grade updatedGrade){

        if (updatedGrade == null) return false;

        for (int i = 0; i < grades.size(); i++){

            if (updatedGrade.getGradeId().equals(grades.get(i).getGradeId())){

                grades.set(i, updatedGrade);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long gradeId){

        Grade grade = findById(gradeId);

        if (grade == null) return false;

        grades.remove(grade);

        return true;

    }

    @Override
    public int count(){
        return grades.size();
    }

}
