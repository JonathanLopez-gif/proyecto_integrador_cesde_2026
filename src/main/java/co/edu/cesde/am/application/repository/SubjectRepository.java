package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.Subject;

import java.util.List;

public interface SubjectRepository {

    Subject create (Subject groupSubject);

    List<Subject> findAll();

    Subject findById(Long SubjectId);

    boolean update(Subject subject);

    boolean delete(Long SubjectId);

    int count();

}
