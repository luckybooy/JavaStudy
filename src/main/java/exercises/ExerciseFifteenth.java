package exercises;

/**
 * 考察方法的重载
 */
class Addation{

    public int add(int a,int b){
        return a + b;
    }
    public double add(double a,double b){
        return a + b;
    }

}
public class ExerciseFifteenth {
    public static void main(String[] args){
        Addation addation = new Addation();
        int sum = addation.add(3,5);
        System.out.println("两数之和为:" + sum);
        double sum1 = addation.add(3.4,5.5);
        System.out.println("两数之和为:" + sum1);
    }
}
