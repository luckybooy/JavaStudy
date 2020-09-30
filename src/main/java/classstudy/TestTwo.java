package classstudy;

class Vehical{
    int speed;
    double size;

    public  void setSpeed(int speed){
        speed = speed;
    }

    public  void speedUp(int sp){
        speed+=sp;
        System.out.println(speed);
    }

    public  void speedDown(int sp){
        speed-=sp;
        System.out.println(speed);
    }

    public  void move(){

    }
}

public class TestTwo {
    public static void main(String[] args){
        Vehical vehical = new Vehical();
        //vehical.setSpeed(4);
        int carSpeed = vehical.speed = 10;
        double carV = vehical.size = 22;
        System.out.println(carSpeed);
        System.out.println(carV);
        vehical.speedDown(4);
        vehical.speedUp(200);
    }
}
