package iostudy.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.reader
 * @description 通过数组来读取文件中的内容
 * @date 2020-04-27 12:42:23
 */
public class ReaderArrayDemo {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            //创建一个char类型数组
            char[] chars = new char[5];
            //向字符数组中添加元素
            /*int res = reader.read(chars);
            System.out.println("读取的长度为:" + res + ",读取到的内容是:" + Arrays.toString(chars));
            res = reader.read(chars);
            //第二次长度不够的话,就把前几个替换掉,其他的保留上次读取到的内容
            System.out.println("第二次读取的长度为:" + res + ",读取到的内容是:" + Arrays.toString(chars));
            res = reader.read(chars);
            //第san次长度不够的话,就把前几个替换掉,其他的保留上次读取到的内容  没有的话,返回-1,数组中保持上次
            System.out.println("第二次读取的长度为:" + res + ",读取到的内容是:" + Arrays.toString(chars));
*/
            System.out.println("--------------------------------分割线--------------------------------");

            /**
             * 第二种方式通过while循环 来读取,并使用String构造器将返回的字符的形式,相对常用
             */

            System.out.println(Arrays.toString(chars));
            int lon = 0;
            while ((lon = reader.read(chars)) != -1) {
                String str = new String(chars, 0, lon);
                System.out.print(str);
            }

        } catch (IOException e) {
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

