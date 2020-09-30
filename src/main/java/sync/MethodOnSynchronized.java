package sync;


/**
 * @author xiaoran
 * @program JavaStudy
 * @package sync
 * @description synchronized在方法上的使用
 * @date 2020-05-03 20:22:49
 */
public class MethodOnSynchronized {
    public static void main(String[] args) {
        SaleWindExThread st = new SaleWindExThread("售票员1号");
        SaleWindExThread st1 = new SaleWindExThread("售票员2号");
        SaleWindExThread st2 = new SaleWindExThread("售票员3号");
        SaleWindExThread st3 = new SaleWindExThread("售票员4号");
        SaleWindExThread st4 = new SaleWindExThread("售票员5号");
        //实例化线程对象
        Thread th = new Thread(st);
        Thread th1 = new Thread(st1);
        Thread th2 = new Thread(st2);
        Thread th3 = new Thread(st3);
        Thread th4 = new Thread(st4);
        th.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
