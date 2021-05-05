package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class RegexForm {
    private JPanel RegexPanel;
    private JTextField regexText;
    private JTextArea rawText;
    private JTextArea resultText;
    private JButton clearButton;

    public JPanel getRegexPanel() {
        return RegexPanel;
    }

    public JTextField getRegexText() {
        return regexText;
    }

    public JTextArea getRawText() {
        return rawText;
    }

    public JTextArea getResultText() {
        return resultText;
    }

    public JButton getClearButton() {
        return clearButton;
    }
    private static RegexForm regexForm;
    private RegexForm(){}
    public static RegexForm getInstance(){
        if (regexForm==null){
            regexForm=new RegexForm();
        }
        return regexForm;
    }
}
