package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.MainFrame;
import com.huahuaxiaomuzhu.ui.form.func.QRForm;
import com.huahuaxiaomuzhu.util.ClipBoardListener;
import com.huahuaxiaomuzhu.util.QRCodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QRCodeListener {
    public static void addListeners(){
        QRForm qrForm=QRForm.getInstance();
        final Image[] image = new Image[1];
        qrForm.getEncodeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                image[0] = QRCodeUtil.Encode(qrForm.getRawText().getText());
                System.out.println(image[0].getGraphics());
                EventQueue.invokeLater(() -> {
                    Icon icon=new ImageIcon(image[0]);
                    qrForm.getPicViewLabel().setIcon(icon);
                    qrForm.getPicViewPanel().repaint();
                    qrForm.getPicViewPanel().setVisible(true);
                    MainFrame.getInstance().pack();
                });
            }
        });
        qrForm.getPasteFromClipBoardButton().addActionListener(e -> {
            ClipBoardListener.getInstance().setContent(image[0]);
        });
    }
}
