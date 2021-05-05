package com.huahuaxiaomuzhu.util;

import java.util.Base64;

public class Base64Util {
    /**
     * base64加密
     * @param nativeStr
     * @return
     */
    public static String nativeToBase64(String nativeStr){
       return new String(Base64.getEncoder().encode(nativeStr.getBytes()));
    }

    /**
     * base64解密
     * @param base64str
     * @return
     */
    public static String base64ToNative(String base64str){
        return new String(Base64.getDecoder().decode(base64str));
    }
}
