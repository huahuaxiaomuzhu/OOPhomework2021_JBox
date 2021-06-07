package com.huahuaxiaomuzhu.ui.component;

import com.huahuaxiaomuzhu.ui.MainFrame;
import com.huahuaxiaomuzhu.ui.form.func.ClipBoardForm;
import com.huahuaxiaomuzhu.util.ClipBoardListener;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ImgClipBoard {
    private JPanel imgPanel;
    private JButton copyButton;
    private JLabel ImgLabel;
    private JLabel createdTimeLabel;
    private JPanel MainPanel;
    private JButton DeleteButton;

    public JPanel getMainPanel() {
        return MainPanel;
    }
    public ImgClipBoard(Image image) {
        int width=image.getWidth(null);
        int height=image.getHeight(null);
        double percent=1;
        if (width>100||height>80){
        percent=200.0/width<200.0/height?200.0/width:200.0/height;}
        Icon icon=new ImageIcon(image.getScaledInstance((int)(width*percent),(int)(height*percent),Image.SCALE_DEFAULT));
        ImgLabel.setIcon(icon);
        createdTimeLabel.setText(new Date().toString());
        copyButton.addActionListener(e -> ClipBoardListener.getInstance().setContent(image));
        DeleteButton.addActionListener(e -> {
            ClipBoardForm.getInstance().getPicPanel().remove(this.MainPanel);
            MainFrame.getInstance().pack();
        });
    }
}
