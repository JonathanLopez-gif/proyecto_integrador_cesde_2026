package co.edu.cesde.am.application.service.impl;

import co.edu.cesde.am.domain.exception.UserValidationException;
import co.edu.cesde.am.domain.model.User;
import co.edu.cesde.am.application.repository.UserRepository;
import co.edu.cesde.am.application.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users;
    private Long nextUserId;

    public UserServiceImpl(UserRepository userRepository){
        this.users = new ArrayList<>();
        this.nextUserId = 1L;
    }

    @Override
    public User create(User user){
        if (user == null){
            throw new UserValidationException("No se puede crear un usuario vacío/nulo");
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
            throw new UserValidationException(userId);
        }

        for (User user : users){
            if (userId.equals(user.getUserId())){
                return user;
            }
        }

        throw new UserValidationException(userId);
    }

    @Override
    public boolean update(User user){
        if (user == null || user.getUserId() == null) {
            throw new UserValidationException("Datos de usuario no válidos para actualizar");
        }

        for (int i = 0; i < users.size(); i++){
            if (user.getUserId().equals(users.get(i).getUserId())){
                users.set(i, user);
                return true;
            }
        }

        throw new UserValidationException(user.getUserId());
    }

    @Override
    public boolean delete(Long userId){
        // findById ya maneja la excepción automática si el usuario no existe
        User user = findById(userId);

        users.remove(user);
        return true;
    }

    @Override
    public int count(){
        return users.size();
    }

}