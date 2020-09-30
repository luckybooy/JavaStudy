package studyinterface.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("Lillard","利拉德");
        map.put("Lrving","欧文");
        map.put("Curry","库里");
        map.put("Morant","莫兰特");
        System.out.println(map);

        System.out.println("-------------------分割线------------------");

        Map<String,String> map1 = new HashMap<>();
        map1.put("Young","特雷杨");
        map1.put("McGrady","麦迪");
        // 向一个集合中添加另一个集合
        map.putAll(map1);
        System.out.println(map);
        //根据key来删除集合中的元素[k,v] 键值对
        String lrving = map.remove("Lrving");
        System.out.println("删除的值是:" + lrving);
        System.out.println(map);
        //获取map集合中的key值,放到一个set集合里边
        Set<String> strings = map.keySet();
        System.out.println(strings);
        int i = map.hashCode();
        System.out.println(i);
        //根据key来获取对应的Value
        String morant = map.get("Morant");
        System.out.println(morant);

        //遍历map集合
        for (String key:strings){
            //根据遍历出来的key后,再根据key来获取对应的value值
            String value = map.get(key);
            System.out.println(key + "------>" + value);
        }
    }
}
