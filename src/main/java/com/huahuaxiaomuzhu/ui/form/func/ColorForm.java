package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class ColorForm {
    private JPanel ColorPanel;
    private JTextField RText;
    private JTextField GText;
    private JTextField BText;
    private JTextField HEXText;
    private JButton copyRGBButton;
    private JButton copyHEXButton;
    private JSlider RSlider;
    private JSlider GSlider;
    private JSlider BSlider;
    private JLabel RTextSlide;
    private JLabel GTextSlide;
    private JLabel BTextSlide;
    private JButton RGBToHEXButton;
    private JButton HEXToRGBButton;
    private JPanel colorPreviewPanel;

    public JPanel getColorPanel() {
        return ColorPanel;
    }

    public JTextField getRText() {
        return RText;
    }

    public JTextField getGText() {
        return GText;
    }

    public JTextField getBText() {
        return BText;
    }

    public JTextField getHEXText() {
        return HEXText;
    }

    public JButton getCopyRGBButton() {
        return copyRGBButton;
    }

    public JButton getCopyHEXButton() {
        return copyHEXButton;
    }

    public JSlider getRSlider() {
        return RSlider;
    }

    public JSlider getGSlider() {
        return GSlider;
    }

    public JSlider getBSlider() {
        return BSlider;
    }

    public JLabel getRTextSlide() {
        return RTextSlide;
    }

    public JLabel getGTextSlide() {
        return GTextSlide;
    }

    public JLabel getBTextSlide() {
        return BTextSlide;
    }

    public JButton getRGBToHEXButton() {
        return RGBToHEXButton;
    }

    public JButton getHEXToRGBButton() {
        return HEXToRGBButton;
    }

    public JPanel getColorPreviewPanel() {
        return colorPreviewPanel;
    }

    private static ColorForm colorForm;
    private ColorForm(){}
    public static ColorForm getInstance(){
        if (colorForm==null){
            colorForm=new ColorForm();
        }
        return colorForm;
    }
}
