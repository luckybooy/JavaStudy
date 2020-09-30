package classstudy;
class SingleDemo{
    /**
     * 私有化构造器
     */
    private SingleDemo(){}

    //懒汉模式
//    private static SingleDemo singleDemo;

    //恶汉模式
    private static SingleDemo singleDemo = new SingleDemo();

    /**
     * 定义了一个获取实例的方法 (懒汉模式)
     * @return
     */
    /*public static SingleDemo getInstance(){
        if (singleDemo == null){
            singleDemo = new SingleDemo();
        }
        return singleDemo;
    }*/


    /**
     * 恶汉模式
     * @return
     */
    public static SingleDemo getInstance(){
        return singleDemo;
    }

}


public class TestSingleDemo {
    public static void main(String[] args){
//        SingleDemo singleDemo = new SingleDemo();
        SingleDemo singleDemo1 = SingleDemo.getInstance();
        System.out.println(singleDemo1);
        SingleDemo singleDemo2 = SingleDemo.getInstance();
        System.out.println(singleDemo2);
        SingleDemo singleDemo3 = SingleDemo.getInstance();
        System.out.println(singleDemo3);
        SingleDemo singleDemo4 = SingleDemo.getInstance();
        System.out.println(singleDemo4);
    }

}

