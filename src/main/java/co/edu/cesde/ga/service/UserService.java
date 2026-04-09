package co.edu.cesde.ga.service;

import co.edu.cesde.ga.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    User findById(Long userId);

    List<User> findAll();

    boolean update(User user);

    boolean delete(Long userId);

}
