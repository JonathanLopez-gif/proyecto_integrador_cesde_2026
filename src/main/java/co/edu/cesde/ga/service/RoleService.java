package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.Role;

import java.util.List;

public interface RoleService {

    Role create(Role role);

    Role findById(Long roleId);

    List<Role> findAll();

    boolean update(Role role);

    boolean delete(Long roleId);

}
