import java.io.UnsupportedEncodingException;

public class EncodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1="锘挎槬鐪犱笉瑙夋檽锛屽\uE629澶勯椈鍟奸笩";
        byte[] bytes=str1.getBytes("GBK");
        String str2=new String(bytes,"UTF-8");
        System.out.println(str2);
    }
}
