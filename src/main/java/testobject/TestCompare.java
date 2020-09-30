package testobject;
class  Teacher{
    String name;
    int age;
    int sNo;

    /**
     * 重写equals方法
     * 如果两个学生的学号sNo,姓名name,年龄age都相等,则我们就断定是同一个学生
     * @param obj
     * @return
     */
    public boolean equals(Object obj){
        boolean flag = false;
        //判断传过来的对象是不是 Teacher 类的实例
        if (obj instanceof Teacher){
            //将传过来的父类（obj）对象强制转换为子类(Student)
            Teacher s = (Teacher) obj;
            if (this.sNo == s.sNo && this.age == s.age && this.name != null && s.name != null && this.name.equals(s.name)){
                flag = true;
            }
        }
        return flag;
    }


}

/**
 * equal 和"==" 的比较
 * 基本数据类型比较——> 值
 * 引用数据类型比较——> 引用
 */
public class TestCompare {
    public static void   main(String[] args){
        int a = 10;
        int b = 10;
        Teacher t = new Teacher();
        Teacher t1 = new Teacher();
        System.out.println(a == b);
        System.out.println(t == t1);


        t.name = "萧然";
        t.sNo = 100;
        t.age = 24;
        t1.name = "萧然";
        t1.sNo = 100;
        t1.age = 24;
        System.out.println(t.equals(t1));
    }
}
