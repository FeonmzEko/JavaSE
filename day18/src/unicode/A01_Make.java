package unicode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class A01_Make {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai泥好";
        byte[] bytes = str.getBytes();

        //System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("GBK");

        //System.out.println(Arrays.toString(bytes1));

        String str1 = new String(bytes,"GBK");
        String str2 = new String(bytes1,"GBK");
        System.out.println(str1);
        System.out.println(str2);
    }
}
