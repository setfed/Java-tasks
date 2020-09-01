package SimpleClassesAndObjects.Task9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookAggregateController {
    public static void showAuthorsBooks(ArrayList<Book> books, String author) {
        List<Book> sorted = books.stream()
                .filter((Book b1) -> b1.getAuthor().equals(author))
                .collect(Collectors.toList());
        System.out.printf("Showing %s's books\n", author);
        sorted.forEach(System.out::println);
    }

    public static void showPublishersBooks(ArrayList<Book> books, String publisher) {
        List<Book> sorted = books.stream()
                .filter((Book b1) -> b1.getPublisher().equals(publisher))
                .collect(Collectors.toList());
        System.out.printf("Showing %s's books\n", publisher);
        sorted.forEach(System.out::println);
    }

    public static void showBooksAfterYear(ArrayList<Book> books, int publicationYear) {
        List<Book> sorted = books.stream().
                filter((Book b1) -> b1.getPublicationYear() > publicationYear)
                .collect(Collectors.toList());
        System.out.printf("Showing books after %d year\n", publicationYear);
        sorted.forEach(System.out::println);
    }


    public static void main(String[] args) {
        Book book1 = new Book(1, "Приключения Кристи", "Новиков Александр", "Альфина", 2020, 340, 350, "Тверый переплет");
        Book book2 = new Book(2, "Приключения Макса", "Герцогиня Высокая", "Серьезные люди", 2019, 230, 150, "Мягкий переплет");
        Book book3 = new Book(3, "Гай Цезарь: Записки о Галльской войне", "Цезарь Гай Юлий", "Время", 2018, 340, 125, "Тверый переплет");
        Book book4 = new Book(4, "Тринадцать трубок", "Эренбург Илья Григорьевич", "Время", 2018, 340, 125, "Тверый переплет");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        showAuthorsBooks(books, "Новиков Александр");
        System.out.println();
        showPublishersBooks(books, "Альфина");
        System.out.println();
        showBooksAfterYear(books, 2018);

    }
}
