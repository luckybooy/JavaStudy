package review;

import java.io.File;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package review
 * @description 遍历删除文件保留文件夹
 * @date 2020-04-26 15:14:38
 */
public class FactorialFileDel {
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
            //f.delete();
            if (f.isDirectory()){
                factDelFile(f);
            }else{
                f.delete();
            }
        }
    }
}
