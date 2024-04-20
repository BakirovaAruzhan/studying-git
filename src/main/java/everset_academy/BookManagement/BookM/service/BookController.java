package everset_academy.BookManagement.BookM.service;

import everset_academy.BookManagement.BookM.model.Book;
import everset_academy.BookManagement.BookM.repository.JDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private  final JDBCRepository jdbcRepository;


    @Autowired
    public BookController(JDBCRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;

    }
    @GetMapping("/all")
    public List<Book> findAll( ){
        return jdbcRepository.findAll();
    }

    @PostMapping("/update")
    public Book update(@RequestBody Book book){
        jdbcRepository.update( book);
        return book;
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book book){
        jdbcRepository.save( book);
        return book;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id){
        System.out.println("UPD row num:" + jdbcRepository.deleteById(id));
    }

    @GetMapping("/findID/{id}")
    public Book findID(@PathVariable long id ){
        return jdbcRepository.findID(id);
    }



}
