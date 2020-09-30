package system.file;

import java.io.File;

public class FileStudy {
    public static void main(String[] args) {
        //用文件构造器来创建一个file文件对象,要确保文件对象的绝地路径是正确的
        File file = new File("E:\\exercise\\JavaStudy\\pom.xm");
        System.out.println(file.getName());

        File file1 = new File("E:\\exercise\\JavaStudy");
        System.out.println(file1.getName());

        File file2 = new File(file1,"pom.xml");
        System.out.println(file2.getName());
    }
}
