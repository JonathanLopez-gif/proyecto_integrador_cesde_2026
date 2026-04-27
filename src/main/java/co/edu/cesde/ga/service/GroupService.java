package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Group;

import java.util.List;

public interface GroupService {

    Group create(Group group);

    List<Group> findAll();

    Group findById(Long groupId);

    boolean update(Group group);

    boolean delete(Long groupId);

    int count();

}
