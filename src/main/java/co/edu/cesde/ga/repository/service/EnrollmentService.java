package co.edu.cesde.ga.repository.service;

import co.edu.cesde.ga.model.Enrollment;

import java.util.List;

public interface EnrollmentService {

    Enrollment create(Enrollment enrollment);

    boolean update(Enrollment enrollment);

    boolean delete(Integer id);

    Enrollment findById(Long id);

    List<Enrollment> findAll();
}
