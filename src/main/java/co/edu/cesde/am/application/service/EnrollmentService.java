package co.edu.cesde.am.application.service;

import co.edu.cesde.am.domain.model.Enrollment;

import java.util.List;

public interface EnrollmentService {

    Enrollment create(Enrollment enrollment);

    List<Enrollment> findAll();

    Enrollment findById(Long enrollmentId);

    boolean update(Enrollment enrollment);

    boolean delete(Long enrollmentId);

    int count();

}
