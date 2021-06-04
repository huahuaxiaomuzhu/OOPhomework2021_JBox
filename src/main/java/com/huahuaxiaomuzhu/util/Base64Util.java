package com.huahuaxiaomuzhu.util;

import java.util.Base64;

/**
 * 对字符串的base64加密和解密.
 * @see com.huahuaxiaomuzhu.ui.listener.Base64Listener
 */
public class Base64Util {
    /**
     * base64加密.
     * @param nativeStr 需要加密的字符串.
     * @return 加密后生成的字符串.
     */
    public static String nativeToBase64(String nativeStr){
       return new String(Base64.getEncoder().encode(nativeStr.getBytes()));
    }

    /**
     * base64解密.
     * @param base64Str 需要解密的字符串.
     * @return 解密后生成的字符串.
     */
    public static String base64ToNative(String base64Str){
        return new String(Base64.getDecoder().decode(base64Str));
    }
}
