package iostudy.buffer;

import javax.xml.transform.Source;
import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.buffer
 * @description 使用WriterBuffer 缓冲机制快速的写文件
 * @date 2020-04-28 19:12:49
 */
public class WriterBufferDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\writer\\IoStudyOne.java_bak"));
            writer = new BufferedWriter(new FileWriter("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\writer\\IoStudyOne.java_bak01"));

            String  str = null;

            while ((str=reader.readLine() ) != null){
                //System.out.println(str);
                writer.write(str);
                //打印换行
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null){
                    writer.close();
                }
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
