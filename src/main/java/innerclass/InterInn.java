package innerclass;

abstract class HeadTeacher{
    private String name;

    /**
     * 定义一个带参数的构造器
     * @param name
     */
    public HeadTeacher(String name){
        this.name = name;
    }

    public HeadTeacher(){}
    /**
     * 封装name
     * @return
     */
    public String getName(){
        return name;
    }

    public abstract void drink();
}

public class InterInn {
    public static void main(String[] args){
        /**
         * 抽象类中的匿名内部类
         */
        HeadTeacher ht = new HeadTeacher("xiaoran") {
            public void drink() {
                System.out.println(getName() + "正在内部类中喝大酒...");
            }
        };
        ht.drink();
    }
}
