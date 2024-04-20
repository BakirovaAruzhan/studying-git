package everset_academy.BookManagement.User.starter;

import everset_academy.BookManagement.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStarter implements CommandLineRunner {

    JdbcTemplate jdbcTemplate;

    @Autowired // field injection
    @Qualifier("myRepo")
    UserRepository userRepository;

    @Autowired // setter injection
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        createGroupTable();
        createUserTable();
    }

    private void createUserTable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS my_user");
        jdbcTemplate.execute("""
        CREATE TABLE my_user(
          user_id SERIAL primary key,
          first_name varchar(255),
          last_name varchar(255),
          birth_date varchar(255),
          email varchar(255),
          group_id integer,
          FOREIGN KEY(group_id) REFERENCES my_group(group_id)
        )
        """);
    }

    private void createGroupTable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS my_group");
        jdbcTemplate.execute("""
        CREATE TABLE my_group(
          group_id SERIAL primary key,
          name varchar(255)
        )
        """);
    }
}