package com.test.MybatisDemo.dao;

import java.util.List;

import com.test.MybatisDemo.pojo.Book;

public interface BookMapper {
    List<Book> getBookList();

    int getBookListCount();

    List<Book> getBookByKey(Book book);
}
