package com.huahuaxiaomuzhu.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 通过文本生成二维码.
 * @see com.huahuaxiaomuzhu.ui.listener.QRCodeListener
 */
public class QRCodeUtil {
    /**
     * 生成二维码
     * @param msg 文本字符串.
     * @return 生成的二维码图象.
     */
    public static Image Encode(String msg){
        try {
            if (msg.equals("")){
                msg="内容不能是空的";
            }
            BitMatrix bitMatrix= new MultiFormatWriter().encode(new String(msg.getBytes(StandardCharsets.UTF_8),"ISO-8859-1"), BarcodeFormat.QR_CODE,200,200);
            System.out.println(bitMatrix);
            BufferedImage b =MatrixToImageWriter.toBufferedImage(bitMatrix);
            return b;
        } catch (WriterException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
