package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.HexadecimalConversionForm;
import com.huahuaxiaomuzhu.util.HexUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;

public class HexadecimalConversionListener {
    /**
     * 给进制转换页面的组件添加监听
     */
    public static void addListeners(){
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        //限制输入
        hexadecimalConversionForm.getDecimalText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key="0123456789";
                if(key.indexOf(e.getKeyChar())<0){
                    e.consume();
                }
            }
        });
        hexadecimalConversionForm.getBinaryText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key="01";
                if(key.indexOf(e.getKeyChar())<0){
                    e.consume();
                }
            }
        });
        hexadecimalConversionForm.getOctalText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key="01234567";
                if(key.indexOf(e.getKeyChar())<0){
                    e.consume();
                }
            }
        });
        hexadecimalConversionForm.getHexadecimalText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key="0123456789abcdef";
                if(key.indexOf(e.getKeyChar())<0){
                    e.consume();
                }
            }
        });
        hexadecimalConversionForm.getThirtyBinaryText().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                String key="0123456789abcdefghijklmnopqrstuv";
                if (key.indexOf(e.getKeyChar())<0){
                    e.consume();
                }
            }
        });
        hexadecimalConversionForm.getHexadecimalText().addFocusListener(new FocusListener() {
            HexListener hexListener=new HexListener();
            @Override
            public void focusGained(FocusEvent e) {
                hexadecimalConversionForm.getHexadecimalText().getDocument().addDocumentListener(hexListener);
            }

            @Override
            public void focusLost(FocusEvent e) {
                hexadecimalConversionForm.getHexadecimalText().getDocument().removeDocumentListener(hexListener);
            }
        });
        hexadecimalConversionForm.getDecimalText().addFocusListener(new FocusListener() {
            DecListener decListener=new DecListener();
            @Override
            public void focusGained(FocusEvent e) {
                hexadecimalConversionForm.getDecimalText().getDocument().addDocumentListener(decListener);
            }

            @Override
            public void focusLost(FocusEvent e) {
                hexadecimalConversionForm.getDecimalText().getDocument().removeDocumentListener(decListener);
            }
        });
        hexadecimalConversionForm.getOctalText().addFocusListener(new FocusListener() {
            OctListener octListener=new OctListener();
            @Override
            public void focusGained(FocusEvent e) {
                hexadecimalConversionForm.getOctalText().getDocument().addDocumentListener(octListener);
            }

            @Override
            public void focusLost(FocusEvent e) {
                hexadecimalConversionForm.getOctalText().getDocument().removeDocumentListener(octListener);
            }
        });
        hexadecimalConversionForm.getBinaryText().addFocusListener(new FocusListener() {
            BinListener binListener=new BinListener();
            @Override
            public void focusGained(FocusEvent e) {
                hexadecimalConversionForm.getBinaryText().getDocument().addDocumentListener(binListener);
            }

            @Override
            public void focusLost(FocusEvent e) {
                hexadecimalConversionForm.getBinaryText().getDocument().removeDocumentListener(binListener);
            }
        });
        hexadecimalConversionForm.getThirtyBinaryText().addFocusListener(new FocusListener() {
            ThirtyBinListener thirtyBinListener=new ThirtyBinListener();
            @Override
            public void focusGained(FocusEvent e) {
                hexadecimalConversionForm.getThirtyBinaryText().getDocument().addDocumentListener(thirtyBinListener);
            }
            @Override
            public void focusLost(FocusEvent e) {
                hexadecimalConversionForm.getThirtyBinaryText().getDocument().removeDocumentListener(thirtyBinListener);
            }
        });
        hexadecimalConversionForm.getClearButton().addActionListener(e -> {
            hexadecimalConversionForm.getDecimalText().setText("");
            hexadecimalConversionForm.getHexadecimalText().setText("");
            hexadecimalConversionForm.getOctalText().setText("");
            hexadecimalConversionForm.getBinaryText().setText("");
            hexadecimalConversionForm.getThirtyBinaryText().setText("");
        });
        hexadecimalConversionForm.getCopyDecButton().addActionListener(e -> clipboard.setContents(new StringSelection(hexadecimalConversionForm.getDecimalText().getText()),null));
        hexadecimalConversionForm.getCopyHexButton().addActionListener(e -> clipboard.setContents(new StringSelection(hexadecimalConversionForm.getHexadecimalText().getText()),null));
        hexadecimalConversionForm.getCopyOctButton().addActionListener(e -> clipboard.setContents(new StringSelection(hexadecimalConversionForm.getHexadecimalText().getText()),null));
        hexadecimalConversionForm.getCopyBinButton().addActionListener(e -> clipboard.setContents(new StringSelection(hexadecimalConversionForm.getBinaryText().getText()),null));
        hexadecimalConversionForm.getCopyThirtyBinButton().addActionListener(e -> clipboard.setContents(new StringSelection(hexadecimalConversionForm.getThirtyBinaryText().getText()),null));
    }

    static class DecListener implements DocumentListener{
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        private void updateAll(){
            String[] nums=HexUtil.getGroupByDecimal(hexadecimalConversionForm.getDecimalText().getText());
            hexadecimalConversionForm.getHexadecimalText().setText(nums[1]);
            hexadecimalConversionForm.getOctalText().setText(nums[2]);
            hexadecimalConversionForm.getBinaryText().setText(nums[3]);
            hexadecimalConversionForm.getThirtyBinaryText().setText(nums[4]);
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateAll();
        }
    }
    static class HexListener implements DocumentListener{
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        private void updateAll(){
            String[] nums=HexUtil.getGroupByHex(hexadecimalConversionForm.getHexadecimalText().getText());
            hexadecimalConversionForm.getDecimalText().setText(nums[0]);
            hexadecimalConversionForm.getOctalText().setText(nums[2]);
            hexadecimalConversionForm.getBinaryText().setText(nums[3]);
            hexadecimalConversionForm.getThirtyBinaryText().setText(nums[4]);
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateAll();
        }
    }
    static class OctListener implements DocumentListener{
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        private void updateAll(){
            String[] nums=HexUtil.getGroupByOct(hexadecimalConversionForm.getOctalText().getText());
            hexadecimalConversionForm.getDecimalText().setText(nums[0]);
            hexadecimalConversionForm.getHexadecimalText().setText(nums[1]);
            hexadecimalConversionForm.getBinaryText().setText(nums[3]);
            hexadecimalConversionForm.getThirtyBinaryText().setText(nums[4]);
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateAll();
        }
    }
    static class BinListener implements DocumentListener{
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        private void updateAll(){
            String[] nums=HexUtil.getGroupByBin(hexadecimalConversionForm.getBinaryText().getText());
            hexadecimalConversionForm.getDecimalText().setText(nums[0]);
            hexadecimalConversionForm.getOctalText().setText(nums[2]);
            hexadecimalConversionForm.getHexadecimalText().setText(nums[1]);
            hexadecimalConversionForm.getThirtyBinaryText().setText(nums[4]);
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateAll();
        }
    }
    static class ThirtyBinListener implements DocumentListener{
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        private void updateAll(){
            String[] nums=HexUtil.getGroupBy32(hexadecimalConversionForm.getThirtyBinaryText().getText());
            hexadecimalConversionForm.getDecimalText().setText(nums[0]);
            hexadecimalConversionForm.getHexadecimalText().setText(nums[1]);
            hexadecimalConversionForm.getOctalText().setText(nums[2]);
            hexadecimalConversionForm.getBinaryText().setText(nums[3]);
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateAll();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateAll();
        }
    }
}