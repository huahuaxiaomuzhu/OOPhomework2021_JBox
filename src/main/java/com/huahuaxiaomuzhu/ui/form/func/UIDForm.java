package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class UIDForm {
    private JPanel UIDPanel;
    private JTextArea smallUUID;
    private JTextArea bigUUID;
    private JTextArea smallUUIDpure;
    private JTextArea bigUUIDpure;
    private JButton RandomButton;
    private JButton copySmallUUID;
    private JButton copyBigUUID;
    private JButton copySmallUUIDpure;
    private JButton copyBigUUIDpure;

    public JPanel getUIDPanel() {
        return UIDPanel;
    }

    public JTextArea getSmallUUID() {
        return smallUUID;
    }

    public JTextArea getBigUUID() {
        return bigUUID;
    }

    public JTextArea getSmallUUIDpure() {
        return smallUUIDpure;
    }

    public JTextArea getBigUUIDpure() {
        return bigUUIDpure;
    }

    public JButton getRandomButton() {
        return RandomButton;
    }

    public JButton getCopySmallUUID() {
        return copySmallUUID;
    }

    public JButton getCopyBigUUID() {
        return copyBigUUID;
    }

    public JButton getCopySmallUUIDpure() {
        return copySmallUUIDpure;
    }

    public JButton getCopyBigUUIDpure() {
        return copyBigUUIDpure;
    }
    private static UIDForm uidForm;
    private UIDForm(){}
    public static UIDForm getInstance(){
        if (uidForm==null){
            uidForm=new UIDForm();
        }
        return uidForm;
    }
}
