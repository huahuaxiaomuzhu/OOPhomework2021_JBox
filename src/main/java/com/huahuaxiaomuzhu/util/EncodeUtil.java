package com.huahuaxiaomuzhu.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class EncodeUtil {
    public static String GBK2UTF8(String GBKString){//古文码
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"UTF-8");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String GBK2Windows1252(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String GBK2Big5(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String GBK2ISO8859(String GBKString){
        try {
            byte[] bytes=GBKString.getBytes("GBK");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String UTF8ToGBK(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String UTF8ToWindows1252(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String UTF8ToBig5(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String UTF8ToISO8859(String UTF8String){
        try {
            byte[] bytes=UTF8String.getBytes(StandardCharsets.UTF_8);
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String ISO8859ToUTF8(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"UTF-8");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String ISO8859ToGBK(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String ISO8859ToBig5(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String ISO8859ToWindows1252(String ISOString){
        try {
            byte[] bytes=ISOString.getBytes("ISO8859-1");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String Big5ToGBK(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String Big5ToUTF8(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"utf-8");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String Big5ToWindows1252(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"windows-1252");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String Big5ToISO8859(String Big5String){
        try {
            byte[] bytes=Big5String.getBytes("Big5");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "???????";
        }
    }
    public static String Windows1252ToGBK(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"GBK");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String Windows1252ToUTF8(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"utf-8");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String Windows1252ToBig5(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"Big5");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
    public static String Windows1252ToISO8859(String Windows1252String){
        try {
            byte[] bytes=Windows1252String.getBytes("windows-1252");
            return new String(bytes,"ISO8859-1");
        }catch (UnsupportedEncodingException e){
            return "????????";
        }
    }
}
