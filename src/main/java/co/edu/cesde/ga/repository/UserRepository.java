package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.User;

import java.util.List;

public interface UserRepository {

    User create(User user);

    List<User> findAll();

    User findById(Long userId);

    boolean update(User user);

    boolean delete(Long userId);

    int count();

}
