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
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Student findById(Long studentId) {
        if(studentId == null || studentId <= 0L) {
            return null;
        }
        return studentRepository.findById(studentId);
    }

    @Override
<<<<<<< HEAD
    public Student findByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isBlank()){
            return null;
        }

        for (Student student : studentRepository.findAll()){

            if (documentNumber.equals(student.getDocumentNumber())){
                return student;
            }

        }

        return null;
=======
    public Student findByDocumentNumber(String documentNumber) {
        return null;
    }

    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
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

    @Override
    public boolean delete(Long studentId) {
        if(studentId == null || studentId <= 0L){
            return false;
        }
        return studentRepository.delete(studentId);
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isEmpty()){
            return false;
        }

        return findByDocumentNumber(documentNumber) != null;

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

    @Override
    public int count(){
        return studentRepository.count();
    }

}
