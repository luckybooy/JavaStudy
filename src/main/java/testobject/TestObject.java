package testobject;
class Student{
    String name;
    int age;
    String sNo;
    /*public String toString(){
        return "姓名:" + name + ",  年龄：" + age + ", 学号" + sNo;
    }*/
}


public class TestObject {
    public static  void main(String[] args){
        Student s = new Student();


        //获取对象的十进制的hashCode
        int shv = s.hashCode();
        System.out.println("十进制是:" + shv);
        //将十进制转换为十六进制
        String hvss = Integer.toHexString(shv);
        System.out.println("十六进制是:" + hvss);
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println("===========================");

        //这个是调用的Object的方法来获取类Object运行时的类
        Class c = s.getClass();
        System.out.println(c);
        String  cname = c.getName();
        System.out.println(cname);

    }
}
