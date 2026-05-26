package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.Subject;
<<<<<<< HEAD
import co.edu.cesde.ga.service.SubjectService;

import java.util.ArrayList;
=======
import co.edu.cesde.ga.repository.SubjectRepository;
import co.edu.cesde.ga.service.SubjectService;

>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
import java.util.List;

public class SubjectServiceImpl implements SubjectService {

<<<<<<< HEAD
    // Atributos

    private List<Subject> subjects;
    private Long nextSubjectId;

    // Constructor

    public SubjectServiceImpl(){
        this.subjects = new ArrayList<>();
        this.nextSubjectId = 1L;
    }

    // Sobrecarga de métodos

    @Override
    public Subject create(Subject subject){

        if (subject == null){
            return null;
        }

        subject.setSubjectId(nextSubjectId++);
        subjects.add(subject);
        return subject;

=======
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject create(Subject subject) {

        if (isInvalidSubject(subject)
                || subjectRepository.findById(subject.getSubjectId()) != null) {
            return null;
        }

        return subjectRepository.create(subject);
    }

    @Override
    public boolean delete(Long subjectId) {

        if (subjectId == null || subjectId <= 0L) {
            return false;
        }

        return subjectRepository.delete(subjectId);
    }

    @Override
    public int count() {
        return subjectRepository.count();
    }

    @Override
    public Subject findById(Long subjectId) {

        if (subjectId == null || subjectId <= 0L) {
            return null;
        }

        return subjectRepository.findById(subjectId);
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
    }

    @Override
    public List<Subject> findAll() {
<<<<<<< HEAD

        return new ArrayList<>(subjects);

    }

    @Override
    public Subject findById(Long subjectId){

        if (subjectId == null){
            return null;
        }

        for (Subject subject : subjects){

            if (subjectId.equals(subject.getSubjectId())){
                return subject;
            }

        }

        return null;
    }

    @Override
    public boolean update(Subject subject){

        if (subject == null) return false;

        for (int i = 0; i < subjects.size(); i++){

            if (subject.getSubjectId().equals(subjects.get(i).getSubjectId())){

                subjects.set(i, subject);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long subjectId){

        Subject subject = findById(subjectId);

        if (subject == null) return false;

        subjects.remove(subject);

        return true;

    }

    @Override
    public int count(){
        return subjects.size();
    }

}
=======
        return subjectRepository.findAll();
    }

    @Override
    public boolean update(Subject subject) {

        if (isInvalidSubject(subject)
                || subject.getSubjectId() == null
                || subject.getSubjectId() <= 0L) {
            return false;
        }

        if (subjectRepository.findById(subject.getSubjectId()) == null) {
            return false;
        }

        return subjectRepository.update(subject);
    }

    public boolean isInvalidSubject(Subject subject) {

        return subject == null
                || subject.getSubjectId() == null
                || subject.getSubjectId() <= 0L
                || isBlank(subject.getCode())
                || isBlank(subject.getName())
                || subject.getCredits() == null
                || subject.getCredits() <= 0
                || subject.getProgramId() == null
                || subject.getProgramId() <= 0L;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }
}
>>>>>>> bd82d578a7dd4179b4d8fbc49b1778c11c4ddbb0
