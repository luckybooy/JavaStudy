package thread.learnone;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread
 * @description 测试runnable
 * @date 2020-05-02 20:15:50
 */
public class TestRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ImpleRunnable("下载①"));
        thread.run();
        Thread thread2 = new Thread(new ImpleRunnable("下载②"));
        thread2.run();
    }
}
