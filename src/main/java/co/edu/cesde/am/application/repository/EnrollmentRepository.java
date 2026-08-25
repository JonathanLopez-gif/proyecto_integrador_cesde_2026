package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.Enrollment;

import java.util.List;

public interface EnrollmentRepository {

    Enrollment create(Enrollment enrollment);

    List<Enrollment> findAll();

    Enrollment findById(Long enrollmentId);

    boolean update(Enrollment enrollment);

    boolean delete(Long enrollmentId);

    int count();

}
