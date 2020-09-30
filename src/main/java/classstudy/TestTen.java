package classstudy;

class WuMingFen{
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen(){

    }

    public WuMingFen(String theMa){
        this.theMa = theMa;
    }

    public WuMingFen(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        /*this.theMa = theMa;
        this.quantity = quantity;*/
        this(theMa,quantity);
        this.likeSoup = likeSoup;
    }

    public void check(){
        System.out.println("食材:" + theMa + "    质量:" + quantity + "      是否带汤:" + likeSoup);
    }

}


public class TestTen {
    public static void main(String[] args){
        WuMingFen wmf = new WuMingFen("牛肉",3,true);
        System.out.println(wmf.likeSoup);
        System.out.println(wmf.theMa);
        System.out.println(wmf.quantity);
        wmf.check();
        WuMingFen wmf1 = new WuMingFen("牛肉",2);
        System.out.println(wmf1.theMa);
        System.out.println(wmf1.quantity);
        System.out.println(wmf1.likeSoup);
        wmf1.check();
        WuMingFen wmf2 = new WuMingFen();
        wmf2.theMa = "酸辣";
        wmf2.quantity = 4;
        wmf2.likeSoup = true;
        wmf2.check();
    }
}
