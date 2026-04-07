package co.edu.cesde.ga.repository.service;

import co.edu.cesde.ga.model.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    boolean update(Student student);

    boolean delete(Integer id);

    Student findById(Long studentId);

    List<Student> findAll();
}
