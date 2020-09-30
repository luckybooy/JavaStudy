package studyinterface.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * set 集合的特点
 *  1、元素是无序的
 *  2、元素不可以重复
 *  3、有且只能有一个null
 *  4、非线程安全
 */
public class HashSetStudy {
    public static void main(String[] args) {

        Set<Teacher> teachSet = new HashSet<>();

        teachSet.add(new Teacher("苍老师",34));
        teachSet.add(new Teacher("武藤兰",36));
        teachSet.add(new Teacher("苍老师",34));
        System.out.println(teachSet);


        Set<String> strLink = new HashSet<>();

        strLink.add("苍老师");
        strLink.add("武藤兰");
        strLink.add("波多野");
        //输出是无序的
        System.out.println(strLink);
    }
}
