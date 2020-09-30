package studyinterface.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapStudy {
    public static void main(String[] args) {
        /**
         * 创建一个map
         * Map<k,v>  其中的k,v都是泛型(可以是任意类型but不能是基本数据类型),平常项目中k通常是String类型
         * k-键 具有和Set集合相同的特征[1.无序，2.唯一性,3.只能有一个null]
         *
         * Map的特点:
         *  1.成对出现
         *  2.只能有一个空的key
         *  3.key的值不能重复
         *  4.value值是可以有多个重复的
         *  5.map也是无序的
         *  6.k只能有一个是null,但是值可以多个为null,对于value值是无要求的
         */
        Map<String,String> map = new HashMap<>();
        //向map集合中添加键值对
        map.put("James","詹姆斯");
        map.put("Harden","哈登");
        map.put("Russell","威少");
        map.put("Anthony","安东尼");
        map.put("Paul","保罗");
        //key 不能重复,重复的话,后边的会覆盖前边的,所以说key具有唯一性,和key只允许出现一次也是一个道理
//        map.put("Paul","隆多");
        /**
         * key的值只能有一个null,如果有多个,最后的一个会把前边的都覆盖掉
         * 所以下边会输出 null=考辛斯
         * 但是value值是可以重复的
         */
        map.put(null,"隆多");
        map.put(null,"考辛斯");
        map.put("Grant","加内特");
        map.put("WolfKing","加内特");


        System.out.println(map);
    }
}
