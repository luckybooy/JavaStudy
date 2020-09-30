package classstudy;

public class TestDog {
    /**
     * 姓名
     */
    String name;
    /**
     * 性别
     */
    int gender;
    /**
     * 体重
     */
    double weight;
    /**
     * 品种
     */
    String type;

    /**
     * 定义一个犬吠的方法
     * @param name
     */
    public void bark( String name){
        System.out.println(name + "在呼唤你...");
    }


    public static  void main(String[] args){
        TestDog dog = new TestDog();
        dog.name = "旺仔";
        dog.gender = 1;
        dog.type = "警犬";
        dog.weight = 23.45;
        System.out.println(dog.name);
        System.out.println(dog.gender);
        System.out.println(dog.type);
        System.out.println(dog.weight);
        dog.bark(dog.name);
    }


}

