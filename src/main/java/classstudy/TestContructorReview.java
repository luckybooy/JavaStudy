package classstudy;

class PersonTwo{
    private String name;
    private int age;

    public void display(){
        System.out.println("姓名:" + name + ",年龄:" + age);
    }


    public PersonTwo(String name,int age){
        this.name = name;
        this.age = age;
    }


}

public class TestContructorReview {
    public static void main(String[] args){
        PersonTwo pt = new PersonTwo("张三",24);
        pt.display();
    }
}
