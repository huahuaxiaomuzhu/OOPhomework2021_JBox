package com.huahuaxiaomuzhu;

import com.huahuaxiaomuzhu.ui.MainFrame;
import com.huahuaxiaomuzhu.ui.form.MainWindow;
import com.huahuaxiaomuzhu.util.ClipBoardListener;

import javax.swing.*;


public class Application {
    public static MainFrame mainFrame;
    private static MainWindow mainWindow = MainWindow.getInstance();
    public static void main(String[] args){
        mainFrame=MainFrame.getInstance();
        mainFrame.init();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.addListeners();
        mainWindow.init();
        mainFrame.setContentPane(mainWindow.getTabbedPane1());
        mainFrame.setVisible(true);
        ClipBoardListener.getInstance().begin();
    }
}
