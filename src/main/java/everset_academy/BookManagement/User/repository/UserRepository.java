package everset_academy.BookManagement.User.repository;

import everset_academy.BookManagement.User.domain.User;

import java.util.List;

public interface UserRepository {
    int save(User user);
    int deletedById(Long id);
    int count();
    int findById(Long id);
    List<User> findAll();


}
