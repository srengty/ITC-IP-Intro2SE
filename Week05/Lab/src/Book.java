import lombok.Getter;
import lombok.Setter;
// https://projectlombok.org/download
@Getter @Setter
public class Book {
    private String title;
    private String author;
    private int pages;
    private String publisher;
    private int publishedYear;
    public Book(String title, String author, int pages, String publisher, int publishedYear) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }
    public Book clone(){
        return new Book(title,author,pages,publisher,publishedYear);
    }
}
