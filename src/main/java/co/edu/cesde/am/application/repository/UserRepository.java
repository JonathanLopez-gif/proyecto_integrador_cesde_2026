package co.edu.cesde.am.application.repository;

import co.edu.cesde.am.domain.model.User;

import java.util.List;

public interface UserRepository {

    User create(User user);

    List<User> findAll();

    User findById(Long userId);

    boolean update(User user);

    boolean delete(Long userId);

    int count();

}
