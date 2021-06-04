package com.huahuaxiaomuzhu.util;

import com.huahuaxiaomuzhu.Application;

import javax.swing.*;
import java.awt.*;

/**
 * 定位布局.
 * @see com.huahuaxiaomuzhu.ui.MainFrame
 */
public class LocateUtil {
    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private static Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(Application.mainFrame.getGraphicsConfiguration());

    private static int screenWidth = screenSize.width - screenInsets.left - screenInsets.right;

    private static int screenHeight = screenSize.height - screenInsets.top - screenInsets.bottom;
    /**
     * 固定于屏幕中央显示.
     * @param preferWidth 窗口宽度.
     * @param preferHeight 窗口高度.
     */
    public static void locateToCenter(Component component,double preferWidth,double preferHeight){
        component.setBounds((screenWidth - (int)(preferWidth*screenWidth)) / 2, (screenHeight - (int)(preferHeight*screenHeight)) / 2,
                (int) (preferWidth*screenWidth), (int)( preferHeight*screenHeight));
        Dimension preferSize = new Dimension((int)(preferWidth*screenWidth), (int)(preferHeight*screenHeight));
        component.setPreferredSize(preferSize);

    }
}
