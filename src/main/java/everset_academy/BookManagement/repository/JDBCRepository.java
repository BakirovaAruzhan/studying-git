package everset_academy.BookManagement.repository;

import everset_academy.BookManagement.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JDBCRepository implements BookRepository {
    private final JdbcTemplate jdbcTemplate;

    public JDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Book book) {
        return jdbcTemplate.update("""
                insert into book(author, genre, Release_year,title, Description) 
                values (?,?,?,?,?)
                """, book.getAuthor(), book.getGenre(), book.getRelease_year(), book.getTitle(), book.getDescription());
    }


    @Override
    public int update(Book book) {
        return jdbcTemplate.update("""
                update book
                set author = ?,
                genre = ?,
                Release_year = ?,
                title = ?,
                Description = ?
                return id =?
                """, book.getAuthor(), book.getGenre(), book.getRelease_year(), book.getTitle(), book.getDescription(), book.getId()
        );

    }

    @Override
    public int deleteById(Long id) {
        List<Book> books = jdbcTemplate.query("""
                        select * from book= where m.id = ?
                        """,
                new BookRowMapper(),
                id);
        if (books.isEmpty()) {
            return null;
        }
        return books.get(0);
    }



    @Override
    public List<Book> findAll() {
        return jdbcTemplate.query("select * from book", new BookRowMapper());
    }
}
