package testmethod;

/**
 *  方法的重写:
 *      在子类继承父类时,子类的方法和父类的方法(访问修饰限制符,返回值类型,方法名,参数列表),方法体不同
 *      这种子类的方法将父类方法覆盖的形式就叫重写
 */
class TeacherThree{
    String name ;
    int age;

    public void print(){
        System.out.println("父类的print方法" + name + "在教学");
    }
}
class MysqlTeacher extends TeacherThree{
    public MysqlTeacher (){

    }

    /**
     * 方法的重写,重写了父类的print()方法
     */
    public void print(){
       System.out.println("子类的print方法:" + name + "Teaching~~~");
    }

    public void method(){
        //调用本类的方法
        this.print();
        //调用父类的方法
        super.print();
    }
}


public class TestOverWrite {
    public static void main(String[] args){
        MysqlTeacher mt = new MysqlTeacher();
        mt.name = "狗蛋儿";
        //mt.print();
        mt.method();
    }
}
