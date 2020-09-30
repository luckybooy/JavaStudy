package thread.learnone;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread
 * @description 线程的学习
 * @date 2020-05-02 19:28:26
 */
public class TestDemo {
    /**
     *  线程和进程
     *
     *  进程:计算机中特定功能的程序在数据集上的一次运行
     *  线程:线程是进程的一个单元
     *  多线程:一个进程中有多个线程同时运行
     *  jvm是多线程的,在我们运行jvm的时候后台会运行垃圾回收的线程,来处理没有被引用的对象
     * @param args
     */
    public static void main(String[] args) {

        /**mt.run()的话就只是调用了类中的一个方法  不算是启动线程
        *mt.run();
        */
        /**
         * 启动线程  要有start()方法
         */


        /**
         * 在启动线程之前可以对线程的优先级进行设置
         * 可以参考Thread的Api进行
         * static int MAX_PRIORITY      10
         *           线程可以具有的最高优先级。
         * static int MIN_PRIORITY      1
         *           线程可以具有的最低优先级。
         * static int NORM_PRIORITY     5
         *           分配给线程的默认优先级。
         */

        MyThread mt = new MyThread("线程测试一");
        /**
         * 通过setDaemon(true)的方式来设置守护线程（也叫用户线程）
         * 主线程结束后,无论守护线程是否直接完毕,都将被 结束掉
         */
        mt.setDaemon(true);
        mt.start();
        //启动第二个线程
        /**
         * 通过join()方法来使某个线程先执行  ---加入线程
         * 加入的线程一定要在start()的后边
         */
        MyThread mt1 = new MyThread("线程测试二");
        mt1.start();
        try {
            mt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread mt2 = new MyThread("线程测试三");
        /**
         *  给线程三 设置一个最高的优先级  优先级越高,分配cpu的资源就越多
         */
        mt.setPriority(Thread.MAX_PRIORITY);
        mt2.start();

//        System.out.println("方法结束...");
    }
}
