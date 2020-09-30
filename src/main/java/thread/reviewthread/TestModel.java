package thread.reviewthread;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.reviewthread
 * @description 测试类
 * @date 2020-05-07 23:33:54
 */
public class TestModel {
    public static void main(String[] args) {
        ReThread rth = new ReThread("窗口一");
        ReThread rth1 = new ReThread("窗口二");

        rth.start();
        rth1.start();
    }
}
