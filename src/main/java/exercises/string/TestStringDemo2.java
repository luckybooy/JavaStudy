package exercises.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStringDemo2 {
    public static void main(String[] args) {
        String  str = "10001:xiaoming:23:1|10002:lihua:22:2|10003:zhangkai:25:1";
//        String  str = "10001|10002|10003";
        Person[] person = new Person[3];
        // 用‘|’来切割字符串
        String[] strings = str.split("\\|");
        for (int i = 0; i < strings.length; i++) {
            //10001:xiaoming:23:1
            String[] split = strings[i].split("\\:");
            Person p = new Person();
            p.setIdCard(split[0]);
            p.setName(split[1]);
            //Integer.parseInt()类方法,将字符串转化为整数
            p.setAge(Integer.parseInt(split[2]));
            p.setGender(Integer.parseInt(split[3]));
            //System.out.println(p.toString());
           //把创建的对象放入到数组中
            person[i] = p;

            System.out.println(Arrays.toString(person));
        }
    }
}
