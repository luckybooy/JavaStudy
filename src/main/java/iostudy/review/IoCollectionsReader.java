package iostudy.review;


import java.io.*;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy.review
 * @description IO复习汇总
 * @date 2020-04-30 14:26:25
 */
public class IoCollectionsReader {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
        readerFileMethod(file);
        File file1 = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\write.txt");
        writerFileMethod(file1);
    }

    /**
     * reader方法 读文件
     * @param file
     */
    public static  void readerFileMethod(File file){
        //Reader
        Reader reader = null;
        try {
            //实例化一个读取文件对象
            reader = new FileReader(file);
            //定义一个数组
            char[] chars = new char[1024];
            //定义一个边界,把reader.read(chars)读取到chars的长度传给这个边界,直到这个边界是-1,说明读完了
            int critical = 0;
            while ( (critical=reader.read(chars)) != -1){
                String str = new String(chars,0,critical);
                System.out.print(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * writer方法,可以将读到的内容写到file1里边
     * @param file
     */
    public static  void writerFileMethod(File file){
        //Reader
        Writer writer = null;
        Reader reader = null;
        try {
            reader = new FileReader("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
            //实例化一个读取文件对象
            writer = new FileWriter(file);
            //定义一个数组
            char[] chars = new char[1024];
            //定义一个边界,把reader.read(chars)读取到chars的长度传给这个边界,直到这个边界是-1,说明读完了
            int critical = 0;
            while ( (critical=reader.read(chars)) != -1){
                writer.write(chars,0,critical);
                writer.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
                if (writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
