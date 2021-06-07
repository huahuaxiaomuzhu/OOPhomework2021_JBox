import com.huahuaxiaomuzhu.util.Base64Util;
import org.junit.Test;
import static org.junit.Assert.*;
public class Base64Test {
    @Test
    public void test1(){
        assertEquals("我恨基物实验", Base64Util.base64ToNative("5oiR5oGo5Z+654mp5a6e6aqM"));
        assertEquals("5oiR5oGo5Z+654mp5a6e6aqM",Base64Util.nativeToBase64("我恨基物实验"));
        assertEquals("",Base64Util.nativeToBase64(""));
        assertEquals("",Base64Util.base64ToNative(""));
        assertEquals("IA==",Base64Util.nativeToBase64(" "));
    }
}
