package everset_academy.BookManagement.BookM.starter;

import everset_academy.BookManagement.BookM.model.Book;
import everset_academy.BookManagement.BookM.repository.JDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BookManagementStarter implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private JDBCRepository jdbcRepository;

    public void run(String[] args) throws Exception {
        createBooktable();
        Book jujutsuKaisen = new Book(252L, "Магическая битва", "Акутами Гэгэ, Ballad Kitaguni", 2018, "Приключенческая художественная литература, Тёмное фэнтези, Сверхъестественная фантастика", "Скрытый у всех на виду, бушует вековой конфликт.");

        Book warriorsInsideMe = new Book(356L, "365 воинов внутри меня. Сила нежных стихов", "Сайн. Ш.", 2021, " Поэзия", "Человек, проживая каждый день, сам того не ведая");


//        List<Book> bookList = bookService.findAll();
//        bookList.forEach(System.out::println);
//        bookService.save(warriorsInsideMe);
//
//
//
        jdbcRepository.save(jujutsuKaisen);
        jdbcRepository.save(warriorsInsideMe);

        List<Book> bookList1 = jdbcRepository.findAll();
        bookList1.forEach(System.out::println);
        System.out.println("-----------------------------");

        jujutsuKaisen.setAuthor("Dayana");
        jdbcRepository.update(jujutsuKaisen);
        System.out.println("-----------------------------");
        List<Book> bookList2 = jdbcRepository.findAll();
        bookList2.forEach(System.out::println);
        System.out.println("--------------deleteById---------------");


        jdbcRepository.deleteById(warriorsInsideMe.getId());
        List<Book> bookList3 = jdbcRepository.findAll();

        bookList3.forEach(System.out::println);






    }

    private void createBooktable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS book");
        jdbcTemplate.execute("""
            CREATE TABLE book (
                id serial,
                author varchar(255),
                genre varchar(255),
                title varchar(255),
                release_year varchar(255),
                description varchar(255)
            )			
            """);
    }

}
