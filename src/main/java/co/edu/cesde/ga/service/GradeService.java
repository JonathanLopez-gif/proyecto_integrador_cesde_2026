package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Grade;

import java.util.List;

public interface GradeService {

    Grade create(Grade grade);

    List<Grade> findAll();

    Grade findById(Long gradeId);

    boolean update(Grade grade);

    boolean delete(Long gradeId);

    int count();

}
