package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class HexadecimalConversionForm {
    private JPanel HexPanel;
    private JTextArea decimalText;
    private JTextArea hexadecimalText;
    private JTextArea octalText;
    private JTextArea binaryText;
    private JTextArea thirtyBinaryText;
    private JButton copyDecButton;
    private JButton copyHexButton;
    private JButton copyOctButton;
    private JButton copyBinButton;
    private JButton copyThirtyBinButton;
    private JButton clearButton;

    public JPanel getHexPanel() {
        return HexPanel;
    }

    public JTextArea getDecimalText() {
        return decimalText;
    }

    public JTextArea getHexadecimalText() {
        return hexadecimalText;
    }

    public JTextArea getOctalText() {
        return octalText;
    }

    public JTextArea getBinaryText() {
        return binaryText;
    }

    public JButton getCopyDecButton() {
        return copyDecButton;
    }

    public JButton getCopyHexButton() {
        return copyHexButton;
    }

    public JButton getCopyOctButton() {
        return copyOctButton;
    }

    public JButton getCopyBinButton() {
        return copyBinButton;
    }

    public JButton getCopyThirtyBinButton() {
        return copyThirtyBinButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JTextArea getThirtyBinaryText() {
        return thirtyBinaryText;
    }
    private static HexadecimalConversionForm hexadecimalConversionForm;
    private HexadecimalConversionForm() {}
    public static HexadecimalConversionForm getInstance(){
        if (hexadecimalConversionForm==null){
            hexadecimalConversionForm=new HexadecimalConversionForm();
        }
        return hexadecimalConversionForm;
    }
}
