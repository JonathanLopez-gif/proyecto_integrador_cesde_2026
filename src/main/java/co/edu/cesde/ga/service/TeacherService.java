package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher create(Teacher teacher);

    List<Teacher> findAll();

    Teacher findById(Long teacherId);

    Teacher findByDocumentNumber(String documentNumber);

    boolean update(Teacher teacher);

    boolean delete(Long teacherId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();

}
