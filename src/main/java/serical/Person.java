package serical;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiaoran
 * @program JavaStudy
 * @package serical
 * @description 创建一个Persion类
 * @date 2020-05-02 17:00:20
 */
public class Person implements Serializable {

    /**
     *   如果一个类提供serialVersionUID,那么,这个类序列化后
     *  ,如果类发生再变化,那么这个类仍可以被反序列化
     */
    private static final long serialVersionUID = -7328642241769720776L;
    private  String name;
    private int age;
    private Date birth;
    private String addStr;

    public Person(String name, int age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                '}';
    }
}
