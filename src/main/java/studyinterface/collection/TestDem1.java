package studyinterface.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDem1 {
    public static void main(String[] args) {
        //创建一个集合col
        Collection col = new ArrayList();
        //向集合中添加元素
        col.add("林肯");
        col.add("辉腾");
        col.add("宾利");
        System.out.println(col);

        iteratorColl(col);
    }

    /**
     *
     * 定义一个遍历迭代器的方法
     * @param collection
     */
    public static void iteratorColl(Collection collection){
        //获得一个迭代器对象 迭代器的指针是一去不复返的,只能遍历一次
        //默认的迭代器的指针是在第一个指针的上边的,hasNext()就是判断集合中是否有下一个元素
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
