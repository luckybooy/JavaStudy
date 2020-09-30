package serical;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package serical
 * @description 序列化学习
 * @date 2020-05-02 16:59:53
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *  序列化流
 *  对象输入流
 *      ObjectOutputStream 将java对象写入 OutputStream
 *  对象输出流
 *      ObjectInputStream 对以前写入的OutputStream对象进行反序列化
 */
public class SercialDemo {
    public static void main(String[] args) {
        Person p = new Person("xiaoran",24, new Date());
        Person p1 = new Person("xiaoranla",25, new Date());
        Person p2 = new Person("xiaoranya",26, new Date());
        /**
         *  将对象写到文件中,通过查看ObjectOutStream 需要使用ObjectOutputStream(OutputStream out)这个构造器
         *  注意: 要序列化的对象要实现序列化的接口
         */

        List<Person> list = new ArrayList<>();
        list.add(p);
        list.add(p1);
        list.add(p2);
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\serical\\sequence.txt"));
            //将实例化的Person p 写入到相应的文件中
//            outputStream.writeObject(p);

            /**
             *      对多个对象序列化的时候要用List
             */
            //以数组的方式进行序列化
            outputStream.writeObject(list);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
