package com.bamboo.nio;

import cn.hutool.http.HttpUtil;

/**
 * @author guoqing
 * @date 2021/3/28 16:50
 */
public class HttpClient {


    public static void main(String[] args) {

        String result1 = HttpUtil.get("http://localhost:8803/");
        System.out.printf(result1);
    }
}