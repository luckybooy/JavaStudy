package classstudy;

/**
 * 单例模式学习
 * 步骤
 *  1.私有化构造器
 *  2.定义一个类方法获得单例的对象
 */
class Singleton{

    private static Singleton singleton;
    /**
     * 懒汉模式和恶汉模式的区别就在于 是否一开始就初始化一个对象

    //懒汉
    private static Singleton singleton;

    //恶汉
    private static Singleton singleton =new Singleton();
     */


    /**
     * 定义一个私有化构造器
     */
    private Singleton(){

    }

    /**
     * 懒汉模式
     * 定义了一个类方法 用来获取单例对象的,返回值是这个类的类型
     * @return
     */
    public static Singleton getInstance(){
        /**
         * 恶汉模式的话 就不用通过if 判断了,因为初始化的时候已经给他创建一个对象了
         */
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}


public class TestSingleton {
    public static void main(String[] args){
        /*Singleton s = new Singleton();
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();*/

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }
}
