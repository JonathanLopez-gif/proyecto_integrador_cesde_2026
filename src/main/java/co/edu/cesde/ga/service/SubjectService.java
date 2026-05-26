package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Subject;

import java.util.List;

public interface SubjectService {

    Subject create(Subject subject);

    List<Subject> findAll();

    Subject findById(Long subjectId);

    boolean update(Subject subject);

    boolean delete(Long subjectId);

    int count();

}
