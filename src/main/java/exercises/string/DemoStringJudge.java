package exercises.string;


public class DemoStringJudge {
    public static void main(String[] args) {
        String str = "helloworld";

        //判断是否是以传过来的字符传结尾的
        boolean world = str.endsWith("world");


        //字符串常量  存放在数据共享区的字符串常量池中
        String str2 = new String("HELLOWORLD");
        boolean eq1 = str.equals(str2);
        System.out.println(eq1);
        //判斷兩個字符轉忽略大小寫（验证码常用）
        boolean eq2 = str.equalsIgnoreCase(str2);
        System.out.println(world);
        //判断一个字符转是否包含传过来的字符串
        boolean isCon = str.contains("llow");
        System.out.println("是否包含:" + isCon);
        //是否以hello开头
        boolean isStart = str.startsWith("Hello");
        System.out.println("是否开头:"+isStart);
        //判断一个字符转是否是空字符串
        boolean isEmpty = str.isEmpty();
        String strEmpty = "";
        //判断一个字符串是否是空串,最好把空串的常量放在前边,防止空指针异常
        boolean empty = strEmpty.isEmpty();


        System.out.println("是否是空字符串" + isEmpty);
        System.out.println("空字符串" + empty);
    }
}
