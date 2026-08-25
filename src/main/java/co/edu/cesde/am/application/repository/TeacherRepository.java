package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.Teacher;

import java.util.List;

public interface TeacherRepository {

    Teacher create(Teacher teacher);

    List<Teacher> findAll();

    Teacher findById(Long teacherId);

    Teacher findByDocumentNumber(String documentNumber);

    boolean update(Teacher teacher);

    boolean delete(Long teacherId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();

}
