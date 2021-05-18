package com.huahuaxiaomuzhu.ui.form;

import com.huahuaxiaomuzhu.ui.form.func.*;
import com.intellij.uiDesigner.core.GridConstraints;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JTabbedPane tabbedPane1;
    private JPanel base64Panel;
    private JPanel md5Panel;
    private JPanel UUIDPanel;
    private JPanel hexadecimalConversionPanel;
    private JPanel RegexPanel;
    private JPanel JsonPanel;
    private JPanel TimePanel;
    private JPanel ColorPanel;
    private JPanel ClipBoardPanel;
    private JPanel QRCodePanel;
    private JPanel encodePanel;

    public JPanel getMd5Panel() {
        return md5Panel;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public JPanel getBase64Panel() {
        return base64Panel;
    }

    public JPanel getUUIDPanel() {
        return UUIDPanel;
    }

    public JPanel getHexadecimalConversionPanel() {
        return hexadecimalConversionPanel;
    }

    public JPanel getRegexPanel() {
        return RegexPanel;
    }

    public JPanel getJsonPanel() {
        return JsonPanel;
    }

    public JPanel getTimePanel() {
        return TimePanel;
    }

    public JPanel getColorPanel() {
        return ColorPanel;
    }

    public JPanel getClipBoardPanel() {
        return ClipBoardPanel;
    }

    public JPanel getQRCodePanel() {
        return QRCodePanel;
    }

    public JPanel getEncodePanel() {
        return encodePanel;
    }

    private static MainWindow mainWindow;
    private MainWindow(){
    }
    public static MainWindow getInstance(){
        if (mainWindow==null){
            mainWindow=new MainWindow();
        }
        return mainWindow;
    }
    public void init(){
        mainWindow=getInstance();
        mainWindow.getBase64Panel().add(Base64Form.getInstance().getBase64Panel());
        mainWindow.getMd5Panel().add(MD5Form.getInstance().getMD5Panel());
        mainWindow.getUUIDPanel().add(UIDForm.getInstance().getUIDPanel());
        mainWindow.getHexadecimalConversionPanel().add(HexadecimalConversionForm.getInstance().getHexPanel());
        mainWindow.getRegexPanel().add(RegexForm.getInstance().getRegexPanel());
        mainWindow.getJsonPanel().add(JsonForm.getInstance().getJsonPanel());
        mainWindow.getTimePanel().add(DateFormatForm.getInstance().getDatePanel());
        mainWindow.getColorPanel().add(ColorForm.getInstance().getColorPanel());
        mainWindow.getClipBoardPanel().add(ClipBoardForm.getInstance().getClipBoardPanel());
        mainWindow.getQRCodePanel().add(QRForm.getInstance().getQRPanel());
        mainWindow.getEncodePanel().add(EncodeForm.getInstance().getEncodePanel());
    }

}
