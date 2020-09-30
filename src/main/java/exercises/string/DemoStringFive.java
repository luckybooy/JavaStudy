package exercises.string;


public class DemoStringFive {
    public static void main(String[] args) { 
        String str = "Hell8ow08H3a";
        /**
         * 字符串中针对于字母的大小写转换
         */
        String strUp = str.toUpperCase();
        String strLow = str.toLowerCase();

        System.out.println("字符串中小写字母的个数是:" + strUp  );
        System.out.println("字符串中大写字母的个数是:" + strLow  );
    }
}
