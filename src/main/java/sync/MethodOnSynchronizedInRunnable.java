package sync;


/**
 * @author xiaoran
 * @program JavaStudy
 * @package sync
 * @description synchronized在实现runnable 接口上的使用
 * @date 2020-05-03 20:22:49
 */
public class MethodOnSynchronizedInRunnable {
    public static void main(String[] args) {
        SaleWindImRunnable st = new SaleWindImRunnable();
        //实例化线程对象
        Thread th = new Thread(st,"窗口1");
        Thread th1 = new Thread(st,"窗口2");
        Thread th2 = new Thread(st,"窗口3");
        Thread th3 = new Thread(st,"窗口4");
        Thread th4 = new Thread(st,"窗口5");
        th.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
