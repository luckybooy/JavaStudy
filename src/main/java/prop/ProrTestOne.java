package prop;

import java.util.Properties;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package prop
 * @description 属性properties的学习
 * @date 2020-04-30 15:45:51
 */
public class ProrTestOne {

    public static void main(String[] args) {
        /**
         * Properties:类表示一个持久属性集。properties可保存在流中或从流中加载,
         * 属性中的key和value键值对 都是String类型的
         *  特点:
         *      1.继承于HashTable,是线程安全的键值对存储结构
         *      2.properties 可以保存在流中,或从流中加载
         *      3.只能存储 "字符串" 类型的键值对
         */
        Properties properties = new Properties();
        properties.setProperty("一汽","大众");
        properties.setProperty("华晨","宝马");
        properties.setProperty("梅赛德","奔驰");
        properties.setProperty("东方","雪铁龙");
        System.out.println(properties);
        String df = properties.getProperty("东方");
        System.out.println(df);
    }
}
