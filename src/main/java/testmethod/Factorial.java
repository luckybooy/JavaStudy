package testmethod;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package testmethod
 * @description 阶乘算法
 * @date 2020-04-26 13:26:41
 */
public class Factorial {
    public static void main(String[] args) {
        int res = faMethod(4);
        System.out.println("阶乘的结果为" + res);
    }


    //定义一个阶乘算法  阶乘的英文：factorial
    public static int faMethod(int num){
        //定义一个结束的标识
        int result = 1;
        if (num > 1){
            //递归算法  自己调自己的方法
            result = num * faMethod(num-1);
        }
        return result;
    }
}
