package com.huahuaxiaomuzhu.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 恢复乱码.
 * @see com.huahuaxiaomuzhu.ui.listener.EncodeListener
 */
public class EncodeUtil {
    /**
     * 将GBK编码的字符串转换成UTF8编码的字符串.
     * @param GBKString GBK编码的字符串.
     * @return UTF8编码的字符串.
     */
    public static String GBK2UTF8(String GBKString){//古文码
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"UTF-8");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将GBK编码的字符串转换成Windows1252编码的字符串.
     * @param GBKString GBK编码的字符串.
     * @return Windows1252编码的字符串.
     */
    public static String GBK2Windows1252(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将GBK编码的字符串转换成Big5编码的字符串.
     * @param GBKString GBK编码的字符串.
     * @return Big5编码的字符串.
     */
    public static String GBK2Big5(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将GBK编码的字符串转换成ISO8859编码的字符串.
     * @param GBKString GBK编码的字符串.
     * @return ISO8859编码的字符串.
     */
    public static String GBK2ISO8859(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将UTF8编码的字符串转换成GBK编码的字符串.
     * @param UTF8String UTF8编码的字符串.
     * @return GBK编码的字符串.
     */
    public static String UTF8ToGBK(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将UTF8编码的字符串转换成Windows1252编码的字符串.
     * @param UTF8String UTF8编码的字符串.
     * @return Windows1252编码的字符串.
     */
    public static String UTF8ToWindows1252(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将UTF8编码的字符串转换成Big5编码的字符串.
     * @param UTF8String UTF8编码的字符串.
     * @return Big5编码的字符串.
     */
    public static String UTF8ToBig5(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将UTF8编码的字符串转换成ISO8859编码的字符串.
     * @param UTF8String UTF8编码的字符串.
     * @return ISO8859编码的字符串.
     */
    public static String UTF8ToISO8859(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将ISO8859编码的字符串转换成UTF8编码的字符串.
     * @param ISOString ISO8859编码的字符串.
     * @return UTF8编码的字符串.
     */
    public static String ISO8859ToUTF8(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"UTF-8");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将ISO8859编码的字符串转换成GBK编码的字符串.
     * @param ISOString ISO8859编码的字符串.
     * @return GBK编码的字符串.
     */
    public static String ISO8859ToGBK(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将ISO8859编码的字符串转换成Big5编码的字符串.
     * @param ISOString ISO8859编码的字符串.
     * @return Big5编码的字符串.
     */
    public static String ISO8859ToBig5(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将ISO8859编码的字符串转换成Windows1252编码的字符串.
     * @param ISOString ISO8859编码的字符串.
     * @return Windows1252编码的字符串.
     */
    public static String ISO8859ToWindows1252(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将Big5编码的字符串转换成GBK编码的字符串.
     * @param Big5String Big5编码的字符串.
     * @return GBK编码的字符串.
     */
    public static String Big5ToGBK(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将Big5编码的字符串转换成UTF8编码的字符串.
     * @param Big5String Big5编码的字符串.
     * @return UTF8编码的字符串.
     */
    public static String Big5ToUTF8(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"utf-8");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将Big5编码的字符串转换成Windows1252编码的字符串.
     * @param Big5String Big5编码的字符串.
     * @return Windows1252编码的字符串.
     */
    public static String Big5ToWindows1252(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将Big5编码的字符串转换成ISO8859编码的字符串.
     * @param Big5String Big5编码的字符串.
     * @return ISO8859编码的字符串.
     */
    public static String Big5ToISO8859(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }

    /**
     * 将Windows1252编码的字符串转换成GBK编码的字符串.
     * @param Windows1252String Windows1252编码的字符串.
     * @return GBK编码的字符串.
     */
    public static String Windows1252ToGBK(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将Windows1252编码的字符串转换成UTF8编码的字符串.
     * @param Windows1252String Windows1252编码的字符串.
     * @return UTF8编码的字符串.
     */
    public static String Windows1252ToUTF8(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"utf-8");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将Windows1252编码的字符串转换成Big5编码的字符串.
     * @param Windows1252String Windows1252编码的字符串.
     * @return Big5编码的字符串.
     */
    public static String Windows1252ToBig5(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }

    /**
     * 将Windows1252编码的字符串转换成ISO8859编码的字符串.
     * @param Windows1252String Windows1252编码的字符串.
     * @return ISO8859编码的字符串.
     */
    public static String Windows1252ToISO8859(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
}
