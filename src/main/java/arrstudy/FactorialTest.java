package arrstudy;

public class FactorialTest {
    public static void main(String[] args){
        int sum= 0 ;
        int n= 10 ;
        for(int i=1;i<=n;i++){
            sum+=factorial(i);
        }
        System.out.println(sum);
    }

    private static int factorial(int n) {
        /**
        int res = 1;
        for(int i = 1;i<=n;i++){
            res*=i;
        }
        return res;
         **/
        int res = 1;
        if(n>1){
            res=n*factorial(n-1);
        }
        return res;
    }
}
