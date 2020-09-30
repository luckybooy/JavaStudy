package thread.reviewthread;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.reviewthread
 * @description 回顾线程
 * @date 2020-05-07 23:26:59
 */
public class ReThread extends Thread {
    private String name;

    //定义一个共享锁（多线程共享的）对象 只要是被共享的  一定是要用static 修饰符来修饰
    static Object obj = new Object();

    static int tickcts = 100;

    public ReThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickcts > 0) {
                    System.out.println(name + "在卖" + tickcts-- + "号座位.");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "卖完了");
    }
}
