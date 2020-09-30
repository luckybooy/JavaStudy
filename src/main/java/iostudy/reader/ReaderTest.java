package iostudy.reader;

import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.reader
 * @description 回顾reader
 * @date 2020-04-28 16:33:58
 */
public class ReaderTest {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
        Reader reader = null;

        try {
            reader = new FileReader(file);

            int read = reader.read();
            System.out.println((char) read);
            int temp = 0;
            while ((temp = reader.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("--------------------分割线---------------------");
        readByArr(file);
    }

    /**
     * 定义一个方法 使用数组和 String(chars ,o ,len)构造器来实现文件的读取
     *
     * @param file
     */
    public static void readByArr(File file) {
        char[] chars = new char[5];
        Reader reader = null;
        try {
            reader = new FileReader(file);
            //向数组里边写
            int lon = 0;
            while ((lon = reader.read(chars)) != -1) {
                String str = new String(chars, 0, lon);
                System.out.print(str);
            }
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
