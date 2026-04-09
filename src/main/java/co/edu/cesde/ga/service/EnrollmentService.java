package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Enrollment;

import java.util.List;

public interface EnrollmentService {

    Enrollment create(Enrollment enrollment);

    Enrollment findById(Long enrollmentId);

    List<Enrollment> findAll();

    boolean update(Enrollment enrollment);

    boolean delete(Long enrollmentId);

}
