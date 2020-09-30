package iostudy.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.reader
 * @description 读字节流的方式
 * @date 2020-04-27 12:03:27
 */
public class IoReaderDemo {
    /**
     * 读取文件"iotest.txt"中的内容并打印到控制台
     * 读取步骤:
     * 1.创建输入流对象
     * 2.读取数据
     * 3.关闭输入流
     *
     * @param
     */
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
            //一次读一个字符 被转换成了ASCII码,  所以返回的是整型
//            int lo = reader.read();
            //讲整形转换为char
//            System.out.println((char)lo);
            int c = 0;
            //单个字符读取,性能低,效率慢
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {

                    //关闭资源
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

