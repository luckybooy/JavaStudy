package iostudy.bytetochar;

import java.io.*;
import java.util.Arrays;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.bytetochar
 * @description 字节和字符转换的桥梁
 * @date 2020-04-29 14:12:48
 */


/**
 * OutputStreamWriter 是字符流通向字节流的桥梁:可以使用指定的编码格式(charset)将要写入流中的字符  编码 成字节
 * 它使用的字符集可以有名称指定,也可以显示给定,否则将接受平台默认的字符集
 */
public class TransByteDemo {
    public static void main(String[] args) {
        //写
        OutputStreamWriter osw = null;

        //读
        InputStreamReader insr = null;
        try {
            /**
             * 开始写
             */
            osw = new OutputStreamWriter(new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\charset.txt"));
            osw.write("中");
            osw.flush();
            String encoding = osw.getEncoding();
            System.out.println(encoding);

            /**
             * 开始读
             */
            insr = new InputStreamReader(new FileInputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\charset.txt"),"utf-8");
            char[] chars = new  char[1024];
            int lon = insr.read(chars);
            System.out.println(new String(chars,0,lon));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null){
                   osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
