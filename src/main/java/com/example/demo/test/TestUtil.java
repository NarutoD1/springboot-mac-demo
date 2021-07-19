package com.example.demo.test;


import cn.hutool.crypto.SecureUtil;

public class TestUtil {

    public static void main(String[] args) {
//        productItem();
        custom();
    }

    private static void productItem() {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        String sign = SecureUtil.sha1().digestHex("1@test.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
//        String sign = SecureUtil.sha1().digestHex("chengjunlai@udesk.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
        System.out.println("新增产品开通视图");
        System.out.println(sign);
        System.out.println("删除产品开通视图");
//        String uniqueFieldValue = "1qa86";
//        String sign2 = SecureUtil.sha1().digestHex("itemId&productActiveItem&chengjunlai@udesk.cn&"+uniqueFieldValue+"&" + timeMillis + "&we39f8f99c293f23d46a0bf40050becd");
        String uniqueFieldValue = "1CS108";
        String sign2 = SecureUtil.sha1().digestHex("itemId&productActiveItem&chengjunlai@udesk.cn&"+uniqueFieldValue+"&" + timeMillis + "&we39f8f99c293f23d46a0bf40050becd");
        System.out.println(sign2);
    }

    private static void custom() {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        String sign = SecureUtil.sha1().digestHex("1@test.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
//        String sign = SecureUtil.sha1().digestHex("chengjunlai@udesk.cn&"+timeMillis+"&we39f8f99c293f23d46a0bf40050becd");
        System.out.println("新增客户");
        System.out.println(sign);
        System.out.println("删除客户");
//        String uniqueFieldValue = "1qa86";
//        String sign2 = SecureUtil.sha1().digestHex("itemId&productActiveItem&chengjunlai@udesk.cn&"+uniqueFieldValue+"&" + timeMillis + "&we39f8f99c293f23d46a0bf40050becd");
        String uniqueFieldValue = "CUS201939058";
        String sign2 = SecureUtil.sha1().digestHex("customerId&custom&chengjunlai@udesk.cn&"+uniqueFieldValue+"&" + timeMillis + "&we39f8f99c293f23d46a0bf40050becd");
        System.out.println(sign2);
    }

}
