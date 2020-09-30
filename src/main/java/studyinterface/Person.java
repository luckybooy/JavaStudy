package studyinterface;

/**
 * 接口的定义:
 *     如果一类抽象类中的所有的方法都是抽象的,我们可以将这个抽象类定义为一个接口
 *
 *     接口是行为的抽象,类是属性和行为的抽象
 */

interface  A {
    //接口中定义的常量,前边默认带有 "public static final"修饰符
    public static final double PI = 3.14;

    //因为接口中的所有方法都是抽象的,那么我们在定义方法的时候就可以直接省掉"abstract" 这个修饰符了
    public abstract void smokeA();
    public abstract void sleepA();
}


/**
 * 接口语法结构
 *      interface[关键字] + 接口名 + {}
 */
interface  B extends A{
    public void smokeB();
    public void sleepB();
}

/**
 * 接口中可以实现多继承
 */
interface C extends A,B{

}


/**
 * 实现多继承接口的类 必须将继承中所有接口的方法进行实现
 */
class CImp implements C{
    String name = "实现接口的类";
    public void smokeA(){
        System.out.println(name + "AAAAA抽中华~~~~");
    }
    public void sleepA(){
        System.out.println(name + "AAAAA总是睡到日晒三竿...");
    }

    public void smokeB(){
        System.out.println(name + "BBBBB抽中华~~~~");
    }
    public void sleepB(){
        System.out.println(name + "BBBBB总是睡到日晒三竿...");
    }
}

/**
 * 接口不能被实例化,所以必须通过类来进行实例化
 * 其语法格式为: class[关键字] + 类名 + implements[关键字] + 接口名 + {  [方法体里边必须实现接口中的方法] }
 */

class Hero implements A{
    String name = "巧克力";
    public void sleepA(){
        System.out.println(name + "在呼呼睡懒觉······");
    }
    public void smokeA(){
        System.out.println(name + "在悠哉悠哉的抽着雪茄~~~");
    }
}



public class Person {
    public static void  main(String[] args){
        Hero hero = new Hero();
        hero.sleepA();

        CImp cImp = new CImp();
        cImp.sleepA();
        cImp.smokeB();
    }
}
