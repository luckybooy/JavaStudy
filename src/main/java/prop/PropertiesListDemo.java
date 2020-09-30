package prop;

import java.io.*;
import java.util.Properties;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package prop
 * @description 把properties输入到流中
 * @date 2020-05-01 22:39:00
 */
public class PropertiesListDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("詹姆斯","哈登");
        prop.setProperty("勒布朗","詹姆斯");
        prop.setProperty("拉塞尔","维斯布鲁克");
        prop.setProperty("德文","布克");

//        System.out.println(prop);
        PrintWriter pw = null;
        try {
            //定义一个要存储到那个文件里边
            pw = new PrintWriter("E:\\exercise\\JavaStudy\\src\\main\\java\\testProp.properties");
            //通过list方法将properties的键值对 写到 定义的pw文件对象中
            prop.list(pw);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null){
                pw.close();
            }
        }
    }
}
