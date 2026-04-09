package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher create(Teacher teacher);

    Teacher findById(Long teacherId);

    List<Teacher> findAll();

    boolean update(Teacher teacher);

    boolean delete(Long teacherId);

}
