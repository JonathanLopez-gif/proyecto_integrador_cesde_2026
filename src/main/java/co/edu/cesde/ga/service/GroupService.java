package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Group;

import java.util.List;

public interface GroupService {

    Group create(Group group);

    Group findById(Long groupId);

    List<Group> findAll();

    boolean update(Group group);

    boolean delete(Long groupId);

}
