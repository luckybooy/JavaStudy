package demo;

public class Student {
    private String name;
    private int age;
    private int sNo;

    public Student() {
    }

    public Student(String name, int age, int sNo) {
        this.name = name;
        this.age = age;
        this.sNo = sNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sNo=" + sNo +
                '}';
    }
}
