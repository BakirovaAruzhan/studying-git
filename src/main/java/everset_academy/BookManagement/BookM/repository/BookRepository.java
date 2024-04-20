package everset_academy.BookManagement.BookM.repository;

import everset_academy.BookManagement.BookM.model.Book;

import java.util.List;

public interface BookRepository {
    int save(Book book);

    int update(Book book);

    int deleteById(Long id);

    List<Book> findAll();

    Book findID(Long id);
}
