package exception;



public class Demo4 {
    public static void main(String[] args) {
       int res = 0;
        //调用端y运行异常
       try {
           //接收到异常对象
             res = devide(10,0);
        } catch (Exception e) {
            //获得异常的信息
           String message = e.getMessage();
           System.out.println(message);
           //获取异常的详细信息
           String s = e.toString();
           System.out.println(e);
           //打印异常超详细信息
           e.printStackTrace();
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
