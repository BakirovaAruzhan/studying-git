package everset_academy.BookManagement.User.repository;

import everset_academy.BookManagement.User.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getLong("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("birth_date"),
                rs.getString("email"),
                rs.getLong("group_id")
        );
    }

}