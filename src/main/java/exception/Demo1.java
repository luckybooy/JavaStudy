package exception;

/**
 * error & exception (错误和异常)
 * 异常:我们在写程序是难免会出现错误,java中的异常机制是为了提高我们程序的健壮性
 * 和容错性的存在,程序可以处理,异常都是以Exception结尾的.
 * 异常也分为两类:
 *     1、编译期异常,这个异常必须处理,否则无法编译通过
 *
 *     2、运行时异常,编译可以正常通过,在运行期间报的异常,runtimeException一下的子类都是运行时异常
 *      运行时异常对象会自动向上抛出,抛给调用端,调用端再抛给jvm,jvm打印出异常信息
 *      异常信息展示异常类型,显示异常位置——>代码的哪一行
 *
 *      异常后的代码不会再继续执行
 *
 * 错误:Error是throwable的子类,他是程序出现了严重的问题,这种问题程序本身解决不了
 *      如:因为内存溢出或者没有可用的内存空间提供给垃圾回收器时,java虚拟机无法分
 *      配一个对象,这时抛出的异常。错误都是以Error结尾的.
 */



public class Demo1 {
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
        c = a/b;
        System.out.println("被调用端异常后的代码执行了+++++");
        return c;
    }
}
