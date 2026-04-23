package co.edu.cesde.ga.repository.service;

import co.edu.cesde.ga.model.Grade;

import java.util.List;

public interface GradeService {

    Grade create(Grade grade);

    boolean update(Grade grade);

    boolean delete(Integer id);

    Grade findById(Long id);

    List<Grade> findAll();
}
