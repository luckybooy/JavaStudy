package studyinterface.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDem2 {
    public static void main(String[] args) {
        //创建一个集合col
        Collection col = new ArrayList();
        //向集合中添加元素
        col.add("林肯");
        col.add("辉腾");
        col.add("宾利");
        System.out.println(col);
    }
}
