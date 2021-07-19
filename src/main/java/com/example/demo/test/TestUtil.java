package com.example.demo.test;


import cn.hutool.crypto.SecureUtil;

public class TestUtil {

    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        String sign = SecureUtil.sha1().digestHex("1@test.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
//        String sign = SecureUtil.sha1().digestHex("chengjunlai@udesk.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
        System.out.println(sign);
    }

}
