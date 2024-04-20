package everset_academy.BookManagement.User.controller;

import everset_academy.BookManagement.User.domain.User;
import everset_academy.BookManagement.User.repository.JdbcUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final JdbcUserRepository jdbcUserRepository;

    @Autowired
    public UserController(JdbcUserRepository jdbcUserRepository) {
        this.jdbcUserRepository = jdbcUserRepository;
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        jdbcUserRepository.save(user);
        return user;
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return jdbcUserRepository.findAll();
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        System.out.println("Updated rows number: " + jdbcUserRepository.update(user));
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        System.out.println("Delete rows number: " + jdbcUserRepository.deleteById(id));
    }
}