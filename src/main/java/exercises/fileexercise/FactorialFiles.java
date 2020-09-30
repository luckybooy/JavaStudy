package exercises.fileexercise;

import java.io.File;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package exercises.fileexercise
 * @description 使用递归算法来遍历某目录下的所有文件
 * @date 2020-04-26 13:39:23
 */
public class FactorialFiles {
    // 定义一个层级
    static int level;
    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\test");
        factFiles(file);
    }

    public static void  factFiles(File path){
        if (path == null || !path.exists()){
            return;
        }
        //层级+1
        level++;
        File[] files = path.listFiles();
        for (File file1:files){
            //打印层级的缩进
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(file1.getName());
            //判断文件是否存在
            if (file1.isDirectory()) {
                factFiles(file1);
            }
        }
        //第一次遍历完后要再减回去
        level--;
    }
}
