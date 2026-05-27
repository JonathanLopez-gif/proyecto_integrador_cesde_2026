package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Teacher;
import co.edu.cesde.ga.repository.TeacherRepository;
import co.edu.cesde.ga.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    // Constante privada
    private final TeacherRepository teacherRepository;

    // Constructor lleno
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    // Sobrecarga de métodos

    @Override
    public Teacher create(Teacher teacher) {

        if (isInvalidTeacher(teacher)
                || teacherRepository.existsByDocumentNumber(
                teacher.getDocumentNumber())) {

            return null;
        }

        return teacherRepository.create(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
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

    @Override
    public boolean delete(Long teacherId) {

        if (teacherId == null || teacherId <= 0L) {
            return false;
        }

        return teacherRepository.delete(teacherId);
    }

    @Override
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