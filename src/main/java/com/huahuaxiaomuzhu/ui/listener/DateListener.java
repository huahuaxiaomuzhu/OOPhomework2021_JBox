package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.DateFormatForm;
import com.huahuaxiaomuzhu.util.DateUtil;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * 给日期页面组件添加监听器.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class DateListener {
    /**
     * 添加监听器.
     */
    public static void addListeners(){
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        DateFormatForm dateFormatForm=DateFormatForm.getInstance();
        dateFormatForm.getGetCurrentTimeButton().addActionListener(e -> {
            dateFormatForm.getCurrentDateTimeLabel().setText(DateUtil.getCurrentDateTime());
            dateFormatForm.getCurrentTimeStampLabel().setText(DateUtil.getCurrentTimeStamp());
        });
        dateFormatForm.getDateTimeToTimeStampButton().addActionListener(e -> dateFormatForm.getTimeStampText().setText(DateUtil.dateTimeToTimeStamp(dateFormatForm.getDateTimeText().getText())));
        dateFormatForm.getTimeStampToDateTimeButton().addActionListener(e -> dateFormatForm.getDateTimeText().setText(DateUtil.timeStampToDateTime(dateFormatForm.getTimeStampText().getText())));
        dateFormatForm.getCopyCurrentDateTimeButton().addActionListener(e -> {
            clipboard.setContents(new StringSelection(dateFormatForm.getCurrentDateTimeLabel().getText()),null);
        });
        dateFormatForm.getCopyCurrentTimeStamp().addActionListener(e -> {
            clipboard.setContents(new StringSelection(dateFormatForm.getCurrentTimeStampLabel().getText()),null);
        });
        dateFormatForm.getCopyDateTimeButton().addActionListener(e -> {
            clipboard.setContents(new StringSelection(dateFormatForm.getDateTimeText().getText()),null);
        });
        dateFormatForm.getCopyTimeStampButton().addActionListener(e -> {
            clipboard.setContents(new StringSelection(dateFormatForm.getTimeStampText().getText()),null);
        });
    }
}
