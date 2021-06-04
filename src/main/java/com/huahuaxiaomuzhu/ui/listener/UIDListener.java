package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.UIDForm;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Locale;
import java.util.UUID;

/**
 * 给UID页面组件添加监听器.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class UIDListener {
    /**
     * 添加监听器.
     */
    public static void addListeners(){
        UIDForm uidForm=UIDForm.getInstance();
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        uidForm.getRandomButton().addActionListener(e -> {
            updateAll();
        });
        uidForm.getCopySmallUUID().addActionListener(e -> {
            clipboard.setContents(new StringSelection(uidForm.getSmallUUID().getText()),null);
        });
        uidForm.getCopyBigUUID().addActionListener(e -> {
            clipboard.setContents(new StringSelection(uidForm.getBigUUID().getText()),null);
        });
        uidForm.getCopySmallUUIDpure().addActionListener(e -> {
            clipboard.setContents(new StringSelection(uidForm.getSmallUUIDpure().getText()),null);
        });
        uidForm.getCopyBigUUIDpure().addActionListener(e -> {
            clipboard.setContents(new StringSelection(uidForm.getBigUUIDpure().getText()),null);
        });
    }

    /**
     * 监听输入框变化，实时修改四个UID文本框内容.
     */
    public static void updateAll(){
        String uid= UUID.randomUUID().toString();
        UIDForm uidForm=UIDForm.getInstance();
        uidForm.getSmallUUID().setText(uid);
        uidForm.getBigUUID().setText(uid.toUpperCase(Locale.ROOT));
        uidForm.getSmallUUIDpure().setText(uid.replace("-",""));
        uidForm.getBigUUIDpure().setText(uid.replace("-","").toUpperCase(Locale.ROOT));
    }
}
