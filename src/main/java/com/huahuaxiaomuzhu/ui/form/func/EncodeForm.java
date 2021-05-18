package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class EncodeForm {
    private JPanel encodePanel;
    private JTextArea rawText;
    private JTextArea UTF8ToISO8859Text;
    private JTextArea ISO8859ToUTF8Text;
    private JTextArea ISO8859ToGBKText;
    private JTextArea ISO8859ToBig5Text;
    private JTextArea Big5ToGBKText;
    private JTextArea ISO8859ToWindows1252Text;
    private JTextArea Big5ToUTF8Text;
    private JTextArea Big5ToWindows1252Text;
    private JTextArea Big5ToISO8859Text;
    private JTextArea Windows1252ToGBKText;
    private JTextArea Windows1252ToUTF8;
    private JTextArea UTF8ToBig5Text;
    private JTextArea Windows1252ToBig5Text;
    private JTextArea UTF8ToWindows1252Text;
    private JTextArea UTF8ToGBKText;
    private JTextArea GBK2ISO8859Text;
    private JTextArea GBK2Big5Text;
    private JTextArea GBK2Windows1252Text;
    private JTextArea GBK2UTF8Text;
    private JTextArea Windows1252ToISO8859Text;

    public JTextArea getRawText() {
        return rawText;
    }

    public JTextArea getUTF8ToISO8859Text() {
        return UTF8ToISO8859Text;
    }

    public JTextArea getISO8859ToUTF8Text() {
        return ISO8859ToUTF8Text;
    }

    public JTextArea getISO8859ToGBKText() {
        return ISO8859ToGBKText;
    }

    public JTextArea getISO8859ToBig5Text() {
        return ISO8859ToBig5Text;
    }

    public JTextArea getBig5ToGBKText() {
        return Big5ToGBKText;
    }

    public JTextArea getISO8859ToWindows1252Text() {
        return ISO8859ToWindows1252Text;
    }

    public JTextArea getBig5ToUTF8Text() {
        return Big5ToUTF8Text;
    }

    public JTextArea getBig5ToWindows1252Text() {
        return Big5ToWindows1252Text;
    }

    public JTextArea getBig5ToISO8859Text() {
        return Big5ToISO8859Text;
    }

    public JTextArea getWindows1252ToGBKText() {
        return Windows1252ToGBKText;
    }

    public JTextArea getWindows1252ToUTF8() {
        return Windows1252ToUTF8;
    }

    public JTextArea getUTF8ToBig5Text() {
        return UTF8ToBig5Text;
    }

    public JTextArea getWindows1252ToBig5Text() {
        return Windows1252ToBig5Text;
    }

    public JTextArea getUTF8ToWindows1252Text() {
        return UTF8ToWindows1252Text;
    }

    public JTextArea getUTF8ToGBKText() {
        return UTF8ToGBKText;
    }

    public JTextArea getGBK2ISO8859Text() {
        return GBK2ISO8859Text;
    }

    public JTextArea getGBK2Big5Text() {
        return GBK2Big5Text;
    }

    public JTextArea getGBK2Windows1252Text() {
        return GBK2Windows1252Text;
    }

    public JTextArea getGBK2UTF8Text() {
        return GBK2UTF8Text;
    }

    public JTextArea getWindows1252ToISO8859Text() {
        return Windows1252ToISO8859Text;
    }
    public JPanel getEncodePanel() {
        return encodePanel;
    }

    private EncodeForm(){}
    private static EncodeForm encodeForm;
    public static EncodeForm getInstance(){
        if (encodeForm==null){
            encodeForm=new EncodeForm();
        }
        return encodeForm;
    }
}
