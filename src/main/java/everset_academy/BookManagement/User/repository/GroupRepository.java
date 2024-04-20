package everset_academy.BookManagement.User.repository;

import everset_academy.BookManagement.User.domain.Group;

public interface GroupRepository {
    Group findByID(long id);
    Group save(Group group);

    Group findById(Long id);
}

