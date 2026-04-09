package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Grade;

import java.util.List;

public interface GradeService {

    Grade create(Grade grade);

    Grade findById(Long gradeId);

    List<Grade> findAll();

    boolean update(Grade grade);

    boolean delete(Long gradeId);

}
