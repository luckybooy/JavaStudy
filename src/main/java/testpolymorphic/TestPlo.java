package testpolymorphic;

/**
 * 多态的学习
 * 多态定义:多态就是行为具有多种功能的表现能力
 * 父类中定义了一个方法,子类在继承的时候将这个方法进行重写行为,就可以称之为多态(即一个方法有多种实现形式)
 *
 */
interface Teacher{

    public  void teach();
}

class JavaTeacher implements Teacher{
    String name;
    int age;
    public void teach(){
        System.out.println(name + "老师在教Java");
    }
}

class PHPteacher implements Teacher{
    String name;
    int age;
    public void teach(){
        System.out.println(name + "老师在教PHP");
    }
}

class Leader{
    /**
     * 定义一个考核老师的方法
     * Teacher t = new JavaTeacher
     * 因为子类可以自动的转换为父类
     * @param t
     */
    public void check(Teacher t){
        if(t instanceof JavaTeacher){
            System.out.println("这是一个Java老师");
        }
        if (t instanceof PHPteacher){
            System.out.println("这是一个PHP老师");
        }
        t.teach();
        System.out.println("打分");
    }
}


public class TestPlo {
    public static void main(String[] args){
        JavaTeacher jt = new JavaTeacher();
        jt.name = "李艳";
        jt.teach();
        PHPteacher pt = new PHPteacher();
        pt.name = "蒋芳艳";
        pt.teach();

        System.out.println("==========================");
        Leader leader = new Leader();
        leader.check(jt);
        leader.check(pt);

    }
}
