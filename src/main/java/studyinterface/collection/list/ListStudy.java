package studyinterface.collection.list;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListStudy {
    public static void main(String[] args) {
        //创建一个list集合,并在其尾部追加元素
        List list = new ArrayList();
        list.add("宋江");
        list.add("鲁智深");
        list.add("李逵");
        list.add("晁盖");
        list.add("武松");
        /**
         * 在指定索引位置添加元素
         */
        list.add(3,"林冲");
        System.out.println(list);
        //获取集合中元素的个数
        int size = list.size();
        System.out.println(size);
        /**
         * 用迭代器来遍历list数组
         */
        //创建一个List迭代器
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
        String str = (String)listIterator.next();
        if (str.equals("宋江")){
            /**
             * 我们不能在一边遍历的时候一边操作集合,这样有多线程的并发问题
             */
//            list.add("李师师");   //墙插会报错
            /**
             * 通过迭代器提供的add()方法来,添加元素,add()可以让我们避免并发问题,
             * 但是添加的时候本次遍历不生效,so这种方式不是太常用
             */
//            listIterator.add("李师师");
        }
//            System.out.println(str);
        }
//        System.out.println(list);
        System.out.println("-------------分割线-------------");
        /**
         * 第二种遍历list集合的方式(以后的工作中会用这种)
         */
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if ("林冲".equals(str)){
                list.add(4,"江青");
            }
            System.out.println(str);
        }
    }
}
