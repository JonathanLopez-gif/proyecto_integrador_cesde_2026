package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.UserRole;
import co.edu.cesde.ga.service.UserRoleService;

import java.util.ArrayList;
import java.util.List;

public class UserRoleServiceImpl implements UserRoleService {

    // Atributos

    private List<UserRole> userRoles;
    private Long nextUserId;

    // Constructor

    public UserRoleServiceImpl(){
        this.userRoles = new ArrayList<>();
        this.nextUserId=1L;
    }

    // Sobrecarga de métodos

    @Override
    public UserRole create(UserRole userRole){

        if (userRole == null){
            return null;
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
            return null;
        }

        for (UserRole userRole : userRoles){

            if (userId.equals(userRole.getUserId())){
                return userRole;
            }

        }

        return null;
    }

    @Override
    public boolean update(UserRole userRole){

        if (userRole == null) return false;

        for (int i = 0; i < userRoles.size(); i++){

            if (userRole.getUserId().equals(userRoles.get(i).getUserId())){

                userRoles.set(i, userRole);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long userId){

        UserRole userRole = findById(userId);

        if (userRole == null) return false;

        userRoles.remove(userRole);

        return true;

    }

    @Override
    public int count(){
        return userRoles.size();
    }

}