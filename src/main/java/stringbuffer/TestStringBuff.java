package stringbuffer;

/**
 * 可变字符串stringBuffer的学习
 * Sting和StringBuffer的区别:
 *  String一旦被创建后,值是不能被改变的,如果参与操作,引用则发生变化,
 *  并非是在原有的字符串上操作,而是又新增了一个字符串
 *  StringBuffer是一个可变的字符串,创建后可以对他进行增删改,引用不会发生改变
 *  也不会产生新的字符串
 *
 *  可变字符串StringBuffer是线程同步(线程安全)
 *  多个线程同时操作同一个资源时,可能发生数据安全性的问题.
 *  注意:
 *      凡事有力就有弊,这种StringBuffer线程安全,性能会受到相应的影响
 *
 */
public class TestStringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("xiaoran");
        //在原有的字符串上追加后引用不变
        StringBuffer sb1 = sb.append("zhenshuai");
        //判断可变字符串操作有引用有没有发生变化
        System.out.println(sb == sb1);          //返回true
        System.out.println(sb.equals(sb1));     //返回true
    }
}
