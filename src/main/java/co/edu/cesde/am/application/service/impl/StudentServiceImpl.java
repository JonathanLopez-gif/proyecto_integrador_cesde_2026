package co.edu.cesde.am.application.service.impl;

import co.edu.cesde.am.domain.model.Student;
import co.edu.cesde.am.application.repository.StudentRepository;
import co.edu.cesde.am.application.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    // Constante privada
    private final StudentRepository studentRepository;

    // Constructor lleno
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Sobrecarga de métodos

    @Override
    public Student create(Student student) {

        if (isInvalidStudent(student)
                || studentRepository.existsByDocumentNumber(
                student.getDocumentNumber())) {

            return null;
        }

        return studentRepository.create(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long studentId) {

        if (studentId == null || studentId <= 0L) {
            return null;
        }

        return studentRepository.findById(studentId);
    }

    @Override
    public Student findByDocumentNumber(String documentNumber) {

        if (documentNumber == null || documentNumber.isBlank()) {
            return null;
        }

        for (Student student : studentRepository.findAll()) {

            if (documentNumber.equals(student.getDocumentNumber())) {
                return student;
            }

        }

        return null;
    }

    @Override
    public boolean update(Student student) {

        if (isInvalidStudent(student)
                || student.getStudentId() == null
                || student.getStudentId() <= 0L) {

            return false;
        }

        return studentRepository.update(student);
    }

    @Override
    public boolean delete(Long studentId) {

        if (studentId == null || studentId <= 0L) {
            return false;
        }

        return studentRepository.delete(studentId);
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {

        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }

        return findByDocumentNumber(documentNumber) != null;
    }

    @Override
    public int count() {
        return studentRepository.count();
    }

    public boolean isInvalidStudent(Student student) {

        return student == null
                || isBlank(student.getDocumentNumber())
                || isBlank(student.getFirstName())
                || isBlank(student.getLastName())
                || isBlank(student.getBirthDate())
                || student.getStatus() == null;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }

}