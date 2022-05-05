package com.jou.impl;

import com.jou.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("运行中。。。。");
    }
}
