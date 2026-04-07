package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Group;

import java.util.List;

public interface GroupRepository {

    Group create(Group group);

    List<Group> findAll();

    Group findById(Long groupId);

    boolean update(Group group);

    boolean delete(Long groupId);

    int count();

}
