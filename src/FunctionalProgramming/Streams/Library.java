package FunctionalProgramming.Streams;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book -> {
            return book.getTitle().startsWith("N");
        }).forEach(System.out::println);

    }
    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Wong","In the middle of sky"));
        books.add(new Book("Lucky Plaza","Talk To the Universe"));
        books.add(new Book("Abby Liu","NongTang Diary"));
        return books;
    }

}


