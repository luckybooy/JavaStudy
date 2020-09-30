/**
 *  注意:有抽象方法的类必须是抽象类,但是抽象类中不一定有抽象方法
 *  抽象类不能和final,private,static同时结合使用
 *
 *  抽象类的特点:
 *      1.抽象类不能被实例化,只能被继承,通过子类实例化
 *      2.抽象类必须被子类继承才可使用实例化
 *      3.继承了抽象类的非抽象类,必须实现抽象类的所有抽象方法
 *
 */
abstract  class Person{
    String name;
    int age;
    String sex;

    public void sleep(){
        System.out.println(name + "准备碎觉咯...");
    }
    public void smoke(){
        System.out.println(name + "在抽烟~~~");
    }

    /**
     * 抽象方法不能有方法体 即:不能有大括号{}
     * 抽象类中包括的抽象方法,其继承的子类中也必须包括这个抽象方法
     */
    public abstract void study();
}

 abstract class Student extends Person{
     /**
      * 因为父类Person是抽象类,且该类中有抽象方法,作为子类必须要继承他的这个抽象方法
      */
    public void study(){
        System.out.println(name + "学生子类,继承的抽象父类的抽象方法study");
    }
    public abstract  void sing();

}

class Worker extends Student{
    public void study(){
        System.out.println(name + "工人子类,继承了父类的学习方法");
    }
    public void sing(){
        System.out.println(name + "继承了抽象父类Student,所以也要继承他的抽象方法sing()~~~");
    }
}



public class TestAbstract {
    public static void main(String[] args){
        /* 抽象类:被修饰符abstract修饰的类叫抽象类,抽象类不能被实例化
        Person p = new Person();
        p.name = "老好人";
        p.sleep();
        Student s = new Student();
        s.name = "Apple";
        s.sleep();
        s.study();*/
        Worker worker = new Worker();
        worker.name = "李工头";
        worker.sing();
    }
}
