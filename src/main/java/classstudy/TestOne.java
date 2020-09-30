package classstudy;

class A{
    int V = 100;

}

public class TestOne {
    public static void main(String[] args){
        int Guess = 100;
        A a =new A();
        int VValue = a.V;
        if (Guess > VValue){
            System.out.println("Bigger");
        }else if (Guess == VValue){
            System.out.println("Right");
        }else if(Guess < VValue) {
            System.out.println("Smaller");
        }else{
            System.out.println("啥也不是");
        }
    }
}
