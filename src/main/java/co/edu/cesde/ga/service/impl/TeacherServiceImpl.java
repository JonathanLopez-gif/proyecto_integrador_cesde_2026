package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Teacher;
import co.edu.cesde.ga.repository.TeacherRepository;
import co.edu.cesde.ga.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

<<<<<<< HEAD
    // Constante privada

    private final TeacherRepository teacherRepository;

    // Constructor lleno

=======
    private final TeacherRepository teacherRepository;

>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

<<<<<<< HEAD
    // Sobrecarga de metodos

    @Override
    public Teacher create(Teacher teacher) {
        if(isInvalidTeacher(teacher) || teacherRepository.existsByDocumentNumber(teacher.getDocumentNumber())){
            return null;
        }
=======
    @Override
    public Teacher create(Teacher teacher) {

        if (isInvalidTeacher(teacher)
                || teacherRepository.existsByDocumentNumber(teacher.getDocumentNumber())) {
            return null;
        }

>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
        return teacherRepository.create(teacher);
    }

    @Override
<<<<<<< HEAD
    public List<Teacher> findAll(){
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findById(Long teacherId) {
        if(teacherId == null || teacherId <= 0L) {
            return null;
        }
        return teacherRepository.findById(teacherId);
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isBlank()){
            return null;
        }

        for (Teacher teacher : teacherRepository.findAll()){

            if (documentNumber.equals(teacher.getDocumentNumber())){
                return teacher;
            }

        }

        return null;
    }

    @Override
    public boolean update(Teacher teacher) {
        if(teacherRepository.existsByDocumentNumber(teacher.getDocumentNumber())) {
            return false;
        }
        if(isInvalidTeacher(teacher) || teacher.getTeacherId() == null || teacher.getTeacherId() <= 0L) {
            return false;
        }
        return teacherRepository.update(teacher);
    }

    @Override
    public boolean delete(Long teacherId) {
        if(teacherId == null || teacherId <= 0L){
            return false;
        }
=======
    public boolean delete(Long teacherId) {

        if (teacherId == null || teacherId <= 0L) {
            return false;
        }

>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
        return teacherRepository.delete(teacherId);
    }

    @Override
<<<<<<< HEAD
    public boolean existsByDocumentNumber(String documentNumber){

        if (documentNumber == null || documentNumber.isEmpty()){
            return false;
        }

        return findByDocumentNumber(documentNumber) != null;

    }

    public boolean isInvalidTeacher(Teacher  teacher) {
        return teacher == null
                || isNotBlank(teacher.getDocumentNumber())
                || isNotBlank(teacher.getFirstName())
                || isNotBlank(teacher.getLastName())
                || teacher.getStatus() == null;
    }

    private boolean isNotBlank(String value){
        return value == null || value.trim().isBlank();
    }

    @Override
    public int count(){
        return teacherRepository.count();
    }

}
=======
    public boolean existsByDocumentNumber(String documentNumber) {

        if (documentNumber == null || documentNumber.trim().isBlank()) {
            return false;
        }

        return teacherRepository.existsByDocumentNumber(documentNumber);
    }

    @Override
    public int count() {
        return teacherRepository.count();
    }

    @Override
    public Teacher findById(Long teacherId) {

        if (teacherId == null || teacherId <= 0L) {
            return null;
        }

        return teacherRepository.findById(teacherId);
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber) {

        if (documentNumber == null || documentNumber.trim().isBlank()) {
            return null;
        }

        return teacherRepository.findByDocumentNumber(documentNumber);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public boolean update(Teacher teacher) {

        if (isInvalidTeacher(teacher)
                || teacher.getTeacherId() == null
                || teacher.getTeacherId() <= 0L) {
            return false;
        }

        if (teacherRepository.findById(teacher.getTeacherId()) == null) {
            return false;
        }

        return teacherRepository.update(teacher);
    }

    public boolean isInvalidTeacher(Teacher teacher) {

        return teacher == null
                || isBlank(teacher.getDocumentNumber())
                || isBlank(teacher.getFirstName())
                || isBlank(teacher.getLastName())
                || isBlank(teacher.getDocumentType())
                || isBlank(teacher.getUserId())
                || teacher.getStatus() == null;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }
}
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
