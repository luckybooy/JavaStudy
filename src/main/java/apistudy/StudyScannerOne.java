package apistudy;

import java.util.Scanner;

public class StudyScannerOne {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入你的成绩:");
       int score = scanner.nextInt();
       if (score >= 90){
           System.out.println("emm..不错哟,恭喜你拿到了A");
       }if (score < 90 && score >=60){
           System.out.println("emm..just soso,恭喜你拿到了B");
       }if (score < 60){
           System.out.println("啥也不是,C");
       }
   }
}
