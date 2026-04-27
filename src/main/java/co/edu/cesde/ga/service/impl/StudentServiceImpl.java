package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    // Constante privada

    private final StudentRepository studentRepository;

    // Constructor lleno

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Sobrecarga de metodos

    @Override
    public Student create(Student student) {
        if(isInvalidStudent(student) || studentRepository.existsByDocumentNumber(student.getDocumentNumber())){
            return null;
        }
        return studentRepository.create(student);
    }

    @Override
    public boolean delete(Long studentId) {
        if(studentId == null || studentId <= 0L){
            return false;
        }
        return studentRepository.delete(studentId);
    }

    @Override
    public Student findById(Long studentId) {
        if(studentId == null || studentId <= 0L) {
            return null;
        }
        return studentRepository.findById(studentId);
    }

    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public boolean update(Student student) {
        if(studentRepository.existsByDocumentNumber(student.getDocumentNumber())) {
            return false;
        }
        if(isInvalidStudent(student) || student.getStudentId() == null || student.getStudentId() <= 0L) {
            return false;
        }
        return studentRepository.update(student);
    }

    public boolean isInvalidStudent(Student student) {
        return student == null
                || isNotBlank(student.getDocumentNumber())
                || isNotBlank(student.getFirstName())
                || isNotBlank(student.getLastName())
                || isNotBlank(student.getBirthDate())
                || student.getStatus() == null;
    }

    private boolean isNotBlank(String value){
        return value == null || value.trim().isBlank();
    }

}
