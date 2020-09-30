package studyinterface.collection.arraystool;

import studyinterface.collection.list.Person;
import studyinterface.collection.set.Teacher;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Arrays工具类
 *  数组的工具类,这里的方法都是静态的
 *      1.把数组转换成字符串
 *      2.对任意数组排序
 *      3.对任意数组做二分法查找
 *      4.把数组转换为List
 */
public class ArraysTools {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,32,12,45};
        //将数组转换为字符串
        String str = Arrays.toString(arr);
        System.out.println("原始数组:" + str);
        //对数组进行排序  升序
        Arrays.sort(arr);
        System.out.println("排序后的:" + Arrays.toString(arr));
        //针对于对象数组进行排序
        //需要将对象的类实现Comparable接口  也可以定义自己的比较方法
        Person[] th = new Person[2];
        Person t = new Person("猴哥",35);
        Person t1 = new Person("马哥",36);
        th[0] = t;
        th[1] = t1;
        Arrays.sort(th);
        System.out.println(Arrays.toString(th));
        System.out.println("------------分割线------------");
        //二分法查找  定义的数组是要有顺序的
        int[] arr2 = {1,3,5,7,22,34,45,52};
        //根据二分法查找arr2数组中元素7的索引
        int index = Arrays.binarySearch(arr2, 7);
        System.out.println("7的索引是:" + index);

        Integer[] arr3 = {1,3,5,7,22,34,45,52};
        //将数组转换为List集合
        List<Integer> integers = Arrays.asList(arr3);
        System.out.println("转换后:" + integers);
        System.out.println("--------------------------------");
        List<String> list = new ArrayList<>();
        list.add("火箭");
        list.add("湖人");
        list.add("独行侠");
        list.add("凯尔特人");
        System.out.println(list);
    }
}
