package studyinterface.collection.map;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashtableStudy {
    /**
     * Hashtable 的学习
     *   特点   1.Hashtable 是Map的实现类
     *          2.不允许有空值的存在,否则会报空指针错误.............
     *          3.无序
     *          4.线程安全............
     */
    public static void main(String[] args) {
        Map<String,String> hashtable = new Hashtable<>();
        hashtable.put("Lillard","利拉德");
        hashtable.put("Lrving","欧文");
        hashtable.put("Curry","库里");
        //key和value都不能是null 否则就把空指针
        hashtable.put(null,"莫兰特");
        System.out.println(hashtable);
    }
}
