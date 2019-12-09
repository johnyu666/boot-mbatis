package cn.lnfvc.bootmybatis.controller;

import cn.lnfvc.bootmybatis.Book;
import cn.lnfvc.bootmybatis.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book> findAllBooks(){
        return bookMapper.findAllBooks();
    }

    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
    public Book loadBook(@PathVariable int id){
        return bookMapper.loadBook(id);
    }

    @RequestMapping(value = "/books",method = RequestMethod.POST)
    public Book addBook(@RequestBody  Book book){
        bookMapper.addBook(book);
        return book;
    }

    @RequestMapping(value = "/books/{id}",method = RequestMethod.PUT)
    public Book updateBook(@PathVariable int id,@RequestBody  Book book){
        bookMapper.updateBook(id,book);
        book.setId(id);
        return book;
    }
    @RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable  int id){
        bookMapper.deleteBook(id);
        return "{}";
    }
}
