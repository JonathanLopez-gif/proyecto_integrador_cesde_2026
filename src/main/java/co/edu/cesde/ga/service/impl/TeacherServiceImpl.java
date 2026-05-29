package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.exceptions.TeacherValidationException;
import co.edu.cesde.ga.model.Teacher;
import co.edu.cesde.ga.repository.TeacherRepository;
import co.edu.cesde.ga.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher create(Teacher teacher) {
        if (isInvalidTeacher(teacher)) {
            throw new TeacherValidationException("Los datos de validación del maestro son incorrectos.");
        }

        if (teacherRepository.existsByDocumentNumber(teacher.getDocumentNumber())) {
            throw new TeacherValidationException("Ya existe un maestro con el número de documento: " + teacher.getDocumentNumber());
        }

        return teacherRepository.create(teacher);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findById(Long teacherId) {
        if (teacherId == null) {
            throw new TeacherValidationException(teacherId);
        }
        if (teacherId <= 0L) {
            throw new TeacherValidationException("El ID debe ser mayor que 0");
        }

        Teacher teacher = teacherRepository.findById(teacherId);
        if (teacher == null) {
            throw new TeacherValidationException(teacherId);
        }

        return teacher;
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.trim().isBlank()) {
            throw new TeacherValidationException("Ingrese el número de documento del maestro");
        }

        Teacher teacher = teacherRepository.findByDocumentNumber(documentNumber);
        if (teacher == null) {
            throw new TeacherValidationException("Maestro con documento " + documentNumber + " no encontrado");
        }
        return teacher;
    }

    @Override
    public boolean update(Teacher teacher) {
        if (isInvalidTeacher(teacher) || teacher.getTeacherId() == null || teacher.getTeacherId() <= 0L) {
            throw new TeacherValidationException("Datos de actualización inválidos para el maestro");
        }

        if (teacherRepository.findById(teacher.getTeacherId()) == null) {
            throw new TeacherValidationException(teacher.getTeacherId());
        }

        return teacherRepository.update(teacher);
    }

    @Override
    public boolean delete(Long teacherId) {
        if (teacherId == null) {
            throw new TeacherValidationException(teacherId);
        }
        if (teacherId <= 0L) {
            throw new TeacherValidationException("El ID debe ser mayor que 0");
        }

        if (teacherRepository.findById(teacherId) == null) {
            throw new TeacherValidationException(teacherId);
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
                || teacher.getTeacherId() == null
                || isBlank(teacher.getDocumentType())
                || isBlank(teacher.getDocumentNumber())
                || isBlank(teacher.getFirstName())
                || isBlank(teacher.getLastName())
                || isBlank(teacher.getStatus());
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }
}