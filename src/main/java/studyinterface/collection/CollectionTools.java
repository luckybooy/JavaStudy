package studyinterface.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTools {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(10);
        System.out.println("默认数组:" + list);
        //将数组倒置
        Collections.reverse(list);
        System.out.println("倒置数组:" + list);
        //将数组排序
        Collections.sort(list);
        System.out.println("排序数组:" + list);
    }
}
