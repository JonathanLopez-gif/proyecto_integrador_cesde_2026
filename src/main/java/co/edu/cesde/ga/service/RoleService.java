package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Role;

import java.util.List;

public interface RoleService {

    Role create(Role role);

    List<Role> findAll();

    Role findById(Long roleId);

    boolean update(Role role);

    boolean delete(Long roleId);

    int count();

}
