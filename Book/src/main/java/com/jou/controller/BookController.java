package com.jou.controller;

import com.jou.controller.utils.R;
import com.jou.pojo.Book;
import com.jou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public R getAll(){
        return new R(true,bookService.getAll());}
    @PostMapping
    public R add(@RequestBody Book book){
        Boolean flag = bookService.addBook(book);
        return new R(flag,flag ? "添加成功":"添加失败");}
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateBook(book));}
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){return new R(bookService.deleteBook(id));}
    @GetMapping("{name}")
    public R getByName(@PathVariable String name){
        Boolean flag;
        List<Book> books = bookService.queryBook(name);
        if (books.size()==0){
            flag=false;
        }else{
            flag=true;
        }
        return new R(flag,bookService.queryBook(name));}
    @GetMapping("/id/{id}")
    public R queryById(@PathVariable int id){return new R(true,bookService.queryId(id));}



}
