package system.file;

import javax.lang.model.element.NestingKind;
import javax.management.loading.MLet;
import java.io.File;
import java.io.IOException;

public class CreateFileStudy {
    public static void main(String[] args) throws IOException {
        //用文件构造器来创建一个file文件对象,要确保文件对象的绝地路径是正确的
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\test\\test.txt");
        //判断文件是否存在,有的话将不会再创建
        System.out.println(file.exists());
        //之前目录下没有这个test.txt这个文件,在执行createNewFile()后就会创建一个文件
        boolean newFile = file.createNewFile();
        //如果已存在会返回false
        System.out.println(newFile);

        //创建一个文件夹   在已知的路径"E:\\exercise\\JavaStudy\\src\\main\\test"下添加一个NewDir 文件夹
        File file1 = new File("E:\\exercise\\JavaStudy\\src\\main\\test\\NewDir");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        //创建多级目录
        File file2 = new File("E:\\exercise\\JavaStudy\\src\\main\\test\\NewDir\\aa\\bb\\cc");
        file2.mkdirs();

        //文件的删除   程序删除不走回收站
        boolean delete = file.delete();
        System.out.println(delete);
        //删除file2 绝对路径的最后一级的文件或目录(空目录才可以被删除)
        file2.delete();
    }
}
