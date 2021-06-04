package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.RegexForm;
import com.huahuaxiaomuzhu.util.RegexUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 给生成正则匹配页面组件添加监听器.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class RegexListener {
    /**
     * 添加监听器.
     */
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
    /**
     * 监听输入框变化，实时修改匹配内容.
     */
    public static void update(){
        RegexForm regexForm=RegexForm.getInstance();
        regexForm.getResultText().setText(RegexUtil.getRegexResult(regexForm.getRawText().getText(),regexForm.getRegexText().getText()));
    }
}
