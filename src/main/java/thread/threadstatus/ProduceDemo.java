package thread.threadstatus;


/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.threadstatus
 * @description 资源的生产者
 * @date 2020-05-04 22:30:45
 */
public class ProduceDemo extends Thread {
    /**
     * 线程之间的通信:
     * 1.线程间的通信,共享数据一定要有synchronized同步代码块
     * 2.一定要有wait() 和 notify(),而且两者一定是成对出现
     * 3.生产者和消费者的 线程实现一定是在 while(true){} 代码块中
     */

    private Market market;

    /**
     * 定义一个带有共享资源的构造器
     *
     * @param market
     */
    public ProduceDemo(Market market) {
        this.market = market;
    }

    /**
     * 重写run()方法
     */
    @Override
    public void run() {
        while (true) {
            synchronized (market) {
                try {
                    if (!market.isEmpty()) {
                        market.wait();
                    }
                    System.out.println("开始生产......");
                    market.setEmpty(false);
                    market.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

