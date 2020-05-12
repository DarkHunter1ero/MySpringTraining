package uy.diego.silva.service;

import org.springframework.stereotype.Service;
import uy.diego.silva.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<Book> findAll(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Harry Potter"));
        books.add(new Book(2, "Lord Of The Rings"));
        books.add(new Book(3, "Withcer"));

        return books;
    }
}
