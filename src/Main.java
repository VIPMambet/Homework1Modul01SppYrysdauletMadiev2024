public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создаем книги
        Book book1 = new Book("Путь Абая", "Мухтар Ауэзов", "123456789", 3);
        Book book2 = new Book("Кыз Жибек", "Ермек Турсунов", "987654321", 2);

        // Добавляем книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);

        Reader reader1 = new Reader("Алия", 1);
        Reader reader2 = new Reader("Ержан", 2);

        // Регистрируем читателей
        library.registerReader(reader1);
        library.registerReader(reader2);

        // Выдаем книги читателям
        library.lendBook(book1, reader1);
        library.lendBook(book1, reader2);

        // Возвращаем книгу в библиотеку
        library.returnBook(book1);

        // Удаление книги и читателя
        library.removeBook(book2);
        library.removeReader(reader2);
    }
}