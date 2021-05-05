package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class JsonForm {
    private JTextArea rawText;
    private JTextArea resultText;
    private JPanel JsonPanel;
    private JButton copyButton;
    private JButton clearButton;

    public JPanel getJsonPanel() {
        return JsonPanel;
    }

    public JTextArea getRawText() {
        return rawText;
    }

    public JTextArea getResultText() {
        return resultText;
    }

    public JButton getCopyButton() {
        return copyButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    private static JsonForm jsonForm;
    private JsonForm(){}
    public static JsonForm getInstance(){
        if (jsonForm==null){
            jsonForm=new JsonForm();
        }
        return jsonForm;
    }
}
