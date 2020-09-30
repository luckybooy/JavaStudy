package system.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class GetPathStudy {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\test");
        //获取文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println("文件test的绝对路径为:" + absolutePath);
        //获取某个指定路径下的子文件
        System.out.println("-------------------指定路径下的子文件----------------");
        File[] files = file.listFiles();
        for (File file1 : files){
            System.out.println(file1);
        }


        System.out.println("-------------------指定路径下的子文件的名字----------------");
        //指定路径下的子文件的名字
        String[] fileName = file.list();
        for (int i = 0; i < fileName.length; i++) {
            System.out.println(fileName[i]);
        }

        System.out.println("-------------------指定路径下的上次修改时间----------------");
        //复习时间格式化
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        long l = file.lastModified();  //返回毫秒数
        Date dateMill = new Date(l);       //将毫秒数转换为日期格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(dateMill);
        System.out.println("上次修改文件时间为:" + dateMill);

        //获取根路径目录
        System.out.println("-------------------获取根路径目录----------------");
        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));
    }
}
