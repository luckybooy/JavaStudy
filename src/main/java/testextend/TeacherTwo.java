package testextend;

/**
 *      重点:
 *          1.理解super对父类构造器的调用
 *          2.super()表示子类内部的那个父类对象的引用
 *
 *       this关键字:
 *          1.代表当前类的指定实例的引用
 *          2.可以区分同名属性和局部变量
 *          3.通过this可以调用同类中的构造器(this/this(参数列表...))
 *          4.调用本类里边的属性,this.属性名,this.方法()
 */
class TeacherFather{
    String name = "李鬼";
    int age;

   /*  默认构造器
   public TeacherFather(){
        System.out.println("父类默认的构造器被调用了");
    }

    public TeacherFather(String name){
        this.name = name;
    }*/
    public void print (){
        System.out.println("这是父类的print方法");
    }
}

class TeacherSon extends  TeacherFather{
    String name = "李逵";
    int age;
    boolean isNb;
    /*public TeacherSon(){
        //super();  会默认调用super()方法
        System.out.println("子类构造器被调用了");
    }*/

    public void print (){
        /**
         * 在子类的子方法中调用父类的print方法
         */
        super.print();
        System.out.println(this.name+ "教java");
        /**
         * 如果子类和父类的属性具有相同的属性值,则可通过this.属性名(表示当前队对象),用super.属性名(表示父类的属性)
         */

        System.out.println(super.name + "教父类java~~~~~");
    }
}

/**
 * super关键字
 *  1.子类实例化的过程中父类的构造器会先被调用,然后再调用子类的构造器
 *  2.子类通过构造器实例化时要先调用父类的默认构造器,是隐含的调用了super()这个方法,但是如果
 *  子类的构造其中调用了父类中带有参数的构造器,那么默认的无参构造器将不会被调用
 *  3.super()的调用必须位于构造器的第一行
 *  4.super可以表示父类的引用,我们可以使用super和this来区分父类和子类中的同名属性.
 *  在子类中访问属性的查找顺序:现在子类中查找,子类中没有的话再去父类中找,方法也是如此,当子类
 *  和父类具有相同的方法时,通过子类调用的则是子类的方法,如果想调用父类的方法可以使用super关键
 *  字来调用父类的方法.
 */

public class TeacherTwo {
    public static void main(String[] args){
        TeacherSon ts = new TeacherSon();
        ts.print();
    }
}

