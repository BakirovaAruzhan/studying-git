package everset_academy.BookManagement.service;

import everset_academy.BookManagement.model.Book;
import everset_academy.BookManagement.repository.BookRepository;
import everset_academy.BookManagement.repository.JDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements BookRepository {
    @Autowired
    private JDBCRepository jdbcRepository;

    @Override
    public int save(Book book) {
        return jdbcRepository.save(book);
    }

    @Override
    public int update(Book book) {
        return jdbcRepository.update(book);
    }

    @Override
    public int deleteById(Long id) {
        return jdbcRepository.deleteById(id);
    }

    @Override
    public List<Book> findAll() {
        return jdbcRepository.findAll();
    }
}
