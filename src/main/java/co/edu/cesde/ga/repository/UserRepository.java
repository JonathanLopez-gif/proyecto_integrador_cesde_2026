package co.edu.cesde.ga.repository;

import co.edu.cesde.ga.model.User;

import java.util.List;

public interface UserRepository {

    User create(User user);

    List<User> findAll();

    User findById(Long userId);

    User findByDocumentNumber(Long documentNumber);

    boolean update(User updatedUser);

    boolean delete(Long userId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();

}
