package classstudy;

class  Student{
    String name;
    int age;

    /**
     * static在属性上的应用
     *
     * 被static修饰的属性,我们叫他类属性,也可以叫他静态属性
     * 类属性的特点:
     * 1.可以通过  类名.静态属性名 (Student.sCount)来访问,也可以通过对象来访问 student.sCount 来访问
     * 2.类属性能够被所有对象共享
     * 3.生命周期:类属性所在的类文件(.class文件)加载进jvm时,类属性就被初始化,jvm执行完毕Student.class文件
     *   除了jvm,类属性才会被销毁
     *
     *   类属性初始化的时间相对来说早于对象属性
     */
    static int sCounts;
}



public class TestStaticOnAttribute {
    public static  void main(String[] args){
        Student student = new Student();
        student.sCounts++;
        Student student1 = new Student();
        student1.sCounts++;
        Student student2 = new Student();
        student2.sCounts++;

        /**
         * 这个例子就说明 类属性是可以被对象所共享的
         * 这里的Student.sCounts 表明可以通过类名.类属性来进行访问的
         */
        System.out.println(Student.sCounts);
    }
}
