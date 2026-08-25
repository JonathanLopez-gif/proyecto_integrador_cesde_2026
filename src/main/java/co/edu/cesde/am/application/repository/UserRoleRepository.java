package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.UserRole;

import java.util.List;

public interface UserRoleRepository {

    UserRole create(UserRole userRole);

    List<UserRole> findAll();

    UserRole findById(Long userRoleId);

    boolean update(UserRole userRole);

    boolean delete(Long userRoleId);

    int count();

}
