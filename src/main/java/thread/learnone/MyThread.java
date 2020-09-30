package thread.learnone;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread
 * @description 自定义的一个线程
 * @date 2020-05-02 19:48:24
 */
public class MyThread extends Thread {

    private String name;

    public  MyThread (String name ){
        this.name = name;
    }
    /**
     * 线程的创建方式 一
     *    继承Thread 类并重写run方法
     * 创建线程方拾二
     *      实现runnable 接口
     */
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println( name + "下载了" + i + "%");
        }
    }
}
