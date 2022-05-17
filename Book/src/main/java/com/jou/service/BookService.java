package com.jou.service;

import com.jou.pojo.Book;


import java.util.List;

public interface BookService{
        Boolean addBook(Book book);
        Boolean deleteBook(int id);
        Boolean updateBook(Book book);
        List<Book> queryBook(String name);
        List<Book> getAll();
        Book queryId(int id);



}
