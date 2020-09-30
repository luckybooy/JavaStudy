package studyinterface.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestDem {
    public static void main(String[] args) {
        //创建一个集合col
        Collection col = new ArrayList();
        //向集合中添加元素
        col.add("林肯");
        col.add("辉腾");
        col.add("宾利");
        System.out.println(col);

        //创建另一个集合(集合中的元素类型和上边的保持一致)
        Collection collection = new ArrayList();
        collection.add("时风");
        collection.add("东方红");

        //将第二次创建的集合中的所有内容添加到第一个集合中
        col.addAll(collection);
        System.out.println("添加后的集合内容为:" + col);

        //remove 从集合中删除某个元素
        col.remove("林肯");
        System.out.println(col);

        //removeAll() 删除之前添加的一个集合
        col.removeAll(collection);      // 不常用
        System.out.println("删除之前添加的集合:" + col);
        //清空集合中的所有元素
//        col.clear();
//        System.out.println("清空：" + col);
        //判断集合中是否包含某个元素
        boolean bl = col.contains("宾利");
        System.out.println("是否包含:" + bl);       //true

        //集合中的元素个数 size()方法
        int size = col.size();
        System.out.println(size);

        //判断一个集合是否为空
        boolean empty = col.isEmpty();
        System.out.println("是否为空:" + empty);

        //集合转数组
        Object[] obj = col.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
