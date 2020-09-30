package iostudy.bytetochar;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.bytetochar
 * @description 编码格式学习
 * @date 2020-04-29 14:46:00
 */
public class CharsetTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "萧";  //对应的utf-8 编码[-24, -112, -89]       对应的GBK 编码是:[-49, -12]
        byte[] bytes = name.getBytes("GBK");  //指定什么编码格式输出
        System.out.println(Arrays.toString(bytes));
    }
}
