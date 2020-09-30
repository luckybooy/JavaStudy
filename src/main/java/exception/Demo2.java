package exception;



public class Demo2 {
    public static void main(String[] args) {
        //内存溢出示例
        //int[] arr = new int[1024*1024*1024];
        int res = devide(10,0);
        //异常后的代码不会再继续执行
        System.out.println("调用端异常后的代码执行了-------");

        System.out.println();
    }
    public  static int  devide( int  a ,int b){
        int c = 0;
        /**
         * 被调测、用端对异常进行处理（不提倡使用这个异常处理的方法,调用端处理会好一些）
         * try{} 里边放有可能产生异常的代码
         * catch(Exception e) 捕捉到产生异常的对象catch{} 块就是用来处理异常的代码块
         *
         * 在被调用端处理异常
         * try{}catch(){}特点:
         *      1、try内部发生异常后,紧跟在其后边的代码将不会被执行
         *      2、产生的异常对象被catch块里边的参数接收
         *      3、catch块来处理异常,根据实际项目需要进行处理
         *      4、如果异常被catch处理,则该异常不会向上抛出
         *      5、由于异常对象被处理了,异常后边的代码会继续执行
         *      6、调用端不会感知到异常的出现(因为没有向上抛出异常对象),所有后边的代码正常执行
         */

        //抛出运行时异常
        try {
            c = a/b;
            System.out.println("try里边发生异常后边的代码不会再执行....");
        } catch (Exception e) {
            System.out.println("发送异常");
            e.printStackTrace();
        }
        System.out.println("被调用端异常后的代码执行了+++++");
        return c;
    }
}
