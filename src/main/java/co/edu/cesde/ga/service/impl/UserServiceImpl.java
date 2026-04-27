package co.edu.cesde.ga.service.impl;

import co.edu.cesde.ga.model.User;
import co.edu.cesde.ga.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    // Atributos

    private List<User> users;
    private Long nextUserId;

    // Constructor

    public UserServiceImpl(){
        this.users = new ArrayList<>();
        this.nextUserId=1L;
    }

    // Sobrecarga de métodos

    @Override
    public User create(User user){

        if (user == null){
            return null;
        }

        user.setUserId(nextUserId++);
        users.add(user);
        return user;

    }

    @Override
    public List<User> findAll() {

        return new ArrayList<>(users);

    }

    @Override
    public User findById(Long userId){

        if (userId == null){
            return null;
        }

        for (User user : users){

            if (userId.equals(user.getUserId())){
                return user;
            }

        }

        return null;
    }

    @Override
    public boolean update(User user){

        if (user == null) return false;

        for (int i = 0; i < users.size(); i++){

            if (user.getUserId().equals(users.get(i).getUserId())){

                users.set(i, user);

                return true;

            }

        }

        return false;

    }

    @Override
    public boolean delete(Long userId){

        User user = findById(userId);

        if (user == null) return false;

        users.remove(user);

        return true;

    }

    @Override
    public int count(){
        return users.size();
    }

}
