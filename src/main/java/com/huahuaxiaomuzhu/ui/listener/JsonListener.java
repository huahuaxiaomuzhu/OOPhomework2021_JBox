package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.JsonForm;
import com.huahuaxiaomuzhu.util.JsonUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class JsonListener {
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
    public static void update(){
        JsonForm jsonForm=JsonForm.getInstance();
        jsonForm.getResultText().setText(JsonUtil.handleJson(jsonForm.getRawText().getText()));
    }
}
