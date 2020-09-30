package fatherandsontranslate;

/**
 * 2.父类转化为子类
 *     a)父类转换为子类不能自动转换,需要强制转换
 *     b)父类转换为子类的前提是父类的真身是这个子类,转回子类后就能正常的访问
 *       子类中的方法和属性
 *     c)如果父类A的真身是的子类B,不能强制转换为子类C,只能转换为子类B
 *     d)抽象类作为父类,同样具有上述的特点
 *     e)接口同样符合上述属性,   需要注意的是接口中   "没有属性"
 */
class PersonTwo{
    String name;
    int age;
    public void running(){
        System.out.println(name + " is running~~~");
    }
}

class StudentTwo extends PersonTwo{
    boolean isGirl;
    public void running(){
        System.out.println(name + " zai zi lei zhong  running~~~");
    }
    public void playBall(){
        System.out.println(name + "正在打篮球...");
    }
}

class StudentThree extends PersonTwo{
    public void watching(){
        System.out.println(name + " is watching TV...");
    }
}


public class TestTranslateTwo {
    public static void main(String[] args){
        //父类转换为子类  不可行 会报类型不匹配的错误
//        StudentTwo st = new PersonTwo();
        PersonTwo pt = new StudentTwo();
        pt.name = "xiaoran";
        pt.running();
        /*//这个时候是不能调用子类的属性和方法的
        pt.isGirl =true;
        pt.playBall();*/

        //又将父类引用的类型转换为子类后 就可以 正常调用子类的属性和方法了
        StudentTwo st = (StudentTwo) pt;
        st.isGirl =true;
        st.playBall();

        /**
         * 下边这两句是 1.首先将父类的引用指向StudentTwo
         *  2.使用强制转换,将父类的引用强制转换为StudentThree
         *  虽然在编译的时候不会报错,但是执行的时候就报" cannot be cast to class" 不能强制转
         *  c)如果父类A的真身是的子类B,不能强制转换为子类C,只能转换为子类B
         */
        /*PersonTwo ptwo = new StudentTwo();
        StudentThree sthree = (StudentThree) ptwo;*/
    }
}
