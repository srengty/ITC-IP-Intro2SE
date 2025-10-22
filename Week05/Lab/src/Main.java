import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Book b1 = new Book("Java for dummies","Barry Burd", 325,
            "Wiley India", 2000);
        //ArrayList has dynamic length depends on number of elements
        ArrayList<Book> books = new ArrayList<>();
        int option;
        while(true){
            System.out.print("""
------------------------- Menu ------------------------- 
  1. List students 
  2. Add a new student (use prototype) 
  3. Create multiple students (use prototype) 
  4. Update a student by index 
  5. Remove a student by index 
  6. Remove all students 
  0. Exit 
-------------------------------------------------------- 
> Choose an option:
""");
            option = sc.nextInt(); sc.nextLine();
            switch (option) {
                case 1: listBooks(books); break;
                case 2: addBook(b1, books); break;
                default:
                    break;
            }
        }
    }
    public static void addBook(Book prototype, ArrayList<Book> books){
        Book clone = prototype.clone();
        System.out.printf("Input title [%s]: ",clone.getTitle());
        String title=sc.nextLine();
        if(!title.isBlank()) clone.setTitle(title);
        
        System.out.printf("Input author [%s]: ",clone.getAuthor());
        String author=sc.nextLine();
        if(!author.isBlank()) clone.setAuthor(author);
        
        System.out.printf("Input pages [%d]: ",clone.getPages());
        String pages=sc.nextLine();
        if(!pages.isBlank()) clone.setPages(Integer.parseInt(pages));

        System.out.printf("Input publisher [%s]: ",clone.getPublisher());
        String publisher=sc.nextLine();
        if(!publisher.isBlank()) clone.setPublisher(publisher);

        System.out.printf("Input published Year [%d]: ",clone.getPublishedYear());
        String publishedYear=sc.nextLine();
        if(!publishedYear.isBlank()) clone.setPublishedYear(Integer.parseInt(publishedYear));

        books.add(clone);
    }
    public static void listBooks(ArrayList<Book> books){
        System.out.println("----- Books list -------");
        for (Book book : books) {
            System.out.printf("\"%s\" by %s (%d pages)\n",
                book.getTitle(), book.getAuthor(), book.getPages());
        }
        System.out.println("-----------------------");
    }
}
