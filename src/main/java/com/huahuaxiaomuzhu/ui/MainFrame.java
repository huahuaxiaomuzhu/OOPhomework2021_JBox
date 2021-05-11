package com.huahuaxiaomuzhu.ui;

import com.huahuaxiaomuzhu.ui.listener.*;
import com.huahuaxiaomuzhu.util.LocateUtil;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    /**
     * 窗口初始化
     */
    public void init(){
        this.setName("测试！");
        this.setTitle("测试！");
        LocateUtil.locateToCenter(this,0.8,0.8);
        this.setLayout(new FlowLayout());
        this.setResizable(true);
    }
    public void addListeners(){
        Base64Listener.addListeners();
        MD5Listener.addListeners();
        UIDListener.addListeners();
        MainListener.addListener();
        HexadecimalConversionListener.addListeners();
        RegexListener.addListeners();
        JsonListener.addListeners();
        DateListener.addListeners();
        ColorListener.addListeners();
        QRCodeListener.addListeners();
    }
    private static MainFrame mainFrame;
    private MainFrame(){}
    public static MainFrame getInstance(){
        if (mainFrame==null){
            mainFrame=new MainFrame();
        }
        return mainFrame;
    }
}
