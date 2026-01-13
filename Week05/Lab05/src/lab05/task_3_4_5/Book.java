package lab05.task_3_4_5;

public class Book {
    private String title;
    private String[] authors;
    private String publisher;
    private int publishedYear;
    private int edition = 1;
    private int pages;
    private String isbn;
    
    public Book() {
        this("",new String[]{""},"",
        2025,1,1,"1234567890");
    }
    public Book(String title, String[] authors, String publisher, int publishedYear, int edition, int pages,
            String isbn) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.edition = edition;
        this.pages = pages;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String[] getAuthors() {
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
