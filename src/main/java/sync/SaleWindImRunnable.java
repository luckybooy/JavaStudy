package sync;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package sync
 * @description 售票窗口对象  通过实现 Runnable接口的方式来创建窗口
 * @date 2020-05-03 20:32:13
 */
public class SaleWindImRunnable implements Runnable {

    //实现runnable接口的时候 就不用再有static 修饰了
    int tickets = 100;

    @Override
    public void run() {
        saleTicketsTwo();
    }

    /**
     * 创建一个锁对象,该对象是共享的
     * 实现runnable接口的时候 就不用再有static 修饰了
     */
    Object obj = new Object();

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

            /*synchronized (obj){
                if (tickets > 0) {
                    *//**
             * Thread.currentThread().getName()  获取当前的线程名字
             *//*
                    System.out.println(Thread.currentThread().getName() + "卖的是" + (tickets--) + "号票...");
                }
                else {
                    break;
                }
            }


            if (isSync()){
                break;
            }*/

            if (isSyncTwo()){
                break;
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "卖票结束...");
    }

    public boolean isSync(){
        boolean isFinished = false;
        synchronized (obj){
            if (tickets > 0) {
                /**
                 * Thread.currentThread().getName()  获取当前的线程名字
                 */
                System.out.println(Thread.currentThread().getName() + "卖的是" + (tickets--) + "号票...");
            }
            else {
                isFinished = true;
            }
        }
        return isFinished;
    }

    /**
     * 用synchronized修饰 方法  这里需注意,如果是继承Thread类的话, 此处的方法应该是类方法
     * 即:需要添加static 修饰符
     * @return
     */
    public synchronized boolean isSyncTwo(){
        boolean isFinished = false;
//        synchronized (obj){
            if (tickets > 0) {
                /**
                 * Thread.currentThread().getName()  获取当前的线程名字
                 */
                System.out.println(Thread.currentThread().getName() + "卖的是" + (tickets--) + "号票...");
            }
            else {
                isFinished = true;
            }
//        }
        return isFinished;
    }
}
