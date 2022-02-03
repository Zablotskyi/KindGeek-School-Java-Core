package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    Author author;
    static long count = 1;
    private long id;
    private String name;
    private int yearOfPrinting;
    private List<Author> authorList = new ArrayList<>();

    public Book(String name, int yearOfPrinting, Author author) {
        this.id = count;
        this.name = name;
        this.yearOfPrinting = yearOfPrinting;
//        this.author.setName(author.getName());
//        this.author.setLastName(author.getLastName());
//        this.author.setBookName(name);
//        authorList.add(author);
        count++;
    }

    public Book(String name, Author author) {
        this.id = count;
        this.name = name;
//        this.author.setName(author.getName());
//        this.author.setLastName(author.getLastName());
//        this.author.setBookName(name);
//        authorList.add(author);
        count++;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Book.count = count;
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

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

    public void setYearOfPrinting(int yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPrinting == book.yearOfPrinting && Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(authorList, book.authorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, id, name, yearOfPrinting, authorList);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", yearOfPrinting=" + yearOfPrinting +
                ", authorList=" + authorList +
                '}';
    }
}
