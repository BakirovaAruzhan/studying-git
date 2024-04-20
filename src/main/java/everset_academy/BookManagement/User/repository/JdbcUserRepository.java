package everset_academy.BookManagement.User.repository;

import everset_academy.BookManagement.User.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("myRepo")
public class JdbcUserRepository implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired // DI
    public JdbcUserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(User user) {
        return jdbcTemplate.update("""
        insert into my_user(first_name, last_name, birth_date, email, group_id)
        values(?,?,?,?,?)
        """, user.getFirstName(), user.getLastName(), user.getBirthDate(), user.getEmail(), user.getGroupId());
    }

    @Override
    public User findById(Long id) {
        List<User> users = jdbcTemplate.query("""
            select * from my_user m where m.user_id = ?
            """,
                new UserRowMapper(),
                id);

        if (users.isEmpty()) {
            return null;
        }

        return users.get(0);
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from my_user", new UserRowMapper());
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("""
              update my_user
              set first_name = ?,
                  last_name = ?,
                  birth_date = ?,
                  email = ?,
                  group_id = ?,
              where user_id = ?
            """,
                user.getFirstName(), user.getLastName(), user.getBirthDate(),
                user.getEmail(), user.getId()
        );
    }

    @Override
    public int deleteById(Long id) {
        return jdbcTemplate.update("delete my_user where user_id = ?", id);
    }

    @Override
    public int count() {
        return jdbcTemplate.queryForObject("select count(*) from my_user", Integer.class);
    }
}