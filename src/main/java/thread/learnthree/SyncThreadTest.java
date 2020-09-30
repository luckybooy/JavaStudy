package thread.learnthree;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.learnthree
 * @description 并发是采用线程锁的方式对共享资源进行控制
 * @date 2020-05-02 21:15:29
 */
public class SyncThreadTest {
    public static void main(String[] args) {
        /**
         * 创建三个窗口
         */
        SaleTickets st1 = new SaleTickets("窗口一");
        SaleTickets st2 = new SaleTickets("窗口二");
        SaleTickets st3 = new SaleTickets("窗口三");


        st1.start();
        st2.start();
        st3.start();

    }
}
