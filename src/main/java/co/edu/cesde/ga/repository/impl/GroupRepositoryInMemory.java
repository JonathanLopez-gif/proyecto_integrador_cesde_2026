package co.edu.cesde.ga.repository.impl;

import co.edu.cesde.ga.model.Group;
import co.edu.cesde.ga.repository.GroupRepository;

import java.util.ArrayList;
import java.util.List;

public class GroupRepositoryInMemory implements GroupRepository {
    // Atributos

    private List<Group> groups;
    private Long nextGroupId;

    // Constructor

    public GroupRepositoryInMemory(){
        this.groups = new ArrayList<>();
        this.nextGroupId = 1L;
    }

    // Sobrecarga de métodos

    @Override
    public Group create(Group group){

        if (group == null){
            return null;
        }

        group.setGroupId(nextGroupId++);
        groups.add(group);
        return group;

    }

    @Override
    public List<Group> findAll() {

        return new ArrayList<>(groups);

    }


    @Override
    public Group findById(Long groupId){

        if (groupId == null){
            return null;
        }

        for (Group group : groups){

            if (groupId.equals(group.getGroupId())){
                return group;
            }

        }

        return null;
    }

    @Override
    public boolean update(Group updatedGroup){

        if (updatedGroup == null) return false;

        for (int i = 0; i < groups.size(); i++){

            if (updatedGroup.getGroupId().equals(groups.get(i).getGroupId())){

                groups.set(i, updatedGroup);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long groupId){

        Group group = findById(groupId);

        if (group == null) return false;

        groups.remove(group);

        return true;

    }

    @Override
    public int count(){
        return groups.size();
    }

}

