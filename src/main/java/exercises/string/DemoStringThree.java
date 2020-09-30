package exercises.string;


import java.util.StringTokenizer;

public class DemoStringThree {
    public static void main(String[] args) {
       String str = "HelloWord";
       //获取字符串的长度
       int strL = str.length();
       System.out.println("字符串HelloWord的长度为:" + strL);
       //获取某个索引位置上的字符
       char strRes = str.charAt(0);
       System.out.println("HelloWord的第一个位置的字符是:" + strRes);
        //获取一个ascii对应的字符  在字符串中第一次出现的位置 a 97、b 98、c 99、d 100、e 101
        int i = str.indexOf(101);
        System.out.println("在字符串的第三个索引位的字符是:" + i);
        //获取一个字符串在 字符串中的第一个位置
        int index = str.indexOf("Wo");
        System.out.println("Wo在字符串HelloWord”中第一次出现的位置是:" + index);
    }
}
