package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.UserRole;

import java.util.List;

public interface UserRoleService {

    UserRole create(UserRole userRole);

    UserRole findById(Long userRoleId);

    List<UserRole> findAll();

    boolean update(UserRole userRole);

    boolean delete(Long userRoleId);


}
