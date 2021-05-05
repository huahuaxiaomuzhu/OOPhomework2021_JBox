package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.ColorForm;
import com.huahuaxiaomuzhu.util.ColorUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class ColorListener {
    public static void addListeners(){
        ColorForm colorForm=ColorForm.getInstance();
        colorForm.getRSlider().addChangeListener(e -> {
           colorForm.getRTextSlide().setText(String.valueOf(colorForm.getRSlider().getValue()));
           colorForm.getRText().setText(String.valueOf(colorForm.getRSlider().getValue()));
           colorForm.getColorPreviewPanel().setBackground(new Color(colorForm.getRSlider().getValue(),colorForm.getGSlider().getValue(),colorForm.getBSlider().getValue()));
           updateHEXText();
        });
        colorForm.getGSlider().addChangeListener(e -> {
            colorForm.getGTextSlide().setText(String.valueOf(colorForm.getGSlider().getValue()));
            colorForm.getGText().setText(String.valueOf(colorForm.getGSlider().getValue()));
            colorForm.getColorPreviewPanel().setBackground(new Color(colorForm.getRSlider().getValue(),colorForm.getGSlider().getValue(),colorForm.getBSlider().getValue()));
            updateHEXText();
        });
        colorForm.getBSlider().addChangeListener(e -> {
            colorForm.getBTextSlide().setText(String.valueOf(colorForm.getBSlider().getValue()));
            colorForm.getBText().setText(String.valueOf(colorForm.getBSlider().getValue()));
            colorForm.getColorPreviewPanel().setBackground(new Color(colorForm.getRSlider().getValue(),colorForm.getGSlider().getValue(),colorForm.getBSlider().getValue()));
            updateHEXText();
        });
        colorForm.getHEXToRGBButton().addActionListener(e -> {
            int[] result=ColorUtil.HEXToRGB(colorForm.getHEXText().getText());
            colorForm.getRText().setText(String.valueOf(result[0]));
            colorForm.getGText().setText(String.valueOf(result[1]));
            colorForm.getBText().setText(String.valueOf(result[2]));
            colorForm.getRTextSlide().setText(String.valueOf(result[0]));
            colorForm.getGTextSlide().setText(String.valueOf(result[1]));
            colorForm.getBTextSlide().setText(String.valueOf(result[2]));
            colorForm.getRSlider().setValue(result[0]);
            colorForm.getGSlider().setValue(result[1]);
            colorForm.getBSlider().setValue(result[2]);
            updateAll();
        });
        colorForm.getRGBToHEXButton().addActionListener(e -> {
            colorForm.getHEXText().setText(ColorUtil.RGBToHex(Integer.parseInt(colorForm.getRText().getText()),Integer.parseInt(colorForm.getGText().getText()),Integer.parseInt(colorForm.getBText().getText())));
        });
        colorForm.getRText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key = "0123456789";
                if (key.indexOf(e.getKeyChar()) < 0) {
                    e.consume();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                if (colorForm.getRText().getText().equals("")){
                    colorForm.getRText().setText("0");
                }
                if (Integer.parseInt(colorForm.getRText().getText())>255){
                    colorForm.getRText().setText("255");
                }
                if (Integer.parseInt(colorForm.getRText().getText())<0){
                    colorForm.getRText().setText("0");
                }
                updateAll();
                updateHEXText();
            }
        });
        colorForm.getGText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key = "0123456789";
                if (key.indexOf(e.getKeyChar()) < 0) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (colorForm.getGText().getText().equals("")){
                    colorForm.getGText().setText("0");
                }
                if (Integer.parseInt(colorForm.getGText().getText())>255){
                    colorForm.getGText().setText("255");
                }
                if (Integer.parseInt(colorForm.getGText().getText())<0){
                    colorForm.getGText().setText("0");
                }
                updateAll();
                updateHEXText();
            }
        });
        colorForm.getBText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key = "0123456789";
                if (key.indexOf(e.getKeyChar()) < 0) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (colorForm.getBText().getText().equals("")){
                    colorForm.getBText().setText("0");
                }
                if (Integer.parseInt(colorForm.getBText().getText())>255){
                    colorForm.getBText().setText("255");
                }
                if (Integer.parseInt(colorForm.getBText().getText())<0){
                    colorForm.getBText().setText("0");
                }
                updateAll();
                updateHEXText();
            }
        });
    }
    public static void updateHEXText(){
        ColorForm colorForm=ColorForm.getInstance();
        colorForm.getHEXText().setText(ColorUtil.RGBToHex(Integer.parseInt(colorForm.getRText().getText()),Integer.parseInt(colorForm.getGText().getText()),Integer.parseInt(colorForm.getBText().getText())));
    }
    public static void updateAll(){
        ColorForm colorForm=ColorForm.getInstance();
        colorForm.getRSlider().setValue(Integer.parseInt(colorForm.getRText().getText()));
        colorForm.getGSlider().setValue(Integer.parseInt(colorForm.getGText().getText()));
        colorForm.getBSlider().setValue(Integer.parseInt(colorForm.getBText().getText()));
        colorForm.getRTextSlide().setText(colorForm.getRText().getText());
        colorForm.getGTextSlide().setText(colorForm.getGText().getText());
        colorForm.getBTextSlide().setText(colorForm.getBText().getText());
        colorForm.getColorPreviewPanel().setBackground(new Color(colorForm.getRSlider().getValue(),colorForm.getGSlider().getValue(),colorForm.getBSlider().getValue()));
    }
}
