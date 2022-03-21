package com.itheima.controller.utils;

import lombok.Data;

/**
 * @ClassName R
 * @Description
 * @Author citrus_sugar
 * @Date 2022/3/20 16:00
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R() {}

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
