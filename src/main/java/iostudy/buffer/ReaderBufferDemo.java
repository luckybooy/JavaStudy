package iostudy.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.buffer
 * @description 使用Buffer缓存机提高读写效率
 * @date 2020-04-28 18:59:06
 */
public class ReaderBufferDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            //创建一个高速缓存字符输入流对象
            // BufferReader bfr = new BufferReader(这里边是一个Reader对象)
            reader = new BufferedReader(new FileReader("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\writer\\IoStudyOne.java_bak"));

            //读取一行数据    //如果str 为null的话,就说明文件读到末尾了
            String str = null;

            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }

            // System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {

                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
