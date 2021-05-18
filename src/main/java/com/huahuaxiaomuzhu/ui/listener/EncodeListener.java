package com.huahuaxiaomuzhu.ui.listener;

import com.huahuaxiaomuzhu.ui.form.func.EncodeForm;
import com.huahuaxiaomuzhu.util.EncodeUtil;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EncodeListener {
    public static void addListeners(){
        EncodeForm encodeForm=EncodeForm.getInstance();
        encodeForm.getRawText().getDocument().addDocumentListener(new DocumentListener() {
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
        });
    }
    public static void updateAll(){
        EncodeForm encodeForm=EncodeForm.getInstance();
        String rawText=encodeForm.getRawText().getText();

        encodeForm.getGBK2UTF8Text().setText(EncodeUtil.GBK2UTF8(rawText));
        encodeForm.getGBK2Windows1252Text().setText(EncodeUtil.GBK2Windows1252(rawText));
        encodeForm.getGBK2Big5Text().setText(EncodeUtil.GBK2Big5(rawText));
        encodeForm.getGBK2ISO8859Text().setText(EncodeUtil.GBK2ISO8859(rawText));

        encodeForm.getUTF8ToGBKText().setText(EncodeUtil.UTF8ToGBK(rawText));
        encodeForm.getUTF8ToWindows1252Text().setText(EncodeUtil.UTF8ToWindows1252(rawText));
        encodeForm.getUTF8ToBig5Text().setText(EncodeUtil.UTF8ToBig5(rawText));
        encodeForm.getUTF8ToISO8859Text().setText(EncodeUtil.UTF8ToISO8859(rawText));

        encodeForm.getISO8859ToUTF8Text().setText(EncodeUtil.ISO8859ToUTF8(rawText));
        encodeForm.getISO8859ToGBKText().setText(EncodeUtil.ISO8859ToGBK(rawText));
        encodeForm.getISO8859ToBig5Text().setText(EncodeUtil.ISO8859ToBig5(rawText));
        encodeForm.getISO8859ToWindows1252Text().setText(EncodeUtil.ISO8859ToWindows1252(rawText));

        encodeForm.getBig5ToGBKText().setText(EncodeUtil.Big5ToGBK(rawText));
        encodeForm.getBig5ToUTF8Text().setText(EncodeUtil.Big5ToUTF8(rawText));
        encodeForm.getBig5ToWindows1252Text().setText(EncodeUtil.Big5ToWindows1252(rawText));
        encodeForm.getBig5ToISO8859Text().setText(EncodeUtil.Big5ToISO8859(rawText));

        encodeForm.getWindows1252ToGBKText().setText(EncodeUtil.Windows1252ToGBK(rawText));
        encodeForm.getWindows1252ToUTF8().setText(EncodeUtil.Windows1252ToUTF8(rawText));
        encodeForm.getWindows1252ToBig5Text().setText(EncodeUtil.Windows1252ToBig5(rawText));
        encodeForm.getWindows1252ToISO8859Text().setText(EncodeUtil.Windows1252ToISO8859(rawText));
    }
}
