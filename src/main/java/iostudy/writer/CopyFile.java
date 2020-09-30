package iostudy.writer;

import java.io.*;
import java.util.logging.Level;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.writer
 * @description 拷贝File
 * @date 2020-04-28 18:24:00
 */
public class CopyFile {
    public static void main(String[] args) {
        //需要拷贝的源文件
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\writer\\IoStudyOne.java");
        //存放的拷贝的文件
        File fileCopy = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\writer\\IoStudyOne.java_bak");

        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(file);
            //给创建的writer对象赋值
            writer = new FileWriter(fileCopy);
            char[] chars = new char[5];
            int lon = 0;
            while ((lon = reader.read(chars)) != -1){
                //将读到的数据流 直接写到 writer文件对象里边
                writer.write(chars,0,lon);
            }
            //清下缓存
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                //writer  后开的 需要先关闭
                if (writer != null){
                    writer.close();
                }
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
