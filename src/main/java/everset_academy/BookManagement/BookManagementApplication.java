package everset_academy.BookManagement;

import everset_academy.BookManagement.model.Book;
import everset_academy.BookManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BookManagementApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private BookService bookService;

    public void run(String[] args) throws Exception {
        createBooktable();

        Book warriorsInsideMe = new Book(365L, "365 воинов внутри меня. Сила нежных стихов", "Сайн. Ш.", 2021, " Поэзия", "Человек, проживая каждый день, сам того не ведая, ведет борьбу внутри себя: со своими чувствами, мыслями, страхами и сердцем. Каждый день — это один воин.  Его состояние, сила и слабость, которые они проживают вместе.\n" +
                                                                                                                          "\n" +
                                                                                                                          "Каждый день — это воин, который позволяет человеку сделать выбор: идти дальше или стоять на месте. Ибо каждый воин — это урок, который человек обязан пройти.");
        Book jujutsuKaisen = new Book(252L, "Магическая битва", "Акутами Гэгэ, Ballad Kitaguni", 2018, "Приключенческая художественная литература, Тёмное фэнтези, Сверхъестественная фантастика", "Скрытый у всех на виду, бушует вековой конфликт. Сверхъестественные монстры, известные как «Проклятия», терроризируют человечество из тени, " +
                                                                                                                                                                                                   "а могущественные люди, известные как колдуны «дзю-дзюцу», используют мистические искусства, чтобы истребить их.");


        List<Book> bookList = bookService.findAll();
        bookList.forEach(System.out::println);
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
