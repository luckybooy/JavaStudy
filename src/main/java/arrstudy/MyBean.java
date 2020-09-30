package arrstudy;

import java.math.BigDecimal;

public class MyBean {
    public static  void main(String [] args){
        /*

        MyTestBean m=new MyTestBean();
        m.setId(1);
        m.setName("zhangsan");
        m.setPassword("123456");
        System.out.println(m);

         */
        BigDecimal a = new BigDecimal(3.4466);
        System.out.println(a.setScale(0,BigDecimal.ROUND_CEILING));



        BigDecimal bdTest = new BigDecimal(1.545);
        BigDecimal bdTest1 = new BigDecimal(2.732);
        BigDecimal bdTest2 = new BigDecimal(7.736);
        BigDecimal bdTest3 = new BigDecimal(0.74522);
        bdTest = bdTest.setScale(0, BigDecimal.ROUND_HALF_UP);
        bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
        bdTest2 = bdTest2.setScale(2, BigDecimal.ROUND_HALF_UP);
        bdTest3 = bdTest3.setScale(3, BigDecimal.ROUND_CEILING);
        System.out.println("bdTest:" + bdTest); // 1.75
        System.out.println("bdTest1:" + bdTest1); // 0.74
        System.out.println("bdTest2:" + bdTest2); // 0.74
        System.out.println("bdTest3:" + bdTest3); // 0.74
    }
}
