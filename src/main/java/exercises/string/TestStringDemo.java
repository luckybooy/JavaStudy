package exercises.string;

import java.util.Scanner;

/**
 * 将字符串的首字母变成大写,其他的是小写
 */
public class TestStringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String inputStr = scanner.nextLine();

            if (inputStr == null || inputStr.isEmpty()) {
                System.out.println("输入有误,请重新输入...");
                continue;
            }
            if (inputStr.equals("exit")){
                break;
            }
            //获取字符串的首字母
            String firstLetter = inputStr.substring(0, 1);
            //将首字母转换为大写
            String firstUpper = firstLetter.toUpperCase();
//        System.out.println(firstUpper);
            //获取出首字母外的其他字符
            String subOther = inputStr.substring(1);
            //将其他的字符转换为小写
            String otherLow = subOther.toLowerCase();
//        System.out.println(otherLow);
            //将首字母和其他字符整合到一起
            String concatF = firstUpper.concat(otherLow);
            System.out.println(concatF);

        }
        System.out.println("程序结束");
    }
}
