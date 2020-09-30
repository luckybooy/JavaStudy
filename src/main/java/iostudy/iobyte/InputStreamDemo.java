package iostudy.iobyte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.iobyte
 * @description 字节输入流
 * @date 2020-04-29 12:13:04
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        InputStream inpt = null;
        try {
            //需要读的文件
            inpt = new FileInputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\bytetest.txt");
            // 读取单个字节
            int read = inpt.read();
            System.out.println(read);
            //将读的文件写入到这个数组中
            /**
             *   创建一个字节数组
             *      byte[6] 这里边的这个6代表一次的的字节码数,这样的话又可以出现乱码,
             *      原因是有的比汉字的字节码会被切割开,因此导致的乱码,可以通调大这个数
             *      值,使文件一次性读完,这样就会不有乱码,可能考虑性能方面的原因,通常情
             *      况下,也不会将这个值设置的很大
             *
             * */
            byte[] bytes = new byte[6];

            /*int read1 = inpt.read(bytes);
            System.out.println(read1);
            //找到临界点 -1
            read1 = inpt.read(bytes);
            System.out.println(read1);

            read1 = inpt.read(bytes);
            System.out.println("第三次到达临界点:" + read1);*/
            int temp = 0;
            //temp 等于 -1 时,证明到达临界点
            while ((temp = inpt.read(bytes)) != -1) {
                String str = new String(bytes, 0, temp);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inpt != null) {

                    inpt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

