package date;

import java.util.Date;

/**
 * Date类的学习
 */
public class DateTest {
    public static void main(String[] args) {

        //获取当前时间日期对象
        Date date = new Date();
        System.out.println("当前时间:" + date);

        //使用毫秒数来获取当前的时间日期对象
        long currentTimeMillis = System.currentTimeMillis();
        Date date1 = new Date(currentTimeMillis);
        System.out.println("当前时间:" + date1);

        //获取前一天的时间日期对象(一天的毫秒数:24*60*60*1000)
        Date date2 = new Date(currentTimeMillis - 24*60*60*1000);
        System.out.println("当前时间的前一天:" + date2);

        //获取1970-01-01 0点到date2之间的毫秒数
        long date2Time = date2.getTime();
        System.out.println("1970年零点到date2之间的毫秒数是:" + date2Time);
    }
}
