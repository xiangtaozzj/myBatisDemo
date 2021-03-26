package com.test.MybatisDemo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.MybatisDemo.pojo.Book;
import com.test.MybatisDemo.utils.MybatisUtils;

public class BookTest {

    SqlSession sqlSession;

    BookMapper bookMapper;

    @Before
    public void testBookBegin() {
        sqlSession = MybatisUtils.getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }

    @Test
    public void testBook01() {
        List<Book> bookList = bookMapper.getBookList();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    public void testBook02() {
        int count = bookMapper.getBookListCount();
        System.out.println(count);
    }

    @Test
    public void testBook03() {
        Book book = new Book();
        book.setId(16);
        List<Book> bookList = bookMapper.getBookByKey(book);
        System.out.println(bookList.get(0));
    }

    @After
    public void testBookEnd() {
        sqlSession.close();
    }
}
