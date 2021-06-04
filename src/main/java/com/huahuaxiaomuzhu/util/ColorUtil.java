package com.huahuaxiaomuzhu.util;

/**
 * 根据给定的RGB获取颜色.
 * @see com.huahuaxiaomuzhu.ui.listener.ColorListener
 */
public class ColorUtil {
    /**
     * 将RGB转换成十六进制字符串.
     * @param r Red.
     * @param g Green.
     * @param b Blue.
     * @return 十六进制字符串.
     */
    public static String RGBToHex(int r,int g,int b){
        String s="0123456789ABCDEF";
        String hex = "";
        if (r >= 0 && r < 256 && g >= 0 && g < 256 && b >= 0 && b < 256) {
            int x, y, z;
            x = r % 16;
            r = (r - x) / 16;
            y = g % 16;
            g = (g - y) / 16;
            z = b % 16;
            b = (b - z) / 16;
            hex = "#" + s.substring(r, r + 1) + s.substring(x, x + 1) + s.substring(g, g + 1) + s.substring(y, y + 1) + s.substring(b, b + 1) + s.substring(z, z + 1);
        }
        return hex;
    }

    /**
     * 将十六进制字符串转换成RGB.
     * @param hex 十六进制字符串.
     * @return 储存RGB的数组.
     */
    public static int[] HEXToRGB(String hex){
        if (!hex.startsWith("#")){
            return new int[3];
        }
        if (!(hex.length()==7)){
            return new int[3];
        }
        hex=hex.substring(1);
        String R=hex.substring(0,2);
        String G=hex.substring(2,4);
        String B=hex.substring(4);
        try {
            int r=Integer.parseInt(R,16);
            int g=Integer.parseInt(G,16);
            int b=Integer.parseInt(B,16);
            int[] result=new int[3];
            result[0]=r;
            result[1]=g;
            result[2]=b;
            return result;
        }catch (NumberFormatException e){
            return new int[3];
        }
    }
}
