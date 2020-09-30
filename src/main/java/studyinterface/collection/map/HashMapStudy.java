package studyinterface.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    /**
     * HashMap的学习
     *   特点   1.HashMap是Map的实现类
     *          2.允许多个null的value值,但只允许有一个null的key键
     *          3.无序
     *          4.非线程安全
     */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("Lillard","利拉德");
        map.put("Lrving","欧文");
        map.put("Curry","库里");
        map.put("Morant","莫兰特");
        System.out.println(map);

        //虽然HashMap不是线程安全的,但是我们可以通过Collections接口来给他转换为线程安全的
        Collections.synchronizedMap(map);   //转换为了线程安全的
    }
}
