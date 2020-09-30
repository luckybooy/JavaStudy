package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat();
        String df = sdf.format(date);
        System.out.println(df);
        //第二种格式话时间串
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS E");
        String df1 = sdf1.format(date);
        System.out.println(df1);
        //将字符串解析成时间
        String s = "2020-02-02 02:20:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //将字符串解析为日期对象
            Date date1 = sdf2.parse(s);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
