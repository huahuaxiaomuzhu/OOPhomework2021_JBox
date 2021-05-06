package com.huahuaxiaomuzhu.util;

import com.huahuaxiaomuzhu.ui.component.ImgClipBoard;
import com.huahuaxiaomuzhu.ui.component.TextClipBoard;
import com.huahuaxiaomuzhu.ui.form.func.ClipBoardForm;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class ClipBoardListener implements ClipboardOwner {
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    private boolean going; //控制开关

    /*****************
     * 开始监视剪贴板 *
     * ***************/
    public void begin(){
        going = true;
        //将剪贴板中内容的ClipboardOwner设置为自己
        //这样当其中内容变化时，就会触发lostOwnership事件
        clipboard.setContents(clipboard.getContents(null), this);
    }
    /*****************
     * 停止监视剪贴板 *
     * ***************/

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        if (going){ //如果是进行中状态，则操作
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 取出文本并进行一次文本处理
            // 如果剪贴板中有文本:
            if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)){
                try {
                    String text = (String)clipboard.getData(DataFlavor.stringFlavor);
                    TextClipBoard clipBoard=new TextClipBoard(text);
                    System.out.println(text);
                    ClipBoardForm.getInstance().getTextPanel().add(clipBoard.getPanel1());
                    // 存入剪贴板，并注册自己为所有者
                    // 这样下次剪贴板内容改变时，仍然可以触发此事件
                    StringSelection tmp = new StringSelection(text);
                    clipboard.setContents(tmp, this);
                    begin();
                } catch (UnsupportedFlavorException e) {
                    clipboard.setContents(null, this);
                    e.printStackTrace();
                } catch (IOException e) {
                    clipboard.setContents(null, this);
                    e.printStackTrace();
                }
                return;
            }
            if (clipboard.isDataFlavorAvailable(DataFlavor.imageFlavor)){
                try {
                    Image image= (Image) clipboard.getContents(null).getTransferData(DataFlavor.imageFlavor);
                    image.getScaledInstance(image.getWidth(null)/2,image.getHeight(null)/2,Image.SCALE_SMOOTH);
                    ImgClipBoard imgClipBoard=new ImgClipBoard(image);
                    ClipBoardForm.getInstance().getPicPanel().add(imgClipBoard.getMainPanel());
                    clipboard.setContents(clipboard.getContents(null),this);
                    begin();
                } catch (UnsupportedFlavorException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }

            clipboard.setContents(clipboard.getContents(null),this);
        }
    }
    public void setContent(String content){
        clipboard.setContents(new StringSelection(content),this);
    }
    public void setContent(Image image){
        ImageTransferable transferable = new ImageTransferable( image );
        clipboard.setContents(transferable,this);
    }
    private static ClipBoardListener clipBoardListener;
    private ClipBoardListener(){ }
    public static ClipBoardListener getInstance(){
        if (clipBoardListener==null){
            clipBoardListener=new ClipBoardListener();

        }
        return clipBoardListener;
    }
    static class ImageTransferable implements Transferable {
        private Image image;

        @Override
        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[]{DataFlavor.imageFlavor};
        }

        public ImageTransferable(Image image) {
            this.image = image;
        }

        @Override
        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return flavor == DataFlavor.imageFlavor;
        }

        @Override
        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
            {
                if (isDataFlavorSupported(flavor)) {
                    return image;
                } else {
                    throw new UnsupportedFlavorException(flavor);
                }
            }
        }
    }

    public static void main(String[] args) {
        ClipBoardListener.getInstance().begin();
        new JFrame().setVisible(true);
    }
}

