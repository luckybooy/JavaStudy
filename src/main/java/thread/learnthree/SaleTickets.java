package thread.learnthree;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.learnthree
 * @description 一个线程代表一个卖票窗口
 * @date 2020-05-02 21:16:33
 */
public class SaleTickets extends Thread {
    //窗口属性名
    private String name;

    //共享资源用类属性表示(被static 修饰)
    static int tickets = 100;

    //定义一个锁对象  共享对象一定要用static 修饰鸭！！！
    static Object obj = new Object();
    public SaleTickets(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        while (true) {
            /**
             * synchronized 线程锁 需要将包含所有共享资源的代码给包括住 才能保持数据的安全
             * 才能保证一个票只能被卖出去一次
             *
             *      synchronized(){
             *          里边包含的内容有:
             *             1.代码被多个线程访问
             *             2.代码中有共享数据
             *             3.共享数据被多条语句操作
             *
             *      }
             *
             *
             */
            synchronized (obj){
                if (tickets > 0) {
                    System.out.println(this.name + "在卖" + tickets-- + "号票");
                }else {
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name  + "买票结束...");
    }
}
