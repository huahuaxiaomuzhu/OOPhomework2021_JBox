package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.JsonForm;
import com.huahuaxiaomuzhu.util.JsonUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * 给格式化json页面组件添加监听器.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class JsonListener {
    /**
     * 添加监听器.
     */
    public static void addListeners(){
        JsonForm jsonForm=JsonForm.getInstance();
        jsonForm.getRawText().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
            }
        });
        jsonForm.getClearButton().addActionListener(e -> jsonForm.getRawText().setText(""));
        jsonForm.getCopyButton().addActionListener(e -> {
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(jsonForm.getResultText().getText()),null);
        });
    }

    /**
     * 监听输入框变化，实时修改格式化内容.
     */
    public static void update(){
        JsonForm jsonForm=JsonForm.getInstance();
        jsonForm.getResultText().setText(JsonUtil.handleJson(jsonForm.getRawText().getText()));
    }
}
