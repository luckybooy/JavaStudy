package thread.threadstatus;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package thread.threadstatus
 * @description 消费端
 * @date 2020-05-04 23:09:07
 */
public class CustomerDemo extends Thread {

    private Market market;

    public CustomerDemo(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        while (true){
            synchronized (market){
                try {
                    if (market.isEmpty()){
                        market.wait();
                    }
                    System.out.println("消费端开始消费...");
                    market.setEmpty(true);
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
