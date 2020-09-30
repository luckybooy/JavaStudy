package fatherandsontranslate;


interface  PersonFour{
    public void song();
}

class StudentFour implements PersonFour{
    String name ;
    int age;
    public void song(){
        System.out.println(name + " 在唱歌...");
    }
    public void playBall(){
        System.out.println(name + " 正在帅气的踢足球...");
    }
}

public class TestTranslateInterFace {
    public static void main(String[] args){
        StudentFour sf = new StudentFour();
        sf.name = "xiaoran";
        //sf.song();
        /**
         * 将子类转换为父类
         */
        PersonFour pf = sf;
        pf.song();

        /**
         * 将父类强制转换为子类
         */
        StudentFour sf1 = (StudentFour)pf;
        sf1.song();
        sf1.playBall();

    }
}
