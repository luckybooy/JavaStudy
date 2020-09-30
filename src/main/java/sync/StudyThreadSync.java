package sync;

import java.util.Date;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package sync
 * @description 休眠的用法
 * @date 2020-05-03 23:40:28
 */
public class StudyThreadSync {
    public static void main(String[] args) {
        while (true){
            System.out.println(new Date());
            try {
                /**
                 * 注意: 只有sleep 不在synchronized 代码块内部的时候,cpu的资源才会得到释放
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
