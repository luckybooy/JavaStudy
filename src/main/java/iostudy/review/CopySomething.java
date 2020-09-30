package iostudy.review;

import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.review
 * @description 复制字节文件
 * @date 2020-05-06 22:52:18
 */
public class CopySomething {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("D:\\tools\\ScreenPrinter\\GIF录制工具好用.exe"));
            out = new BufferedOutputStream(new FileOutputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\review\\GIF录制工具好用.exe"));

            byte[] bytes = new byte[1024];
            int critical = 0;
            while ((critical = in.read(bytes)) != -1){
                out.write(bytes,0,critical);
                out.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
