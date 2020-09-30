package iostudy.buffer;

import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.buffer
 * @description 通过Buffered高速缓冲机制来进行文件的拷贝
 * @date 2020-04-29 13:30:48
 */
public class ByteCopyBuffer {
    public static void main(String[] args) {
        InputStream bufin = null;
        OutputStream bufout = null;

        try {
            //实例化高速字节流缓冲对象
            bufin = new BufferedInputStream(new FileInputStream("D:\\wallpapers\\xiaoluoli.png"));

            bufout = new BufferedOutputStream(new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\小灰灰.png"));

            //定义一个字节数组 //通常使用1024这个长度
            byte[] bytes = new byte[1024];
            //定义一个临界点
            int critical = 0;
            while ((critical = bufin.read(bytes)) != -1){
                bufout.write(bytes,0,critical);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufin != null){
                    bufin.close();
                }
                if (bufout != null){
                    bufout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
