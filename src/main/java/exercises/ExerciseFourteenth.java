package exercises;

abstract class Role{
    private String name;
    private int age;
    private char sex;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 默认构造器
     */
    public Role(){}

    /**
     * 定义一个带有一个参数的构造器
     * @param name
     */
    public Role(String name){
        this.name = name;
    }

    /**
     * 定义一个带有两个参数的构造器
     * @param name
     * @param age
     */
    public Role(String name,int age){
        this.name = name;
        this.age = age;
    }

    /**
     * 定义一个带有三个参数的构造器
     * @param name
     * @param age
     * @param sex
     */
    public Role(String name,int age,char sex){
        this(name, age);
        this.sex = sex;
    }

    public abstract void play();
}

class Employee extends Role{
    private double sclary;
    public void setSclary(double sclary){
        this.sclary = sclary;
    }
    public double getSclary(){
        return sclary;
    }
    public static  int id;
    public Employee(){}
    public Employee(double sclary){
        this.sclary = sclary;
    }
    public Employee(String name ,int age,char sex,double sclary){
        super(name,age,sex);
        this.sclary = sclary;
    }


    public void play(){
        System.out.println( "Do you like playing basketball ?");
    }

    public  final  void sing(){
        System.out.println("好好唱歌");
    }

    public void info(){
        System.out.println("员工编号： " + id + " 姓名:" + getName() + " 年龄:" + getAge() + " 性别:" + getSex() + " 薪水:" + sclary);
    }
}

class Manager extends Employee{
    public  final String vehicle;
    public Manager(String name,int age,char sex,double sclary,String vehicle){
        super(name, age, sex, sclary);
        this.vehicle = vehicle;
    }
    public void info(){
        System.out.println("员工编号： " + id + " 姓名:" + getName() + " 年龄:" + getAge() + " 性别:" + getSex() + " 薪水:" + getSclary() + " 座驾:" + vehicle);
    }
}


public class ExerciseFourteenth {
    public static void main(String[] args){
        Employee ep =new Employee("徐佳琪",23,'女',8000);
        ep.id ++;
        ep.info();

        Manager m = new Manager("虞书欣",22,'女',8888.88,"灰机");
        ep.id ++;
        m.info();
    }
}
