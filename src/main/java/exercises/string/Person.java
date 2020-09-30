package exercises.string;

public class Person {
    private String idCard;
    private String name;
    private int age;
    private int gender;

    public Person() {
    }

    public Person(String idCard, String name, int age, int gender) {
        this.idCard = idCard;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
