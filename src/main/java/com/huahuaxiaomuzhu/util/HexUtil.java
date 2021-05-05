package com.huahuaxiaomuzhu.util;

import java.math.BigInteger;

public class HexUtil {
    /**
     * 通过十进制数返回各个数字的列表
     * @param decimal
     * @return String[],依次是10进制，16进制，8进制，2进制
     */
    public static String[] getGroupByDecimal(String decimal){
        if (decimal.equals("")){
            return new String[5];
        }
        BigInteger dec=new BigInteger(decimal,10);
        String[] result=new String[5];
        result[0]=dec.toString();
        result[1]=dec.toString(16);
        result[2]=dec.toString(8);
        result[3]=dec.toString(2);
        result[4]=dec.toString(32);
        return result;
    }

    /**
     * 通过十六进制数返回各个数字的列表
     * @param hex
     * @return String[],依次是10进制，16进制，8进制，2进制
     */
    public static String[] getGroupByHex(String hex){
        if (hex.equals("")){
            return new String[5];
        }
        BigInteger dec=new BigInteger(hex,16);
        String[] result=new String[5];
        result[0]=dec.toString();
        result[1]=dec.toString(16);
        result[2]=dec.toString(8);
        result[3]=dec.toString(2);
        result[4]=dec.toString(32);
        return result;
    }

    /**
     * 通过八进制数返回各个数字的列表
     * @param oct
     * @return String[],依次是10进制，16进制，8进制，2进制，32进制
     */
    public static String[] getGroupByOct(String oct){
        if (oct.equals("")){
            return new String[5];
        }
        BigInteger dec=new BigInteger(oct,8);
        String[] result=new String[5];
        result[0]=dec.toString();
        result[1]=dec.toString(16);
        result[2]=dec.toString(8);
        result[3]=dec.toString(2);
        result[4]=dec.toString(32);
        return result;
    }

    /**
     * 通过二进制数返回各个数字的列表
     * @param bin
     * @return String[],依次是10进制，16进制，8进制，2进制，32进制
     */
    public static String[] getGroupByBin(String bin){
        if (bin.equals("")){
            return new String[5];
        }
        BigInteger dec=new BigInteger(bin,2);
        String[] result=new String[5];
        result[0]=dec.toString();
        result[1]=dec.toString(16);
        result[2]=dec.toString(8);
        result[3]=dec.toString(2);
        result[4]=dec.toString(32);
        return result;
    }

    /**
     * 通过32进制数返回各个数字的列表
     * @param thirtyBin
     * @return  String[],依次是10进制，16进制，8进制，2进制，32进制
     */
    public static String[] getGroupBy32(String thirtyBin){
        if (thirtyBin.equals("")){
            return new String[5];
        }
        BigInteger dec=new BigInteger(thirtyBin,32);
        String[] result=new String[5];
        result[0]=dec.toString();
        result[1]=dec.toString(16);
        result[2]=dec.toString(8);
        result[3]=dec.toString(2);
        result[4]=dec.toString(32);
        return result;
    }
}
