package classstudy;

class Number{
    private int n1;

    private int n2;

    /**
     * 下边这个是构造器
     */
    public Number(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }


    /*
    这是封装

    public int getN1(){
        return n1;
    }

    public void setN1(int n1){
        this.n1 = n1;
    }

    public int getN2(){
        return n2;
    }

    public void setN2(int n2){
        this.n2 = n2;
    }*/

   /*
    public void addition(int n1,int n2){
        int res = n1 + n2;
        System.out.println("两数之和为:" + res);
    }

    public void subtration(int n1,int n2){
        int res = n1 - n2;

        System.out.println("两数之差为:" + res);
    }

    public void multiplication(int n1,int n2){
        int res = n1 * n2;
        System.out.println("两数之积为:" + res);
    }

    public void division(int n1, int n2){
        if (n1 == 0 || n2 == 0){
            return;
        }
        int res = n1 / n2;
        System.out.println("两数之商为:" + res);
    }*/

   public int addition(){
       return n1 + n2;
   }

    public int multiplication(){
        return n1 * n2;
    }

    public int subtration(){
        return n1 - n2;
    }

    public int division(){
        return n1 / n2;
    }


    public void display() {
        System.out.println("n1的值为:" + n1 + ",n2的值为:" + n2);
    }

}

public class TestCal {
    public static void main(String[] args){
        Number number= new Number(12,34);
        /*
        number.setN1(56);
        number.setN2(8);
        int n1 = number.getN1();
        int n2 = number.getN2();
        number.display();
        number.addition(n1,n2);

        number.multiplication(n1,n2);
        number.subtration(n1,n2);
        number.division(n1,n2);
        */
        int add = number.addition();
        System.out.println("加法结果为:" + add);
        int sub = number.subtration();
        System.out.println("减法结果为:" + sub);
        int mul = number.multiplication();
        System.out.println("乘法结果为:" + mul);
        int div = number.division();
        System.out.println("除法结果为:" + div);
    }


}
