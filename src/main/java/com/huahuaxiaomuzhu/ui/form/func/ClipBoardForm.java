package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;
import java.awt.*;

public class ClipBoardForm{
    private JPanel panel1;
    private JPanel TextPanel;
    private JTabbedPane ClipBoardPanel;
    private JPanel PicPanel;
    private JList list1;
    private GridBagConstraints gridBagConstraints;
    public JTabbedPane getClipBoardPanel() {
        return ClipBoardPanel;
    }

    public JList getList1() {
        return list1;
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
