package getMethod;

public class Test {
    private int id;

    private  String name;

    private  String password;


    public void  getId(){
        return ;
    }

    public void setId(int id){
        this.id=id;
    }





    public static void main (String args []){

        Test tt=new Test();
        tt.setId(66);
        System.out.println(tt.id);

        tt.getId();
        System.out.println("id 的值为：" + tt.id);
    }
}
