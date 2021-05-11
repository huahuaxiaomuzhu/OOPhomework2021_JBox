package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class QRForm {
    private JPanel QRPanel;
    private JButton encodeButton;
    private JButton pasteFromClipBoardButton;
    private JTextArea rawText;
    private JPanel picViewPanel;
    private JLabel picViewLabel;

    public JPanel getQRPanel() {
        return QRPanel;
    }

    public JButton getEncodeButton() {
        return encodeButton;
    }

    public JButton getPasteFromClipBoardButton() {
        return pasteFromClipBoardButton;
    }

    public JTextArea getRawText() {
        return rawText;
    }

    public JPanel getPicViewPanel() {
        return picViewPanel;
    }

    public JLabel getPicViewLabel() {
        return picViewLabel;
    }

    private static QRForm qrForm;
    private QRForm(){}
    public static QRForm getInstance(){
        if (qrForm==null){
            qrForm=new QRForm();
        }
        return qrForm;
    }
}
