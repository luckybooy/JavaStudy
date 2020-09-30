package classstudy;

class Person{
    private  String  name;

    private  int age;

    /**
     * 没有static 修饰的方法是对象方法
     * this关键字也只能在对象方法中使用
     */
    public void playGames(){
        System.out.println(this.name);
    }
}

public class TestObj {
    public static void main(String[] args){
        Person p = new Person();
        String name = "王凯伦";
        System.out.println(p);
        System.out.println("====================");
        p.playGames();
    }
}
