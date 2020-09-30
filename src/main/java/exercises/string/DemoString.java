package exercises.string;

/**
 * 1、字符串常量是共享的  存放在内存的数据共享区
 * 2、字符串不能变化,如果我们在字符串上做拼接,实则是产生了一个新的字符串
 */
public class DemoString {
    public static void main(String[] args) {
        String str = "xiao";
        String str1 = "xiao";
        str += "ran";

        String str3 = new String("xiao");
        /**
         * 直接定义一个变量"abc"和创建一个对象"abc"的区别
         * 如果没有定义一个变量,直接创建对象的话,会在堆中创建一个对象,然后再在字符串常量
         * 池中创建一个对象,实则创建了两个对象
         * 直接定义"abc"的话,就只在字符串常量池中创建一个对象"abc"
         */
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(str);
        System.out.println(str == str1);
        System.out.println(str1.equals(str3));
    }
}
