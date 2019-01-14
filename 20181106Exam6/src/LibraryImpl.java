import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;

import java.util.*;

public class LibraryImpl implements Library {

    List<Book> books = new ArrayList<>();

    @Override
    public void takeABook(Book book) {
        if (!books.contains(book)) {
        books.add(book);
        }
    }

    @Override
    public int getNumberOfBooks() {
        return books.size();
    }

    @Override
    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return  book;
            }
        }
        return null;
    }

    @Override
    public Collection<Book> findByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public Collection<Book> getBooksSortedByPageCount() {
        Comparator<Book> sortByPageCount = Comparator.comparing(Book::getPageCount);
        Collections.sort(books, sortByPageCount);
        return books;
    }
}
