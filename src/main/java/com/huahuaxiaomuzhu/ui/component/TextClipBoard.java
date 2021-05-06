package com.huahuaxiaomuzhu.ui.component;

import com.huahuaxiaomuzhu.util.ClipBoardListener;

import javax.swing.*;
import java.util.Date;

public class TextClipBoard{
    private JPanel MainPanel;
    private JTextArea ClipText;
    private JButton CopyTextButton;
    private JLabel CreatedTimeLabel;

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

    public TextClipBoard(String ClipTextContent) {
        CreatedTimeLabel.setText(new Date().toString());
        ClipText.setText(ClipTextContent);
        CopyTextButton.addActionListener(e -> {
           ClipBoardListener clipBoardListener= ClipBoardListener.getInstance();
            clipBoardListener.setContent(ClipTextContent);
        });
    }
}
