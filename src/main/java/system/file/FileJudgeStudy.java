package system.file;

import common.eunm.IsBoolean;

import java.io.File;
import java.io.IOException;

public class FileJudgeStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\system\\file");
        //判断文件是否存在
        boolean exists = file.exists();
        System.out.println(exists);
        //判断一个文件对象是否是文件  //文件的话返回   true        //目录的话返回 false
        File file1 = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\system\\file\\FileStudy.java");
        boolean isF = file1.isFile();
        System.out.println(isF);

        //判断一个文件对象是否是目录
        File file2 = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\system\\file\\");
        boolean isDirectory = file2.isDirectory();
        int res = transMethod(isDirectory);
        System.out.println("该文件对象是否是目录:" + IsBoolean.getDescByStatus(res));


        //判断一个路径是否是绝对路径
        boolean isAbsolute = file2.isAbsolute();
        int res1 = transMethod(isAbsolute);
        System.out.println("该路径是否是绝对路径:" + IsBoolean.getDescByStatus(res1));

        //判断一个文件是否是可读的
        File file3 = new File("E:\\exercise\\JavaStudy\\src\\main\\java\\system\\file\\FileJudgeStudy.java");
        boolean read = file3.canRead();
        System.out.println("可读:" + read);

        //判断一个文件是否是可写的
        File file4 = new File("E:\\exercise\\JavaStudy\\src\\main\\test\\NewDir\\file.txt");
        boolean write = file4.canWrite();
        System.out.println("可写:" + write);

        //判断一个文件是否是隐藏的
        File file5 = new File("E:\\exercise\\JavaStudy\\src\\main\\test\\NewDir\\hide.txt");
        //创建了一个hide.txt文件
        file5.createNewFile();
        //判断一个文件是否是隐藏的
        boolean hidden = file5.isHidden();
        System.out.println("隐藏:" + hidden);


    }

    /**
     * 定义一个转换方法
     * @param isTrue
     * @return
     */
    public static int transMethod(boolean isTrue){
        int flag = 0;
        if (isTrue){
            flag=1;
        }
        else {
            flag = 2;
        }
        return flag;
    }
}
