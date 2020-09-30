package classstudy;
class StudentInfo {
    String name;
    int age;

    /**
     * 被static 修饰的属性是类属性
     */
    public static String StuNo;

    static int Tel = 1778;

    /**
     * 定义一个对象方法
     */
    public void sleep() {
        System.out.println("小明正在睡觉...");
        getStuNo();     //属性方法可以调用类方法
    }

    /**
     * 定义一个类方法（被static修饰的方法叫类方法,可以通过类名.方法名来调用[StudentInfo.getStuNo]）
     * 类方法中可以调用本类的其他的类方法,但是不能调用对象方法,因为类方法和类属性一样很早就被加载进去了
     * 类方法也是很早就被加载进去,可是他不一定被启用,只有在创建完对象以后,才可以使用对象方法
     * <p>
     * 类方法最常用到的场景是工具类的定义
     * <p>
     * 同时也不难理解属性方法可以调用类方法,毕竟类方法都比较先被加载进去
     *
     * @return
     */
    public static String getStuNo() {
        getStuNo();     //类方法可以调用类方法
        /*sleep();        //类方法不能调用属性方法*/
        return StuNo;
    }


    public static int getStuTel() {
        System.out.println("this is a static method...");
        return Tel;
    }

}




public class TestStaticMethod {
    public static void main(String[] args){
//        System.out.println(StudentInfo.getStuTel());
        System.out.println("这是主函数...");

    }

    /**
     * 定义一个静态方法
     */

    static String  setNum(String num){
        System.out.println("这是一个静态方法");
        return num;
    }



    /**
     * 下边这个是静态代码块  这个代码块一定要在类里边
     * 静态代码块的特点:
     *  1.静态代码块常用于初始化资源
     *  2.静态代码块在main函数之前执行
     *  3.静态代码块可以访问类属性和类方法,但是不能访问对象属性和对象方法
     */
    static{
        System.out.println("这是一个静态代码块...");
        setNum("记得双击摸摸哒...");
    }
}
