package studyinterface.collection.map;

import java.util.*;

public class HashTreeStudy {
    /**
     * TreeMap 的学习
     *   特点   1.TreeMap 是Map的实现类
     *          2.允许多个null的value值, key键的值不能为空,否则会报空指针错误
     *          3.无序
     *          4.非线程安全
     */
    public static void main(String[] args) {
        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("Lillard","利拉德");
        treeMap.put("Lrving","欧文");
        treeMap.put("Curry","库里");
        treeMap.put("Morant",null);
        System.out.println(treeMap);

        Map<String ,String> linkedHashMap = new LinkedHashMap<>();
        Map<String ,String> ht = new Hashtable<>();


        //虽然HashMap不是线程安全的,但是我们可以通过Collections接口来给他转换为线程安全的
        Collections.synchronizedMap(treeMap);   //转换为了线程安全的
    }
}
