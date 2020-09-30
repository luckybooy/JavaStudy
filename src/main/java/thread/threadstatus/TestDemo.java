package thread.threadstatus;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.threadstatus
 * @description 测试主方法
 * @date 2020-05-04 23:12:20
 */
public class TestDemo {
    public static void main(String[] args) {
        Market market = new Market();
        ProduceDemo produceDemo = new ProduceDemo(market);
        produceDemo.start();
        CustomerDemo customerDemo = new CustomerDemo(market);
        customerDemo.start();
    }
}
