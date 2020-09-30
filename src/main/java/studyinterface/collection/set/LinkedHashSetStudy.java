package studyinterface.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet 集合的特点
 *  1、元素是有序的  和HashSet相比,只有这点不同 (这个接口不常用)
 *  2、元素不可以重复
 *  3、有且只能有一个null
 *  4、非线程安全
 */
public class LinkedHashSetStudy {
    public static void main(String[] args) {

        Set<String> strLink = new LinkedHashSet<>();

        strLink.add("苍老师");
        strLink.add("武藤兰");
        strLink.add("波多野");
        //输出是有序的
        System.out.println(strLink);
    }
}
