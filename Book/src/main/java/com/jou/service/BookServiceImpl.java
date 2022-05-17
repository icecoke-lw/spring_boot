package com.jou.service;

import com.jou.mapper.BookMapper;
import com.jou.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Boolean addBook(Book book) {
        return bookMapper.addBook(book)>0;
    }

    @Override
    public Boolean deleteBook(int id) {
        return bookMapper.deleteBook(id)>0;
    }

    @Override
    public Boolean updateBook(Book book) {
        return bookMapper.updateBook(book)>0;
    }

    @Override
    public List<Book> queryBook(String name) {

        return bookMapper.queryBook(name);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @Override
    public Book queryId(int id) {
        return bookMapper.queryId(id);
    }
}
