package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Subject;

import java.util.List;

public interface SubjectService {

    Subject create(Subject subject);

    Subject findById(Long subjectId);

    List<Subject> findAll();

    boolean update(Subject subject);

    boolean delete(Long subjectId);

}
