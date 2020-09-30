package studyinterface;
interface  NewspTwo{
    /**
     * 在接口中定义一个默认的方法
     */
    public default void learn(){
        System.out.println("这个在接口中定义的一个默认learn()方法");
    }
}

class Student implements NewspTwo{
    /*public void learn(){
        System.out.println("这是继承接口实现的一个实例化learn()方法");
    }*/
}



public class NewSpecialTwo {
    public static void main(String[] args){
        Student student = new Student();
        student.learn();
    }
}
