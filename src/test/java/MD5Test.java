import com.huahuaxiaomuzhu.util.MD5Util;
import org.junit.Test;
import static org.junit.Assert.*;
public class MD5Test {
    @Test
    public void test1(){
        assertEquals("7215ee9c7d9dc229d2921a40e899ec5f", MD5Util.toMD5(" "));
        assertEquals("02cfc2123d7c9143aace00be390762fb",MD5Util.toMD5("我恨基物实验"));
        assertEquals("2aeaf9297cfb6571be0ddad3c0d5988a3854ed50",MD5Util.toSHA1("我恨基物实验"));
        assertEquals("7c1285402b8243ef7ceea258d42b1e6a3c06ca90a48cdd38f6bcc32b",MD5Util.toSHA224("我恨基物实验"));
        assertEquals("880aedc3e4a8f0209f25acca465999a13db2e5f109643a890cdfbd10d3bcda30",MD5Util.toSHA256("我恨基物实验"));
        assertEquals("cee637eafde233f6b3a680ceb277f8693004144dbeaecbff457c8c397f78f18a300451a9e472a6e69f37246c5ac99790",MD5Util.toSHA384("我恨基物实验"));
        assertEquals("8c4cb90d1d3932cdd7de00dfdf450cd19a6f6b13b86ac3d1a47619506e6efa30d95d4b156a10b244f83f8924096fbadb3f6e00fe3ba79b9b0986fe97cf14247f",MD5Util.toSHA512("我恨基物实验"));
    }
}
