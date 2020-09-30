package iostudy.iobyte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.iobyte
 * @description 巩固
 * @date 2020-04-29 12:47:11
 */
public class InputStreamReview {
    public static void main(String[] args) {
        InputStream ins = null;
        try {
            ins = new FileInputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\bytetest.txt");
            byte[] bytes = new byte[6];

            int temp = 0;
            while ((temp = ins.read(bytes)) != -1) {
                String str = new String(bytes, 0, temp);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (ins != null) {

                    ins.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

