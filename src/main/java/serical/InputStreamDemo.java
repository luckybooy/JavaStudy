package serical;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package serical
 * @description 读持久化的文件
 * @date 2020-05-02 18:07:36
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\serical\\sequence.txt"));

            /**  普通方式反序列化
            Object o = inputStream.readObject();

            //下边的这个过程叫反序列化
            Person p = (Person) o;
            Date birth = p.getBirth();
            int age = p.getAge();
            String name = p.getName();
            System.out.println("生日:" + p.getBirth());
            System.out.println("年龄:" + age);
            System.out.println("姓名:" + name);
*/

            //数组方式反序列化
            Object o = inputStream.readObject();
            List<Person> lists = (List<Person>) o;
            System.out.println(lists);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
