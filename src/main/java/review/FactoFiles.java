package review;

import java.io.File;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package review
 * @description 遍历文件夹下的所有文件
 * @date 2020-04-26 14:42:01
 */
public class FactoFiles {
    static int level;

    public static void main(String[] args) {
        File file = new File("E:\\exercise\\JavaStudy\\src\\main\\webapp");
        factoMthod(file);
    }

    public static void factoMthod(File file) {
        if (file == null || !file.exists()){
            return;
        }
        //设置层级
        level++;
        File[] files = file.listFiles();
        for (File f:files){
            //打印缩进层级
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
            if (f.isDirectory()){
                //调用递归
                factoMthod(f);
            }
        }
        level--;
    }
}
