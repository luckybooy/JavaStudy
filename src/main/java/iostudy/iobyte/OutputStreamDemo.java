package iostudy.iobyte;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.iobyte
 * @description 字节输出流
 * @date 2020-04-29 11:53:33
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        OutputStream opt = null;
        OutputStream opt1 = null;
        try {
            /**
             * 此处的FileOutputStream 构造器可以有多种形式
             *      1、可以以创建文件对象的形式来创建一个构造器 OutputStream opt = new FileOutputStream(File file);
             *      后边还可以再跟一个参数如:OutputStream opt = new FileOutputStream(File file,true); 表示可以追加
             *
             *      2、可以直接采用文件名的形式来创建 如: OutputStream  opt = new FileOutputStream("");
             */
            opt = new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt", true);
            opt1 = new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\bytetest.txt");
            //向文件中写入 单个字符
            //opt.write(99);

            //用字节数组的方式向文件中写入
            byte[] bytes = {96, 97, 98, 99, 100, 101};
            opt1.write(bytes);

            //向文件中写入数组的部分字节 从索引位置开始,写入三个长度的字节
            opt.write(bytes, 1, 3);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (opt != null) {

                    opt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
