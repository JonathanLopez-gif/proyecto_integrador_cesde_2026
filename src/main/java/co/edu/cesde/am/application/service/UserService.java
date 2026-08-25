package co.edu.cesde.am.application.service;

import co.edu.cesde.am.domain.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> findAll();

    User findById(Long userId);

    boolean update(User user);

    boolean delete(Long userId);

    int count();

}

