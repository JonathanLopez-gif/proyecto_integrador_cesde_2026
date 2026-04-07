package co.edu.cesde.ga.repository.service.impl;

import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.repository.StudentRepository;
import co.edu.cesde.ga.repository.service.StudentService;

public class StudentServiceImpl implements StudentService{

        private final StudentRepository studentRepository;

        public StudentServiceImpl(StudentRepository studentRepository) {
            this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
            if (isInvalidStudent(student) || studentRepository.existsByDocumentNumber(student.getDocumentNumber())) {
                return null;
            }
        return studentRepository.create(student);
    }

    public boolean isInvalidStudent(Student student){

            return student == null
                    || isNotBlank(student.getDocumentNumber())
                    || isNotBlank(student.getFirstName())
                    || isNotBlank(student.getLastName())
                    || isNotBlank(student.getBirthDate())
                    || student.getStatus() == null;
    }

    private boolean isNotBlank(String value){
            return value == null
                    || value.trim().isBlank();
    }

    @Override
    public boolean update(Student studentUpdate){
            if (studentRepository.existsByDocumentNumber(studentUpdate.getDocumentNumber())){
                return false;
            }

            if (isInvalidStudent((studentUpdate)) || studentUpdate.getStudentId() == null || studentUpdate.getStudentId() <= 0L){

                return false;

            }

        return studentRepository.update(studentUpdate);
    }

    @Override
    public boolean delete (Long studentId){
            if (studentId == null || studentId <=0L){
                return null;
            }
            return studentRepository.delete (studentId);
    }

    @Override
    public Student findById (Long studentId){
        if (studentId == null || studentId <=0L){
            return null;
        }
        return studentRepository.findById();
}
