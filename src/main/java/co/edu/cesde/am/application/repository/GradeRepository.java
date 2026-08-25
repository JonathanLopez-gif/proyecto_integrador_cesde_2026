package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.Grade;

import java.util.List;

public interface GradeRepository {

    Grade create(Grade grade);

    List<Grade> findAll();

    Grade findById(Long gradeId);

    boolean update(Grade grade);

    boolean delete(Long gradeId);

    int count();

}

