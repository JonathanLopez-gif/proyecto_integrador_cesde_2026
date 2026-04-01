package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Enrollment;

import java.util.List;

public interface GradeRepository {

    Enrollment create(Enrollment enrollment);

    List<Enrollment> findAll();

    Enrollment findById(Long enrollmentId);

    boolean update(Enrollment updatedEnrollment);

    boolean delete(Long enrollmentId);

    int count();

}
