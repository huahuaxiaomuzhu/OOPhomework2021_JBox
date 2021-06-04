package com.huahuaxiaomuzhu.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 使用MD5算法对文本加密.
 * @see com.huahuaxiaomuzhu.ui.listener.MD5Listener
 */
public class MD5Util{
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /**
     * MD5加密.
     * @param nativeString 加密前的字符串.
     * @return MD5加密后的字符串.
     */
    public static String toMD5(String nativeString){
        byte[] secretBytes = null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            secretBytes= MessageDigest.getInstance("md5").digest(nativeString.getBytes());
        }catch (NoSuchAlgorithmException e){
            return "不支持MD5";
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

    /**
     * SHA1加密.
     * @param nativeString 加密前的字符串.
     * @return SHA1加密后的字符串.
     */
    public static String toSHA1(String nativeString){
        byte[] secretBytes=null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("SHA1");
            messageDigest.update(nativeString.getBytes());
            secretBytes=messageDigest.digest();
            int len = secretBytes.length;
            StringBuilder buf = new StringBuilder(len * 2);
            // 把密文转换成十六进制的字符串形式
            for (int j = 0; j < len; j++) {
                buf.append(HEX_DIGITS[(secretBytes[j] >> 4) & 0x0f]);
                buf.append(HEX_DIGITS[secretBytes[j] & 0x0f]);
            }
            return buf.toString();
        }catch (NoSuchAlgorithmException e){
          return "不支持SHA1";
        }
    }

    /**
     * SHA224加密.
     * @param nativeString 加密前的字符串.
     * @return SHA224加密后的字符串.
     */
    public static String toSHA224(String nativeString){
        byte[] secretBytes=null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            secretBytes=MessageDigest.getInstance("SHA-224").digest(nativeString.getBytes());
            String sha224code = new BigInteger(1, secretBytes).toString(16);
            for (int i = 0; i < 32 - sha224code.length(); i++) {
                sha224code = "0" + sha224code;
            }
            return sha224code;
        }catch (NoSuchAlgorithmException e){
           return "不支持SHA224";
        }
    }

    /**
     * SHA256加密.
     * @param nativeString 加密前的字符串.
     * @return SHA256加密后的字符串.
     */
    public static String toSHA256(String nativeString){
        byte[] secretBytes=null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            secretBytes=MessageDigest.getInstance("SHA-256").digest(nativeString.getBytes());
            String sha256code=new BigInteger(1,secretBytes).toString(16);
            for (int i=0;i<32-sha256code.length();i++){
                sha256code="0"+sha256code;
            }
            return sha256code;
        }catch (NoSuchAlgorithmException e){
            return "不支持SHA256";
        }
    }

    /**
     * SHA384加密.
     * @param nativeString 加密前的字符串.
     * @return SHA384加密后的字符串.
     */
    public static String toSHA384(String nativeString){
        byte[] secretBytes=null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            secretBytes=MessageDigest.getInstance("SHA-384").digest(nativeString.getBytes());
            String sha384code=new BigInteger(1,secretBytes).toString(16);
            for (int i=0;i<32-sha384code.length();i++){
                sha384code="0"+sha384code;
            }
            return sha384code;
        }catch (NoSuchAlgorithmException e){
            return "不支持SHA-384";
        }
    }

    /**
     * SHA512加密.
     * @param nativeString 加密前的字符串.
     * @return SHA512加密后的字符串.
     */
    public static String toSHA512(String nativeString){
        byte[] secretBytes=null;
        if (nativeString.equals("")){
            return "";
        }
        try {
            secretBytes=MessageDigest.getInstance("SHA-512").digest(nativeString.getBytes());
            String sha512code=new BigInteger(1,secretBytes).toString(16);
            for (int i=0;i<32-sha512code.length();i++){
                sha512code="0"+sha512code;
            }
            return sha512code;
        }catch (NoSuchAlgorithmException e){
            return "不支持SHA512";
        }
    }
}
