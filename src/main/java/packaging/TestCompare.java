package packaging;

public class TestCompare {
    public static void main(String[] args) {
        Integer integer = new Integer(23);
        Integer integer1 = new Integer(23);
        /**
         * 基本类型的变量的数据和对象的引用存放在栈中
         * "=="和equals 在比较两个对象时
         * "=="表示的是两个对象的引用是否一样 [引用地址] [栈中内容]
         * equals 比较的是对象引用的值是否一样 [对象的值][堆中的内容是否一样]
         */
        System.out.println(integer == integer1);
        System.out.println(integer.equals(integer1));
    }
}
