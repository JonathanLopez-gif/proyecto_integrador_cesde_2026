package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.Subject;
import co.edu.cesde.ga.repository.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepositoryInMemory implements SubjectRepository {

    // Atributos

    private List<Subject> subjects;
    private Long nextSubjectId;

    // Constructor

    public SubjectRepositoryInMemory(){
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

    }

    @Override
    public List<Subject> findAll() {

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
    public boolean update(Subject updatedSubject){

        if (updatedSubject == null) return false;

        for (int i = 0; i < subjects.size(); i++){

            if (updatedSubject.getSubjectId().equals(subjects.get(i).getSubjectId())){

                subjects.set(i, updatedSubject);

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
