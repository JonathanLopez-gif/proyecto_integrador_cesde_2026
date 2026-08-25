package co.edu.cesde.am.application.service.impl;

import co.edu.cesde.am.domain.model.Enrollment;
import co.edu.cesde.am.application.repository.EnrollmentRepository;
import co.edu.cesde.am.application.service.EnrollmentService;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    // Atributos

    private List<Enrollment> enrollments;
    private Long nextEnrollmentId;

    // Constructor

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository){
        this.enrollments = new ArrayList<>();
        this.nextEnrollmentId = 1L;
    }

    // Sobrecarga de métodos

    @Override
    public Enrollment create(Enrollment enrollment){

        if (enrollment == null){
            return null;
        }

        enrollment.setEnrollmentId(nextEnrollmentId++);
        enrollments.add(enrollment);
        return enrollment;

    }

    @Override
    public List<Enrollment> findAll() {

        return new ArrayList<>(enrollments);

    }

    @Override
    public Enrollment findById(Long enrollmentId){

        if (enrollmentId == null){
            return null;
        }

        for (Enrollment enrollment : enrollments){

            if (enrollmentId.equals(enrollment.getEnrollmentId())){
                return enrollment;
            }

        }

        return null;
    }

    @Override
    public boolean update(Enrollment enrollment){

        if (enrollment == null) return false;

        for (int i = 0; i < enrollments.size(); i++){

            if (enrollment.getEnrollmentId().equals(enrollments.get(i).getEnrollmentId())){

                enrollments.set(i, enrollment);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long enrollmentId){

        Enrollment enrollment = findById(enrollmentId);

        if (enrollment == null) return false;

        enrollments.remove(enrollment);

        return true;

    }

    @Override
    public int count(){
        return enrollments.size();
    }

}
