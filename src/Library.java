import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(Reader reader) {
        readers.remove(reader);
    }

    public boolean lendBook(Book book, Reader reader) {
        if (book.isAvailable()) {
            book.lend();
            System.out.println("Книга " + book.getTitle() + " выдана читателю " + reader.getName());
            return true;
        }
        System.out.println("Книга " + book.getTitle() + " недоступна.");
        return false;
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Книга " + book.getTitle() + " возвращена в библиотеку.");
    }

    // Дополнительные методы для поиска книги или читателя можно добавить по необходимости.
}
