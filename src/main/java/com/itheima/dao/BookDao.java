package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName BookDao
 * @Description
 * @Author citrus_sugar
 * @Date 2022/3/19 23:16
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
