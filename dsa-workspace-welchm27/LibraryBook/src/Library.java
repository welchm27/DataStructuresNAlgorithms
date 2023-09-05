import java.util.List;

public class Library {

    private final List<Book> books;

    Library(List<Book> books){
        this.books = books;
    }

    public List<Book> getListOfBooks(){
        return books;
    }

}   // END OF CLASS