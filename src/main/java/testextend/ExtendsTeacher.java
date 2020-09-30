package testextend;

/**
 * 继承 (关键字:extends)  如果在父类中包含了某些类中的共有的属性和方法，可以采用继承，优化代码，提高效率
 *  特点：
 *      1.子类会把父类所有的属性和方法都继承下来
 *      2.子类除了继承下来父类的属性之外，也可以有自己的属性
 *      3.父类更通用，子类更具体
 *      4.子类只能获得父类的非私有化的属性(即:没有private修饰符修饰的属性)
 *        如果想要继承，就需要父类提供公用的set和get方法
 *      5.只能单继承(一个子类不能同时继承多个父类)
 *
 *      用法:
 *          class + 类名 + extends关键字 + 父类{}
 *       如：
 *          class PythonTeacher extends Teacher{}
 */

class Teacher{
    String name;
    int age;
    boolean isGlass;
    public void sleep(){
        System.out.println(name + "在睡觉啦~~~~");
    }
}

class JavaTeacher extends Teacher{
    /*String name;
    int age;
    boolean isGlass;

    public void sleep(){
        System.out.println(name + "在睡觉...");
    }*/

    public  void teachJava(){
        System.out.println(name + "教Java...");
    }
}

class PythonTeacher extends Teacher{
   /* String name;
    int age;
    boolean isGlass;

    public void sleep(){
        System.out.println(name + "在睡觉");
    }*/

    public void teachPython(){
        System.out.println(name + "教python");
    }

}




public class ExtendsTeacher {
    public static void main(String[] args){
        JavaTeacher jt = new JavaTeacher();
        jt.name = "狗蛋儿";
        jt.age = 23;
        jt.isGlass = true;
        jt.teachJava();
        jt.sleep();

        PythonTeacher pt = new PythonTeacher();
        pt.name = "宁采臣";
        pt.age = 66;
        pt.isGlass = false;
        pt.teachPython();
        pt.sleep();
    }
}
