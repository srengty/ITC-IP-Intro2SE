package lab05.task_3_4_5;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();
    public List<Book> listAllBooks(){
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }
}
