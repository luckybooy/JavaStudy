package exception;



public class Demo3 {
    public static void main(String[] args) {
       int res;
        //调用端y运行异常
       try {
           //接收到异常对象
             res = devide(10,0);
        } catch (Exception e) {
            e.printStackTrace();
            //处理异常
           System.out.println("I'm sorry,我传错参数了");
           res = devide(10,2);
        }
        //异常后的代码不会再继续执行
        System.out.println("调用端异常后的代码执行了-------");

        System.out.println(res);
    }
    public  static int  devide( int  a ,int b){
        int c = 0;
        c = a/b;
        System.out.println("被调用端异常后的代码执行了+++++");
        return c;
    }
}
