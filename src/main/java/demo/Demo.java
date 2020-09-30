package demo;

public class Demo {
    public static void main(String[] args) {
        Object[] objs = new Object[6];
        Student s = new Student("张三",24,1001);
        Student s1 = new Student("李四",26,1002);
        objs[0] = s;
        objs[1] = s1;
        
        Teacher t = new Teacher(2000,"李刚","砸缸");
        Teacher t1 = new Teacher(2001,"武松","打虎");
        objs[2] = t;
        objs[3] = t1;

        SchoolMaster sm = new SchoolMaster("王大赖","三中","高中");
        SchoolMaster sm1 = new SchoolMaster("张水亭","二中","初中");
        objs[4] = sm;
        objs[5] = sm1;
        for (int i = 0; i < objs.length; i++) {
            Object obj = objs[i];
            /**
             * 判断对象实例
             * 将传过来的对象强制转换为目标对象
             */
            if(obj instanceof Student) {
                Student st = (Student) obj;
                System.out.println(st);
            }
            if(obj instanceof Teacher){
                Teacher th = (Teacher) obj;
                System.out.println(th);
            }
            if(obj instanceof SchoolMaster){
                SchoolMaster sm3 = (SchoolMaster)obj;
                System.out.println(sm3);
            }
        }
    }
}
