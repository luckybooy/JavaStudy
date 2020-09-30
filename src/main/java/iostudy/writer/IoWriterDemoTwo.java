package iostudy.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy
 * @description 写入字符串的方式用字符数组
 * @date 2020-04-27 11:21:43
 */
public class IoWriterDemoTwo {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.tx");
        Writer writer = null;
        char[] chars = {'I', 'l', 'o', 'v', 'e', 'U'};
        try {
            writer = new FileWriter(new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt"));
            writer.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (writer != null) {

                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

