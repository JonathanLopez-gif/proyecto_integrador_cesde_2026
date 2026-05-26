package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Grade;

import java.util.List;

public interface GradeRepository {

    Grade create(Grade grade);

    List<Grade> findAll();

    Grade findById(Long gradeId);

    boolean update(Grade grade);

    boolean delete(Long gradeId);

    int count();

}

