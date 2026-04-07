package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Subject;

import java.util.List;

public interface SubjectRepository {

    Subject create (Subject groupSubject);

    List<Subject> findAll();

    Subject findById(Long SubjectId);

    boolean update(Subject subject);

    boolean delete(Long SubjectId);

    int count();

}
