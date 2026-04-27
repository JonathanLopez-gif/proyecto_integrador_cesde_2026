package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Student;

import java.util.List;

public interface StudentService {

    Student create(Student student);

    List<Student> findAll();

    Student findById(Long studentId);

    Student findByDocumentNumber(String documentNumber);

    boolean update(Student student);

    boolean delete(Long studentId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();

}
