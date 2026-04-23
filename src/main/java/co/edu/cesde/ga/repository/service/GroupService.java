package co.edu.cesde.ga.repository.service;

import co.edu.cesde.ga.model.Group;

import java.util.List;

public interface GroupService {

    Group create(Group group);

    boolean update(Group group);

    boolean delete(Integer id);

    Group findById(Long id);

    List<Group> findAll();
}
