import java.util.ArrayList;
import java.util.List;


public class MainTest {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Coding in JAVA", "J. Eckel");
        Book b2 = new Book("Exile", "R.A. Salvatore");
        Book b3 = new Book("Sojourn", "R.A. Salvatore");

        List<Book> listOfBooks = new ArrayList<Book>();

        listOfBooks.add(b1);
        listOfBooks.add(b2);
        listOfBooks.add(b3);

        Library TLGLibrary = new Library(listOfBooks);

        List<Book> getBooks = TLGLibrary.getListOfBooks();

        for(Book bk : getBooks){
            System.out.println("Title: " + bk.getTitle());
            System.out.println("Author: " + bk.getAuthor());
        }
    }
}   // END OF CLASS