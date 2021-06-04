package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class Base64Form {
    private static Base64Form base64Form;
    private JPanel Base64Panel;
    private JTextArea nativeTextArea;
    private JTextArea base64TextArea;
    private JPanel ButtonArea;
    private JButton nativeToBase64Button;
    private JButton base64ToNativeButton;
    private JScrollPane nativeScroll;
    private JScrollPane base64Scroll;
    private JButton nativeClearButton;
    private JButton nativeCopyButton;
    private JButton base64ClearButton;
    private JButton base64CopyButton;

    public JButton getNativeClearButton() {
        return nativeClearButton;
    }

    public JButton getNativeCopyButton() {
        return nativeCopyButton;
    }

    public JButton getBase64ClearButton() {
        return base64ClearButton;
    }

    public JButton getBase64CopyButton() {
        return base64CopyButton;
    }

    public JTextArea getNativeTextArea() {
        return nativeTextArea;
    }

    public JTextArea getBase64TextArea() {
        return base64TextArea;
    }

    public JButton getNativeToBase64Button() {
        return nativeToBase64Button;
    }

    public JButton getBase64ToNativeButton() {
        return base64ToNativeButton;
    }

    public JPanel getBase64Panel() {
        return Base64Panel;
    }

    private Base64Form(){
    }
    public static Base64Form getInstance(){
        if (base64Form==null){
            base64Form=new Base64Form();
        }
        return base64Form;
    }
}
