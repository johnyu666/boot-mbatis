package cn.lnfvc.bootmybatis.mapper;



import cn.lnfvc.bootmybatis.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    Book loadBook(int id);
    void addBook(Book book);
    List<Book> findAllBooks();

    void updateBook(@Param("id") int id, @Param("book") Book book);

    void deleteBook(int id);
}
