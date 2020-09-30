package classstudy;

class MyMath{
    static double Pi = 3.14;
    public static int add( int a,int b){
       return a + b;
    }

    public static double calArea(int r){
        return  Pi * r * r;
    }


}

public class TestNine {
    public static void main(String[] args){
        double area = MyMath.calArea(10);
        System.out.println("圆的面积为:" + area);
    }
}
