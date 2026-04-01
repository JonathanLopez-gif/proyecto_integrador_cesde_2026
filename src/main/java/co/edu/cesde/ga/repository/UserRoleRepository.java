package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.UserRole;

import java.util.List;

public interface UserRoleRepository {

    UserRole create(UserRole userRole);

    List<UserRole> findAll();

    UserRole findById(Long userRoleId);

    UserRole findByDocumentNumber(Long documentNumber);

    boolean update(UserRole updatedUserRole);

    boolean delete(Long userRoleId);

    int count();

}
