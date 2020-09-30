package packaging;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * 类型之间的转换
 */
public class TestTwoTranslate {
    public static void main(String[] args) {
        /**
         * Integer 常用做类型直接的转换(int,String,Integer)
         */
        //Integer————>int
        Integer integer = 10;
        int a = integer.intValue();
        System.out.println("Integer转换为int" + a);

        //int————>Integer
        Integer integer0 = new Integer(12);
        System.out.println("Integer转换为int后的值为:" + integer0);
        //Integer————>String
        Integer integer1 = 20;
        String str = integer1.toString();
        String str1 = integer1 + "";
        System.out.println("转换为字符串后的值为:" + str);
        System.out.println(str1);

        //String————>int
        String str2 = new String("23");
        int i = Integer.parseInt(str2);
        System.out.println("字符串转化为Integer：" + i);
        // 转换为十六进制
        String string = Integer.toHexString(143);
        System.out.println( "十六进制:" + string);
        //转换为二进制
        String string1 = Integer.toBinaryString(10);
        System.out.println("10的二进制为:" + string1);
        //转换为八进制
        String string2 = Integer.toOctalString(520);
        System.out.println("520对应的八进制为：" + string2);
    }
}
