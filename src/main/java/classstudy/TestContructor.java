package classstudy;

class Hero{
    String name;
    String  mount;
    int age;

    /**
     * 默认构造器(构造器其实也是一种方法)
     * 构造器定义方法：修饰符 + 方法名[必须和类名相同]+（）{}
     */
    public Hero(){

    }

    /**
     * 重载的定义：方法名相同,参数的个数和类型不同
     *            重载和是否有返回值无关
     *            和返回值的类型无关
     */

    /**
     * 定义一个带有一个参数的构造器
     * @param name
     */
    public Hero(String name){
        this.name = name;
    }

    public Hero(int age){
       this.age = age;
    }
    /**
     * 定义一个带有两个参数的构造器
     * @param name
     * @param mount
     */
    public Hero(String name,String mount){
        /*this.name = name;*/
        // this()  表示构造器的调用
        this(name); //this 关键字 必须放在构造器的非注释代码的第一行   在构造器中使用其他构造器就不会再创建对象
        this.mount = mount;
    }

    public Hero(String name,String mount,int age){
        /*this.name = name;
        this.mount = mount;*/
        this(name,mount); // this调用本类中带有两个参数的构造器 注意：只能放在构造器中的第一行
        this.age = age;
    }

    public static  void fighting(String name){
        System.out.println(name + "正在呼唤你");
    }

    public void introduce(String name,String mount,int age ){
        System.out.println("姓名：" + name + " 坐骑：" + mount + " 年龄:" + age);
    }

}


public class TestContructor {
    public static void main(String[] args){
        Hero hero =new Hero();
        Hero hero1 =new Hero("关羽","汗血宝马",24);
        hero1.fighting("张飞");
        hero1.introduce("关羽","汗血宝马",24/**/);
    }
}
