package com.love.resthome.loveresthome.utils;

import java.security.MessageDigest;

public class Md5Utils {
    private final static String getMd5String(String source) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        try {
            byte[] strTemp = source.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    public final static String getPassWordMd5(String userName, String passWord) {
        return getMd5String(userName + "Love Rest House" + passWord);
    }

//    public static void main(String[] args) {
//        String un = "jfklsajdfklajs";
//        String pwd = "jklsdjflkasjdflkj";
//        System.out.println(Md5Utils.getPassWordMd5(un, pwd));
//    }
}
