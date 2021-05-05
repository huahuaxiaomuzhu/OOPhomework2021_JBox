package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class MD5Form {
    private static MD5Form md5Form;
    private JPanel MD5Panel;
    private JButton toLowerCaseButton;
    private JButton toUpperCaseButton;
    private JTextArea nativeTextArea;
    private JTextArea MD5TextArea;
    private JTextArea SHA1TextArea;
    private JTextArea SHA224TextArea;
    private JTextArea SHA256TextArea;
    private JTextArea SHA384TextArea;
    private JTextArea SHA512TextArea;
    private JButton nativeClearButton;
    private JButton md5CopyButton;
    private JButton sha1CopyButton;
    private JButton sha224CopyButton;
    private JButton sha256CopyButton;
    private JButton sha384CopyButton;
    private JButton sha512CopyButton;

    public JPanel getMD5Panel() {
        return MD5Panel;
    }

    public JButton getToLowerCaseButton() {
        return toLowerCaseButton;
    }

    public JButton getToUpperCaseButton() {
        return toUpperCaseButton;
    }

    public JTextArea getNativeTextArea() {
        return nativeTextArea;
    }

    public JTextArea getMD5TextArea() {
        return MD5TextArea;
    }

    public JTextArea getSHA1TextArea() {
        return SHA1TextArea;
    }

    public JTextArea getSHA224TextArea() {
        return SHA224TextArea;
    }

    public JTextArea getSHA256TextArea() {
        return SHA256TextArea;
    }

    public JTextArea getSHA384TextArea() {
        return SHA384TextArea;
    }

    public JTextArea getSHA512TextArea() {
        return SHA512TextArea;
    }

    public JButton getNativeClearButton() {
        return nativeClearButton;
    }

    public JButton getMd5CopyButton() {
        return md5CopyButton;
    }

    public JButton getSha1CopyButton() {
        return sha1CopyButton;
    }

    public JButton getSha224CopyButton() {
        return sha224CopyButton;
    }

    public JButton getSha256CopyButton() {
        return sha256CopyButton;
    }

    public JButton getSha384CopyButton() {
        return sha384CopyButton;
    }

    public JButton getSha512CopyButton() {
        return sha512CopyButton;
    }

    private MD5Form(){}
    public static MD5Form getInstance(){
    if (md5Form==null){
        md5Form=new MD5Form();
    }
    return md5Form;
    }
}
