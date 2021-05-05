package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.MD5Form;
import com.huahuaxiaomuzhu.util.MD5Util;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Locale;

public class MD5Listener {
    private static int upMode=0;
    /**
     * 给MD5加密页面组件添加监听器
     */
    public static void addListeners(){
        MD5Form md5Form=MD5Form.getInstance();
        //实时监听变化
        md5Form.getNativeTextArea().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateAllTextArea();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                updateAllTextArea();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateAllTextArea();
            }
        });
        md5Form.getMd5CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getMD5TextArea().getText()),null);
        });
        md5Form.getSha1CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getSHA1TextArea().getText()),null);
        });
        md5Form.getSha224CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getSHA224TextArea().getText()),null);
        });
        md5Form.getSha256CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getSHA256TextArea().getText()),null);
        });
        md5Form.getSha384CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getSHA384TextArea().getText()),null);
        });
        md5Form.getSha512CopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(md5Form.getSHA512TextArea().getText()),null);
        });
        md5Form.getToLowerCaseButton().addActionListener(e -> {
            upMode=0;
            md5Form.getMD5TextArea().setText(md5Form.getMD5TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getSHA1TextArea().setText(md5Form.getSHA1TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getSHA224TextArea().setText(md5Form.getSHA224TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getSHA256TextArea().setText(md5Form.getSHA256TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getSHA384TextArea().setText(md5Form.getSHA384TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getSHA512TextArea().setText(md5Form.getSHA512TextArea().getText().toLowerCase(Locale.ROOT));
            md5Form.getNativeTextArea().grabFocus();
        });
        md5Form.getToUpperCaseButton().addActionListener(e->{
            upMode=1;
            md5Form.getMD5TextArea().setText(md5Form.getMD5TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getSHA1TextArea().setText(md5Form.getSHA1TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getSHA224TextArea().setText(md5Form.getSHA224TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getSHA256TextArea().setText(md5Form.getSHA256TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getSHA384TextArea().setText(md5Form.getSHA384TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getSHA512TextArea().setText(md5Form.getSHA512TextArea().getText().toUpperCase(Locale.ROOT));
            md5Form.getNativeTextArea().grabFocus();
        });
        md5Form.getNativeClearButton().addActionListener(e -> {
            md5Form.getNativeTextArea().setText("");
        });
    }

    /**
     * 监听输入框变化，实时修改加密内容
     */
    public static void updateAllTextArea(){
        MD5Form md5Form=MD5Form.getInstance();
        if (upMode==0){
        String nativeText=md5Form.getNativeTextArea().getText();
        md5Form.getMD5TextArea().setText(MD5Util.toMD5(nativeText));
        md5Form.getSHA1TextArea().setText(MD5Util.toSHA1(nativeText));
        md5Form.getSHA224TextArea().setText(MD5Util.toSHA224(nativeText));
        md5Form.getSHA256TextArea().setText(MD5Util.toSHA256(nativeText));
        md5Form.getSHA384TextArea().setText(MD5Util.toSHA384(nativeText));
        md5Form.getSHA512TextArea().setText(MD5Util.toSHA512(nativeText));}
        if (upMode==1){
            String nativeText=md5Form.getNativeTextArea().getText();
            md5Form.getMD5TextArea().setText(MD5Util.toMD5(nativeText).toUpperCase(Locale.ROOT));
            md5Form.getSHA1TextArea().setText(MD5Util.toSHA1(nativeText).toUpperCase(Locale.ROOT));
            md5Form.getSHA224TextArea().setText(MD5Util.toSHA224(nativeText).toUpperCase(Locale.ROOT));
            md5Form.getSHA256TextArea().setText(MD5Util.toSHA256(nativeText).toUpperCase(Locale.ROOT));
            md5Form.getSHA384TextArea().setText(MD5Util.toSHA384(nativeText).toUpperCase(Locale.ROOT));
            md5Form.getSHA512TextArea().setText(MD5Util.toSHA512(nativeText).toUpperCase(Locale.ROOT));
        }
    }
}