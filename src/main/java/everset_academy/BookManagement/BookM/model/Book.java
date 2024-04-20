package everset_academy.BookManagement.BookM.model;

public class Book {
    private long id;
    private String title;
    private String author;
    private int release_year;
    private String genre;
    private String description;

    public Book(long id, String title, String author, int release_year, String genre, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.release_year = release_year;
        this.genre = genre;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", release_year=" + release_year +
               ", genre='" + genre + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}
