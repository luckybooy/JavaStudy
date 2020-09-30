package system;

import java.util.Properties;
import java.util.Set;

public class TestSys {
    public static void main(String[] args) {
        //获取1970年1月1日0点到当前的毫秒数
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        //获取系统信息
        Properties properties = System.getProperties();
        System.out.println(properties);
        Set<Object> objects =  properties.keySet();
        for (Object obj:objects){
            String key = (String)obj;
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);
        }
    }
}
