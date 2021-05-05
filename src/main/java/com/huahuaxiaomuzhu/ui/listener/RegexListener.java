package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.RegexForm;
import com.huahuaxiaomuzhu.util.RegexUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegexListener {
    public static void addListeners(){
        RegexForm regexForm=RegexForm.getInstance();
        regexForm.getRegexText().getDocument().addDocumentListener(new DocumentListener() {
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
        regexForm.getRawText().getDocument().addDocumentListener(new DocumentListener() {
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
        regexForm.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regexForm.getRegexText().setText("");
                regexForm.getRawText().setText("");
            }
        });
    }
    public static void update(){
        RegexForm regexForm=RegexForm.getInstance();
        regexForm.getResultText().setText(RegexUtil.getRegexResult(regexForm.getRawText().getText(),regexForm.getRegexText().getText()));
    }
}
