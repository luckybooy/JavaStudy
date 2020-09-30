package exception;



public class Demo_finally {
    public static void main(String[] args) {
       int res = devide(10,0);
        System.out.println(res);

    }
    public  static int  devide( int  a ,int b){
        int c = 0;
        try {
            c = a/b;
        } catch (Exception e) {
            c = 4;
            //方法遇到return就形成返回值,后续再修改变量不会改变返回值
            return c;
        }
        /**
         * finally 代码块适合做方法的资源关闭和首尾工作
         * 其中finally也是唯一一个可以return一次后还能继续return的代码块,可以修改方法的返回值
         */
        finally {
            c = 5;
            System.out.println("被调用端异常后的代码执行了+++++");
            return c;
        }
    }
}
