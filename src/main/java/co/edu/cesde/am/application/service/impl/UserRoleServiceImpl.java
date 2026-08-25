package co.edu.cesde.am.application.service.impl;

import co.edu.cesde.am.domain.exception.UserRoleValidationException;
import co.edu.cesde.am.domain.model.UserRole;
import co.edu.cesde.am.application.repository.UserRoleRepository;
import co.edu.cesde.am.application.service.UserRoleService;

import java.util.ArrayList;
import java.util.List;

public class UserRoleServiceImpl implements UserRoleService {

    private List<UserRole> userRoles;
    private Long nextUserId;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository){
        this.userRoles = new ArrayList<>();
        this.nextUserId = 1L;
    }

    @Override
    public UserRole create(UserRole userRole){
        if (userRole == null){
            throw new UserRoleValidationException("No se puede crear un rol nulo");
        }

        userRole.setUserId(nextUserId++);
        userRoles.add(userRole);
        return userRole;
    }

    @Override
    public List<UserRole> findAll() {
        return new ArrayList<>(userRoles);
    }

    @Override
    public UserRole findById(Long userId){
        if (userId == null){
            throw new UserRoleValidationException(userId);
        }

        for (UserRole userRole : userRoles){
            if (userId.equals(userRole.getUserId())){
                return userRole;
            }
        }

        throw new UserRoleValidationException(userId);
    }

    @Override
    public boolean update(UserRole userRole){
        if (userRole == null || userRole.getUserId() == null) {
            throw new UserRoleValidationException("Datos del rol inválidos para actualización");
        }

        for (int i = 0; i < userRoles.size(); i++){
            if (userRole.getUserId().equals(userRoles.get(i).getUserId())){
                userRoles.set(i, userRole);
                return true;
            }
        }

        throw new UserRoleValidationException(userRole.getUserId());
    }

    @Override
    public boolean delete(Long userId){
        // findById ya se encarga de lanzar UserRoleValidationException si no existe
        UserRole userRole = findById(userId);

        userRoles.remove(userRole);
        return true;
    }

    @Override
    public int count(){
        return userRoles.size();
    }

}