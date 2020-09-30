package studyinterface.collection.list;

import java.util.LinkedList;

public class LinkListedStudy {
    public static void main(String[] args) {
        /**
         * 栈:先进后出
         * 队列:先进先出
         * 链表:存储了元素和前后的地址
         * LinkedList 也不是线程安全的
         * 增删改的效率高,但是查询的性能比list低
         */
        LinkedList linkedList = new LinkedList();
        linkedList.add("刘备");
        linkedList.add("张飞");
        linkedList.add("关羽");
        System.out.println(linkedList);
        //在链表最前边添加
        linkedList.addFirst("萧然");
        System.out.println(linkedList);
        //在末尾添加
        linkedList.addLast("曹操");
        System.out.println(linkedList);
        //移除第一个
        Object removeFirst = linkedList.removeFirst();
        System.out.println("移除的第一个元素是:" + removeFirst);
        System.out.println("移除第一个元素后:" + linkedList);
        linkedList.removeLast();    //移除最有一个
        //把链表看做是一个栈  出栈是从第一个开始出的
        Object lb = linkedList.pop();
        System.out.println(lb);
        System.out.println(linkedList);
        //压栈
        linkedList.push("凤雏");
        System.out.println("压栈后的集合:" + linkedList);


    }
}
