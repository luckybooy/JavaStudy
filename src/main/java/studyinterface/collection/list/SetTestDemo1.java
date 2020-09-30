package studyinterface.collection.list;

import java.util.ArrayList;
import java.util.List;

public class SetTestDemo1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p = new Person("梦阳",25);
        Person p1 = new Person("师倩",25);
        list.add(p);
        list.add(p1);
        System.out.println(list);

        System.out.println("-------分割线-------");
        List<Student> listStu = new ArrayList<>();
        Student s1 = new Student("狗蛋儿",19,1);
        Student s2 = new Student("翠萍",18,2);
        Student s3 = new Student("沁色",20,3);
        listStu.add(s1);
        listStu.add(s2);
        listStu.add(s3);
        System.out.println("学生的结合:" + listStu);
        System.out.println("-------分割线-------");
        list.addAll(listStu);
        System.out.println(list);
    }
}
