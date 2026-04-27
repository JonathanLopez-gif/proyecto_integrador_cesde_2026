package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.UserRole;
import java.util.List;

public interface UserRoleService {

    UserRole create(UserRole userRole);

    List<UserRole> findAll();

    UserRole findById(Long userId);

    boolean update(UserRole userRole);

    boolean delete(Long userId);

    int count();

}
