package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @InterfaceName IBookService
 * @Description
 * @Author citrus_sugar
 * @Date 2022/3/20 15:02
 */
public interface IBookService extends IService<Book> {
//    可追加功能
    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
