package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Enrollment;

import java.util.List;

public interface EnrollmentRepository {

    Enrollment create(Enrollment enrollment);

    List<Enrollment> findAll();

    Enrollment findById(Long enrollmentId);

    boolean update(Enrollment enrollment);

    boolean delete(Long enrollmentId);

    int count();

}
