package exercises.string;


public class DemoStringTwo {
    public static void main(String[] args) {
        /**
         * 空字符串和null的区别
         * 空("")是有效的引用,有实际地址,只不过是引用内容的长度是0
         * null是无效的引用,没有实际的地址,不能使用,使用一定会报空指针的错误
         */
        String str = "";
        // null表示空的引用,不能使用


        String str2 = null;
        System.out.println(str2);
    }
}
