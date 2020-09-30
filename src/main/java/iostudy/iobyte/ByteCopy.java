package iostudy.iobyte;

import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.iobyte
 * @description 字节拷贝图片mp3等文件的用法
 * @date 2020-04-29 13:07:28
 */
public class ByteCopy {
    public static void main(String[] args) {
        InputStream ins = null;
        OutputStream ous = null;

        try {
            //定义拷贝的文件资源
            ins = new FileInputStream("D:\\wallpapers\\xiaoluoli.png");
            //定义拷贝到的新文件资源
            ous = new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\xiaoluoli.png    ");

            byte[] bytes = new byte[1024];
            int critical = 0;
            /**
             * 将D:盘下的/wallpapers/xiaoluoli.png 进行拷贝
             */
            while ((critical = ins.read(bytes)) != -1){
                ous.write(bytes,0,critical);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ins != null){
                    ins.close();
                }
                if (ous != null){
                    ous.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
