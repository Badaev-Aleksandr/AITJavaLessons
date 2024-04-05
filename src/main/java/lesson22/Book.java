package lesson22;

import java.util.Objects;

/*
 **Задача**: Создайте класс `Book` с полями `title` и `author`.
 * Затем создайте `HashSet` для объектов `Book` и добавьте в него несколько книг,
 * включая дубликаты. Реализуйте методы `equals` и `hashCode` для корректной работы `HashSet`.
 * Выведите размер `HashSet` после добавления книг.
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
