package review;

import java.io.File;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package review
 * @description 遍历删除指定路径下的所有文件
 * @date 2020-04-26 15:14:38
 */
public class FactorialFileALL {
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\delTest");
        factDelFile(file);
    }

    private static void factDelFile(File file) {
        if (file == null ||!file.exists()){
            return;
        }
        File[] files = file.listFiles();
        for(File f:files){
            if (f.isDirectory()){
                factDelFile(f);
            }else {
                //先删文件  如果文件夹里边的文件都被删除,变成空问文件夹
                f.delete();
            }
        }
        //删除本次文件目录
        file.delete();
    }
}
