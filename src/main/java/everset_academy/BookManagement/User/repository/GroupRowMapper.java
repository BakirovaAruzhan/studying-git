package everset_academy.BookManagement.User.repository;


import everset_academy.BookManagement.User.domain.Group;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupRowMapper implements RowMapper<Group> {

    @Override
    public Group mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Group(
                rs.getLong("group_id"),
                rs.getString("name")
        );
    }
}