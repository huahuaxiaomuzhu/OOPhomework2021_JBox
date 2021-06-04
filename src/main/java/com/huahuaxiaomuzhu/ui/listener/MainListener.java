package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.MainWindow;
import com.huahuaxiaomuzhu.ui.form.func.DateFormatForm;
import com.huahuaxiaomuzhu.ui.form.func.HexadecimalConversionForm;
import com.huahuaxiaomuzhu.ui.form.func.MD5Form;
import com.huahuaxiaomuzhu.ui.form.func.UIDForm;
import com.huahuaxiaomuzhu.util.DateUtil;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * 给整个程序添加监听器.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class MainListener {
    /**
     * 添加监听器.
     */
    public static void addListener(){
        MainWindow mainWindow=MainWindow.getInstance();
        MD5Form md5Form=MD5Form.getInstance();
        UIDForm uidForm=UIDForm.getInstance();
        DateFormatForm dateFormatForm=DateFormatForm.getInstance();
        HexadecimalConversionForm hexadecimalConversionForm=HexadecimalConversionForm.getInstance();
        mainWindow.getTabbedPane1().addChangeListener(e -> {
           int id= mainWindow.getTabbedPane1().getSelectedIndex();

           if (id==2){
               uidForm.getUIDPanel().requestFocus();
           }
        });
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventPostProcessor(e -> {
            //mac:1-shift,2-control,4-command   数字1：49，数字2，50，数字3，51，数字4，52，数字5，53，空格32
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            if (e.getModifiers() == 4 && e.getKeyCode() == 49&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {
                clipboard.setContents(new StringSelection(md5Form.getMD5TextArea().getText()), null);
            }
            if (e.getModifiers() == 4 && e.getKeyCode() == 50&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {
                clipboard.setContents(new StringSelection(md5Form.getSHA1TextArea().getText()), null);
            }
            if (e.getModifiers() == 4 && e.getKeyCode() == 51&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {
                clipboard.setContents(new StringSelection(md5Form.getSHA224TextArea().getText()), null);
            }
            if (e.getModifiers() == 4 && e.getKeyCode() == 52&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {
                clipboard.setContents(new StringSelection(md5Form.getSHA256TextArea().getText()), null);
            }
            if (e.getModifiers() == 4 && e.getKeyCode() == 53&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {
                clipboard.setContents(new StringSelection(md5Form.getSHA384TextArea().getText()), null);
            }
            if (e.getModifiers() == 4 && e.getKeyCode() == 54&&mainWindow.getTabbedPane1().getSelectedIndex()==1) {

                clipboard.setContents(new StringSelection(md5Form.getSHA512TextArea().getText()), null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==49&&mainWindow.getTabbedPane1().getSelectedIndex()==2){
                clipboard.setContents(new StringSelection((uidForm.getSmallUUID().getText())),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==50&&mainWindow.getTabbedPane1().getSelectedIndex()==2){
                clipboard.setContents(new StringSelection(uidForm.getBigUUID().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==51&&mainWindow.getTabbedPane1().getSelectedIndex()==2){
                clipboard.setContents(new StringSelection(uidForm.getSmallUUIDpure().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==52&&mainWindow.getTabbedPane1().getSelectedIndex()==2){
                clipboard.setContents(new StringSelection(uidForm.getBigUUIDpure().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==82&&mainWindow.getTabbedPane1().getSelectedIndex()==2){
                uidForm.getRandomButton().doClick(1);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==49&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                clipboard.setContents(new StringSelection(hexadecimalConversionForm.getDecimalText().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==50&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                clipboard.setContents(new StringSelection(hexadecimalConversionForm.getHexadecimalText().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==51&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                clipboard.setContents(new StringSelection(hexadecimalConversionForm.getOctalText().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==52&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                clipboard.setContents(new StringSelection(hexadecimalConversionForm.getBinaryText().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==53&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                clipboard.setContents(new StringSelection(hexadecimalConversionForm.getThirtyBinaryText().getText()),null);
            }
            if (e.getModifiers()==4&&e.getKeyCode()==82&&mainWindow.getTabbedPane1().getSelectedIndex()==3){
                hexadecimalConversionForm.getClearButton().doClick(1);
            }
            return true;
        });
        mainWindow.getTabbedPane1().addChangeListener(e -> {
            dateFormatForm.getCurrentTimeStampLabel().setText(DateUtil.getCurrentTimeStamp());
            dateFormatForm.getCurrentDateTimeLabel().setText(DateUtil.getCurrentDateTime());
        });
    }
}
