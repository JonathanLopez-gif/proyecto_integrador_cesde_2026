package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.GroupSubject;
import co.edu.cesde.ga.repository.GroupSubjectRepository;

import java.util.ArrayList;
import java.util.List;

public class GroupSubjectRepositoryInMemory implements GroupSubjectRepository {
    // Atributos

    private List<GroupSubject> groupSubjects;
    private Long nextGroupSubjectId;

    // Constructor

    public GroupSubjectRepositoryInMemory(){
        this.groupSubjects = new ArrayList<>();
        this.nextGroupSubjectId = 1L;
    }

    // Sobrecarga de métodos

    @Override
    public GroupSubject create(GroupSubject groupSubject){

        if (groupSubject == null){
            return null;
        }

        groupSubject.setGroupSubjectId(nextGroupSubjectId++);
        groupSubjects.add(groupSubject);
        return groupSubject;

    }

    @Override
    public List<GroupSubject> findAll() {

        return new ArrayList<>(groupSubjects);

    }


    @Override
    public GroupSubject findById(Long groupId){

        if (groupId == null){
            return null;
        }

        for (GroupSubject group : groupSubjects){

            if (groupId.equals(group.getGroupSubjectId())){
                return group;
            }

        }

        return null;
    }

    @Override
    public boolean update(GroupSubject groupSubject){

        if (groupSubject == null) return false;

        for (int i = 0; i < groupSubjects.size(); i++){

            if (groupSubject.getGroupSubjectId().equals(groupSubjects.get(i).getGroupId())){

                groupSubjects.set(i, groupSubject);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long groupSubjectId){

        GroupSubject groupSubject = findById(groupSubjectId);

        if (groupSubject == null) return false;

        groupSubjects.remove(groupSubject);

        return true;

    }

    @Override
    public int count(){
        return groupSubjects.size();
    }

}
