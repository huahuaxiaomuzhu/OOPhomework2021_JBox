package com.huahuaxiaomuzhu.ui.component;

import com.huahuaxiaomuzhu.ui.MainFrame;
import com.huahuaxiaomuzhu.ui.form.func.ClipBoardForm;
import com.huahuaxiaomuzhu.util.ClipBoardListener;

import javax.swing.*;
import java.util.Date;

public class TextClipBoard{
    private JPanel MainPanel;
    private JTextArea ClipText;
    private JButton CopyTextButton;
    private JLabel CreatedTimeLabel;
    private JButton selfDestructButton;

    public JPanel getPanel1() {
        return MainPanel;
    }

    public JTextArea getClipText() {
        return ClipText;
    }

    public JButton getCopyTextButton() {
        return CopyTextButton;
    }

    public JLabel getCreatedTimeLabel() {
        return CreatedTimeLabel;
    }

    public JButton getSelfDestructButton() {
        return selfDestructButton;
    }

    public TextClipBoard(String ClipTextContent) {
        CreatedTimeLabel.setText(new Date().toString());
        ClipText.setText(ClipTextContent);
        CopyTextButton.addActionListener(e -> {
           ClipBoardListener clipBoardListener= ClipBoardListener.getInstance();
            clipBoardListener.setContent(ClipTextContent);
        });
        selfDestructButton.addActionListener(e -> {
            ClipBoardForm.getInstance().getTextPanel().remove(this.MainPanel);
            MainFrame.getInstance().pack();
        });
    }
}
