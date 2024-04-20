package everset_academy.BookManagement.User.repository;

import everset_academy.BookManagement.User.domain.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcGroupRepository implements GroupRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcGroupRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final GroupRowMapper GROUP_ROW_MAPPER = new GroupRowMapper();
    private static final UserRowMapper USER_ROW_MAPPER = new UserRowMapper();

    @Override
    public Group save(Group group) {
        jdbcTemplate.update("""
        insert into my_group(name)
        values(?)
        """, group.getName());
        return group;
    }

    @Override
    public Group findById(Long id) {
        return jdbcTemplate.query("""
            select * from my_group
            left join my_user using(group_id)
            where my_group.group_id = ?
            """,
                rs -> {
                    Group group = null;
                    int row = 0;

                    while (rs.next()) {
                        if (group == null) {
                            group = GROUP_ROW_MAPPER.mapRow(rs, row);
                        }
                        group.getUsers().add(USER_ROW_MAPPER.mapRow(rs, row));
                        row++;
                    }

                    return group;
                },
                id);
    }

    @Override
    public Group findByID(long id) {
        return null;
    }
}