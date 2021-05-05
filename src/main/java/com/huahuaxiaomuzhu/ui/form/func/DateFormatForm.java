package com.huahuaxiaomuzhu.ui.form.func;

import javax.swing.*;

public class DateFormatForm {
    private JPanel DatePanel;
    private JButton DateTimeToTimeStampButton;
    private JButton TimeStampToDateTimeButton;
    private JButton copyTimeStampButton;
    private JTextField timeStampText;
    private JButton copyDateTimeButton;
    private JTextField dateTimeText;
    private JButton copyCurrentDateTimeButton;
    private JButton copyCurrentTimeStamp;
    private JLabel currentDateTimeLabel;
    private JLabel currentTimeStampLabel;
    private JButton getCurrentTimeButton;

    public JPanel getDatePanel() {
        return DatePanel;
    }

    public JButton getDateTimeToTimeStampButton() {
        return DateTimeToTimeStampButton;
    }

    public JButton getTimeStampToDateTimeButton() {
        return TimeStampToDateTimeButton;
    }

    public JButton getCopyTimeStampButton() {
        return copyTimeStampButton;
    }

    public JTextField getTimeStampText() {
        return timeStampText;
    }

    public JButton getCopyDateTimeButton() {
        return copyDateTimeButton;
    }

    public JTextField getDateTimeText() {
        return dateTimeText;
    }

    public JButton getCopyCurrentDateTimeButton() {
        return copyCurrentDateTimeButton;
    }

    public JButton getCopyCurrentTimeStamp() {
        return copyCurrentTimeStamp;
    }

    public JLabel getCurrentDateTimeLabel() {
        return currentDateTimeLabel;
    }

    public JLabel getCurrentTimeStampLabel() {
        return currentTimeStampLabel;
    }

    public JButton getGetCurrentTimeButton() {
        return getCurrentTimeButton;
    }
    private static DateFormatForm dateFormatForm;
    private DateFormatForm(){}
    public static DateFormatForm getInstance(){
        if (dateFormatForm==null){
            dateFormatForm=new DateFormatForm();
        }
        return dateFormatForm;
    }
}
