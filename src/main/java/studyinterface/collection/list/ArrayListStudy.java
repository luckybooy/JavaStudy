package studyinterface.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList学习
 *     ArrayList的底层是数组的原理
 *     特点：
 *      a.ArrayList中的元素是可以重复的
 *      b.是有序的集合,长度不固定
 *      c.不是线程安全的集合
 *      d.效率高
 */
public class ArrayListStudy {
    public static void main(String[] args) {
        /**
         * List 是不能被构造的,但是ArrayList是可以被构造的
         * List list 这个是正确的   list=null
         * List list = new List()        这种是错误的[List不能被构造]
         * List list = new ArrayList   是正确的   这是在创建了一个ArrayList的对象后
         * 上溯到了List。此时他是 一个List对象了 ,有些ArrayList有List没有的属性和方法,这
         * 里边这个list对象就不能再用ArrayList的属性和方法了
         * ArrayList arrayList = new ArrayList()这个就是直接创建了一个ArrayList对象,所以
         * 方法和属性可以正常使用.
         *
         */
        List list = new ArrayList();
        list.add("宋江");
        list.add("鲁智深");
        list.add("李逵");
        list.add("晁盖");
        list.add("武松");
        System.out.println("原始数组：" + list);
        //根据元素来删除数组中的元素
        list.remove("李逵");
        //根据索引删除所引出的元素,返回的是删除的元素
        Object lzs = list.remove(1);
        System.out.println("删除的元素是:" + lzs);
        System.out.println("remove 后的数组:" + list);
        //设置/替换索引2处的元素
        list.set(2,"西门庆");
        System.out.println(list);
    }
}
