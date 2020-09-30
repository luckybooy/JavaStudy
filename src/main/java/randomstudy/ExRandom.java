package randomstudy;

import java.util.Random;

/**
 * 随机数
 */
public class ExRandom {
    public static void main(String[] args) {
        //创建一个随机数的对象
        Random random = new Random();
        //在int 范围内获取一个随机整数
        for (int i = 0; i < 10; i++) {
            //获取[0,10)区间的整数
            int ran = random.nextInt(10);
//            System.out.println(ran);
        }
        // 定义完seed后 再次生产的随机数都是固定的一组,除非改变seed,否则将无变化  在加密、文件命名和验证码有所应用
        Random rand = new Random(78);
        for (int i = 0; i < 10; i++) {
            int nextInt = rand.nextInt(100);
            System.out.println(nextInt);
        }

    }
}
