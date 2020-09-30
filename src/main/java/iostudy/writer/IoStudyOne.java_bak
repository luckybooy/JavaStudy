package iostudy.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package iostudy
 * @description io学习I
 * @date 2020-04-27 10:02:29
 */
public class IoStudyOne {
    /**
     * IO指的就是Input/output
     * IO流在java中从输入输出交付分类  可分为  输入流  和   输出流
     * IO流在java中从数据的角度来分析的话  可分为   字符流 和   字节流
     * 字符流
     * 文本,我们能读的懂得都可以认为是字符流,如:文章,java文件
     * 字符流类的命名规则:
     * 如果是输出流就以writer 结尾
     * 如果是输入流就以reader 结尾
     * 字节流
     * 二进制的数据,这种数据一般用文本打开我们看不懂,比如: 图片、mp3等
     * <p>
     * 使用字符流向一个文件输入"helloworld"
     * 步骤:
     * 1.创建文件
     * 2.创建输出流对象
     * 3.把流指向指定的文件
     * 4.释放资源
     *
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\iostudy\\iotest.txt");
        Writer writer = null;
        try {
            // IO流是需要关闭的,如果不这样设计就不能关闭资源
            // file 这之前没有通过CreateNewFile()方法来创建文件对象,在这里new FileWriter的时候会自动创建
            //fileWriter传过来是File对象
            writer = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                writer.write("xiaoran shi zui shuai de ...");
                if (i % 10 == 0) {
                    //每写十遍,就一下缓存,提高程序的性能
                    writer.flush();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //判断writer不是空,防止空指针
            try {
                if (writer != null) {
                    //使用finally来关闭资源
                    //系统隐藏操作,在关闭前会做一个清空的flush的操作
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

