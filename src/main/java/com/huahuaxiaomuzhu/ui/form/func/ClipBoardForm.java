package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class ClipBoardForm extends JFrame{
    private JPanel panel1;
    private JPanel TextPanel;
    private JTabbedPane ClipBoardPanel;
    private JPanel PicPanel;

    public JTabbedPane getClipBoardPanel() {
        return ClipBoardPanel;
    }

    public JPanel getPicPanel() {
        return PicPanel;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JPanel getTextPanel() {
        return TextPanel;
    }
    private static ClipBoardForm clipBoardForm;
    private ClipBoardForm(){

    }
    public static ClipBoardForm getInstance(){
        if (clipBoardForm==null){
            clipBoardForm=new ClipBoardForm();
        }
       return clipBoardForm;
    }
}
