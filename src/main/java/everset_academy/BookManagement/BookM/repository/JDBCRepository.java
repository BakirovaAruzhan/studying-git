package everset_academy.BookManagement.BookM.repository;

import everset_academy.BookManagement.BookM.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JDBCRepository implements BookRepository {
    private final JdbcTemplate jdbcTemplate;

    public JDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(Book book) {
        return jdbcTemplate.update("""
                insert into book(id, author, genre, release_year,title, description) 
                values (?,?,?,?,?,?)
                """, book.getId(), book.getAuthor(), book.getGenre(), book.getRelease_year(), book.getTitle(), book.getDescription());
    }


    @Override
    public int update(Book book) {
        return jdbcTemplate.update("""
                update book
                set author = ?,
                genre = ?,
                release_year = ?,
                title = ?,
                description = ?
                where id =?
                """, book.getAuthor(), book.getGenre(), book.getRelease_year(), book.getTitle(), book.getDescription(), book.getId()
        );

    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete from book where  id = ?", id);
    }


    @Override
    public List<Book> findAll() {
        return jdbcTemplate.query("select * from book", new BookRowMapper());
    }

    @Override
    public Book findID(Long id) {
        List<Book> bookList = jdbcTemplate.query("select * from book where id=? ", new BookRowMapper(), id);
        if (bookList.isEmpty()){
            return null;
        }

        return bookList.get(0);
    }


}
