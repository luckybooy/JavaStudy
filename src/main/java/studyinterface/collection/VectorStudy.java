package studyinterface.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        /**
         * Vector 底层也是数组
         * 和ArrayList和LinkedList相比最大的特点是线程安全的---相应的性能就会有所下降
         */
        Vector vector = new Vector();
        vector.add("曹操");
        vector.add("华雄");
        vector.add("曹植");
        System.out.println(vector);
        //内部类提供的一个接口方法和迭代器差不多
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){
            Object o = elements.nextElement();
            System.out.println(o);
        }
    }
}
