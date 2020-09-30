package innerclass;
interface Teacher{
    public void teach();
}


class JavaTeacher implements Teacher{
    public void teach(){
        System.out.println("这是一个正常的实现接口的方法...");
    }
}

public class InnerClass {
    public static void main(String[] args){
        JavaTeacher jt = new JavaTeacher();
        jt.teach();

        /**
         * 匿名内部接口类
         */
        Teacher t = new Teacher(){
            public void teach(){
                System.out.println("这是一个内部接口实现类的方法");
            }
        };
        t.teach();
        System.out.println("================woshifengexiao=================");
        //匿名内部接口实现的第二种写法
        new Teacher(){
            public void teach(){
                System.out.println("这是实现匿名内部接口的第二种方法");
            }
        }.teach();
    }
}
