package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.Base64Form;
import com.huahuaxiaomuzhu.util.Base64Util;

import java.awt.*;
import java.awt.datatransfer.*;


public class Base64Listener {
    /**
     * 给base64加密页面组件添加监听器
     */
    public static void addListeners(){
        Base64Form base64Form=Base64Form.getInstance();
        //->加密
        base64Form.getNativeToBase64Button().addActionListener(e -> {
            String nativeText=base64Form.getNativeTextArea().getText();
            String base64Text= Base64Util.nativeToBase64(nativeText);
            base64Form.getBase64TextArea().setText(base64Text);
            base64Form.getBase64TextArea().setCaretPosition(0);
            base64Form.getBase64TextArea().grabFocus();
        });
        //<-解密
        base64Form.getBase64ToNativeButton().addActionListener(e -> {
            String base64Text=base64Form.getBase64TextArea().getText();
            try {
                String nativeText=Base64Util.base64ToNative(base64Text);
                base64Form.getNativeTextArea().setText(nativeText);
                base64Form.getNativeTextArea().setCaretPosition(0);
                base64Form.getNativeTextArea().grabFocus();
            }catch (IllegalArgumentException e1){
                base64Form.getBase64TextArea().setText("错误：这不是有效的base64加密内容");
                base64Form.getBase64TextArea().setCaretPosition(0);
                base64Form.getBase64TextArea().grabFocus();
            }
        });
        base64Form.getNativeClearButton().addActionListener(e -> {
            base64Form.getNativeTextArea().setText("");
            base64Form.getNativeTextArea().setCaretPosition(0);
            base64Form.getNativeTextArea().grabFocus();
        });
        base64Form.getNativeCopyButton().addActionListener(e ->{
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(base64Form.getNativeTextArea().getText()),null);
        });
        base64Form.getBase64ClearButton().addActionListener(e -> {
            base64Form.getBase64TextArea().setText("");
            base64Form.getBase64TextArea().setCaretPosition(0);
            base64Form.getBase64TextArea().grabFocus();
        });
        base64Form.getBase64CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(base64Form.getBase64TextArea().getText()),null);
        });
    }
}
