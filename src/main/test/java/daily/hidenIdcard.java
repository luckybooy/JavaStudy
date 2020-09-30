package daily;

/**
 * @program: JavaStudy
 * @description: 脱敏学习
 * @packagename: daily
 * @author: xiaoran
 * @date: 2020-06-01 17:21
 **/
public class hidenIdcard {
    public static void main(String[] args) {
        String idCard = "222403198908312321";
        idCard = idCard.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
        String idCard2 = idCard.replaceAll("(\\w{3})\\w*(\\w{4})", "*");
        System.out.println(idCard);
        System.out.println("hello world");
        System.out.println(idCard2);

    }
}
