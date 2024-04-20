package everset_academy.BookManagement.BookM.repository;

import everset_academy.BookManagement.BookM.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Book(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("author"),
                rs.getInt("release_year"),
                rs.getString("genre"),
                rs.getString("description")
        );
    }


}


