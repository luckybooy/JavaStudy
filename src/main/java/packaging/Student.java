package packaging;

public class Student {
    private String sNo;
    private String name;
    private int age;
    /**
     * 定义性别的时候 不要用int类型,应为int有默认值‘0’,
     * 所以要用Integer,Integer的默认值是null
     */
    private Integer gender;
    public Student() {
    }

    public Student(String sNo, String name, int age, Integer gender) {
        this.sNo = sNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
