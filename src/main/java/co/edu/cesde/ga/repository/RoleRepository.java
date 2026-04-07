package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.Role;

import java.util.List;

public interface RoleRepository {

    Role create(Role role);

    List<Role> findAll();

    Role findById(Long roleId);

    boolean update(Role role);

    boolean delete(Long roleId);

    int count();

}
