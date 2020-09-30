package iostudy.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy
 * @description 写入字符串的方式
 * @date 2020-04-27 11:21:43
 */
public class IoWriterDemo {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            // append 表示追加  true 可以追加,false 不追加
            //fileWriter传过来是文件名 和 append
            writer = new FileWriter("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt", false);
            for (int i = 0; i < 100; i++) {
                //换行  win下最好用 "\r\n"   mac 用 "\r"
                writer.write("萧然最帅\r\n");
                if (i % 10 == 0) {
                    writer.flush();
                }
            }
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