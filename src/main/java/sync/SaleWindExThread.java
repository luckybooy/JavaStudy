package sync;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package sync
 * @description 售票窗口对象  通过继承Thread 的方式来创建窗口
 * @date 2020-05-03 20:32:13
 */
public class SaleWindExThread extends Thread {
    private String name;

    static int tickets = 100;

    public SaleWindExThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        saleTickets();
//        saleTicketsSync();
        saleTicketsTwo();
    }

    /**
     * 多线程未加锁  方法一
     */
    public void saleTickets(){
        while (true) {
            if (tickets > 0) {
                System.out.println(name + "卖的是" + (tickets--) + "号票...");
            }
            else {
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "卖票结束...");
    }

    /**
     * synchronized  修饰方法 保证数据一致
     */
    public synchronized void saleTicketsSync(){
        while (true) {
            if (tickets > 0) {
                System.out.println(name + "卖的是" + (tickets--) + "号票...");
            }
            else {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "卖票结束...");
    }

    /**
     * 创建一个锁对象,该对象是共享的
     */
    static Object obj = new Object();

    public void saleTicketsTwo(){
        while (true) {
            /**
             *    synchronized (){}的用法
             *    记得要定义一个锁对象  用static 修饰[继承Thread类的时候要加static],实现runnable接口的时候
             *    不用加,因为在主方法 实例化对象的时候 使用一个对象就可以了
             *      synchronized(对象){
             *          操作的共享数据的代码
             *      }
             */

            synchronized (obj){
                if (tickets > 0) {
                    System.out.println(name + "卖的是" + (tickets--) + "号票...");
                }
                else {
                    break;
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "卖票结束...");
    }
}
