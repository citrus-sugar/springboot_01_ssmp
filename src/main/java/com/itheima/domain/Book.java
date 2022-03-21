package com.itheima.domain;

import lombok.Data;

/**
 * @ClassName Book
 * @Description
 * @Author citrus_sugar
 * @Date 2022/3/19 22:55
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
