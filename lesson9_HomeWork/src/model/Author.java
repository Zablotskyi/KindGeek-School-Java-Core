package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Author {
    Book book;
    static long count = 1;
    private long id;
    private String name;
    private String lastName;
    private String bookName;
    private List<Book> bookList = new ArrayList<>();

    public Author(String name, String lastName) {
        this.id = count;
        this.name = name;
        this.lastName = lastName;
        count++;
    }

    public Author(String name, String lastName, String bookName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.bookName = bookName;
//        book.setName(bookName);
//        bookList.add(book);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Author.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Book> getListBooks() {
        return bookList;
    }

    public void setListBooks(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && Objects.equals(book, author.book) && Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && Objects.equals(bookName, author.bookName) && Objects.equals(bookList, author.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, id, name, lastName, bookName, bookList);
    }

    @Override
    public String toString() {
        return "Author{" +
                "book=" + book +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", listBooks=" + bookList +
                '}';
    }
}
