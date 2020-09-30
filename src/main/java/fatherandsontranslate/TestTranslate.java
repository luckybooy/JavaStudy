package fatherandsontranslate;

/**
 * 父子类之间的转换
 *  1.子类转换为父类
 *      a)实例化的时候子类可以自动转化为父类
 *      b)如果子类对父类的方法有复写,并且子类的实例赋值给父类引用,通过这个引用来调用这个复写的方法时候,
 *        调用的是子类的方法
 *      c)父类指向子类的实例的引用不能调用子类特有的方法和属性
 *      d)如果父子了有相同的属性,那么父类指向子类的实例的引用调用这个属性的时候,调用的是父类的属性,
 *        这个不要和方法混淆
 *  2.父类转换为子类
 */


class Person{
    String name = "萧然";
    int age;
    public void greet(){
        System.out.println(name + " 在say hello...");
    }
}

class Student extends Person{
    String name = "Luckyboy";
    boolean isGirl;
    public void greet(){
        System.out.println(name + " 在子类中正在say hello");
    }

    public void song(){
        System.out.println(name + "正在热情的唱歌...");
    }

}


public class TestTranslate {
    public static void  main(String[] args){
        /**
         * b)如果子类对父类的方法有复写,并且子类的实例赋值给父类引用,通过这个引
         *   用来调用这个复写的方法时候,调用的是子类的方法
         */
        Person person = new Student();
        //person.name = "狗蛋儿";
        person.greet();
        /**
         * c)父类指向子类的实例的引用不能调用子类特有的方法和属性
         * 下边的这个方法/属性是子类的,因为上边的person这个引用是父类的,但是song()这个
         * 方法/isGirl这个属性是子类的,父类中没有,所以都不能被调用
         */
        //person.song();
        //person.isGirl = true;
        /**
         * 父类和子类都有name这个属性,但是这个子类实例的引用被指向给了父类,所以
         * 调用的是父类的属性[输出"萧然"]
         */
        System.out.println(person.name);

    }
}
