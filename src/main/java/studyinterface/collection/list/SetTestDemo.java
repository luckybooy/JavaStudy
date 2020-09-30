package studyinterface.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetTestDemo {
    public static void main(String[] args) {
        /**
         * 泛型学习
         * 泛型就是在集合中指定存储的数据类型,而且只能存储这种类型
         * 语法List<类型> = new ArrayList<>() 后边这个可数据类型填可不填
         * 注意：
         *      基本数据类型不能作为泛型
         * 定义一个集合内指定只能存储一种数据类型
         */
        //定义一个只能存储字符串的集合
        List<String> list = new ArrayList<>();
        list.add("qianqing");
        list.add("liyan");
        list.add("tianchao");
        System.out.println(list);
        System.out.println("--------------分割线------------");
        /**
         *  使用迭代器遍历集合
         *  创建一个迭代器
         *  因为上边指定的泛型是 String,所以在创建迭代器的时候会自动的创建一个String类型的迭代器
         */

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            //返回的类型也跟着泛型的String过来了
            String next = iterator.next();
            System.out.println("遍历结果为:" + next);
        }
    }
}
