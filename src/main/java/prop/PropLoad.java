package prop;

import java.io.*;
import java.util.Properties;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package prop
 * @description 加载流中的属性值
 * @date 2020-05-01 23:22:11
 */
public class PropLoad {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream fins = null;
        try {
            fins = new FileInputStream("E:\\exercise\\JavaStudy\\src\\main\\java\\testProp.properties");
            //获取项目中的.properties文件
            // .properties 文件默认的编码格式是 ISO 8859-1
            //此处用InputStreamReader(fins) 是将FileInputStream 转换成 InputStreamReader
            prop.load(new InputStreamReader(fins));
            System.out.println(prop);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fins != null){
                    fins.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
