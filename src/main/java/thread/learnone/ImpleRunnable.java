package thread.learnone;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread
 * @description 创建线程的第二种方式 实现runnable接口
 * @date 2020-05-02 20:13:51
 */
public class ImpleRunnable implements Runnable {

    private String name;

    public ImpleRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println(name + "下载了" + i);
        }
    }
}
