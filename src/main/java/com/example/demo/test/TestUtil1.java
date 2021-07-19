package com.example.demo.test;


import cn.hutool.crypto.SecureUtil;

public class TestUtil1 {

    public static void main(String[] args) {
        Long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        String params = "csm" + ":" + "260e26d2035f6c2da8b0ed1a95b5fa08423c1f1598aa5a6f1c2a0d0112ae8e88199db84b9edcf692cda0ce0dd08075c952cd976de45259d1c8ecedb2d7698583" + ":" + timestamp;
        String sign = SecureUtil.md5().digestHex(params);
        System.out.println(sign);
    }

}
