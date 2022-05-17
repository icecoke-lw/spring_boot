package com.jou.mapper;

import com.jou.pojo.Book;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBook(int id);
    int updateBook(Book book);
    List<Book> queryBook(String name);
    List<Book> getAll();
    Book queryId(int id);

}
