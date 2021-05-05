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

    public JScrollPane getNativeScroll() {
        return nativeScroll;
    }

    public void setNativeScroll(JScrollPane nativeScroll) {
        this.nativeScroll = nativeScroll;
    }

    public JScrollPane getBase64Scroll() {
        return base64Scroll;
    }

    public void setBase64Scroll(JScrollPane base64Scroll) {
        this.base64Scroll = base64Scroll;
    }

    public JButton getNativeClearButton() {
        return nativeClearButton;
    }

    public void setNativeClearButton(JButton nativeClearButton) {
        this.nativeClearButton = nativeClearButton;
    }

    public JButton getNativeCopyButton() {
        return nativeCopyButton;
    }

    public void setNativeCopyButton(JButton nativeCopyButton) {
        this.nativeCopyButton = nativeCopyButton;
    }

    public JButton getBase64ClearButton() {
        return base64ClearButton;
    }

    public void setBase64ClearButton(JButton base64ClearButton) {
        this.base64ClearButton = base64ClearButton;
    }

    public JButton getBase64CopyButton() {
        return base64CopyButton;
    }

    public void setBase64CopyButton(JButton base64CopyButton) {
        this.base64CopyButton = base64CopyButton;
    }

    public JTextArea getNativeTextArea() {
        return nativeTextArea;
    }

    public void setNativeTextArea(JTextArea nativeTextArea) {
        this.nativeTextArea = nativeTextArea;
    }

    public JTextArea getBase64TextArea() {
        return base64TextArea;
    }

    public void setBase64TextArea(JTextArea base64TextArea) {
        this.base64TextArea = base64TextArea;
    }

    public JButton getNativeToBase64Button() {
        return nativeToBase64Button;
    }

    public void setNativeToBase64Button(JButton nativeToBase64Button) {
        this.nativeToBase64Button = nativeToBase64Button;
    }

    public JButton getBase64ToNativeButton() {
        return base64ToNativeButton;
    }

    public void setBase64ToNativeButton(JButton base64ToNativeButton) {
        this.base64ToNativeButton = base64ToNativeButton;
    }

    public JPanel getBase64Panel() {
        return Base64Panel;
    }


    public JTextArea getTextArea2() {
        return base64TextArea;
    }

    public void setTextArea2(JTextArea textArea2) {
        this.base64TextArea = textArea2;
    }

    public JPanel getButtonArea() {
        return ButtonArea;
    }

    public void setButtonArea(JPanel buttonArea) {
        ButtonArea = buttonArea;
    }

    public void setBase64Panel(JPanel base64Panel) {
        Base64Panel = base64Panel;
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
