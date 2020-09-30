package testmethod;

/**
 * 被final修饰的类不能被子类继承
 */
//final class Cup{
class Cup{
    String tpye;
    /**
     * 被final修饰的属性必须给一个初始化的值,可以直接赋值,也可以在构造其中赋值,有多个构造器
     * 每个构造器都必须赋值
     */
    final int num ;

    public Cup(){
        this.num = 4;
    }
    public Cup(String type, int num){
        this.tpye = type;
        this.num = 9;
    }

    /**
     * 被final修饰的方法不能被子类重写
     */
    public final void print(){
        System.out.println("这是一个被final修饰的方法");
    }

}

class GreenCup extends Cup{
    boolean isGlass;
    //被final修饰的方法,其子类不能重写
    /*public void print(){
        System.out.println("这是子类重写的print方法...");
    }*/
}

/**
 * final总结: [欲练此功,必须自宫]
 *  1.final 修饰的属性 必须初始化,如果有多个构造器,则每个构造器也必须对这个被final修饰的属性初始化
 *  2.final 修饰的方法 不能被子类重写
 *  3.final 修饰的类 不能被继承
 */
public class TestFinal {
    public static void main(String[] args){
        final int i = 10;
        //i = 11;
        System.out.println("final修饰的变量i的值是:" + i);
    }
}
