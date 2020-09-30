package review;

class Vehicles {
    String brand;
    String color;

    public Vehicles(){

    }
    public Vehicles(String brand,String color){
        this.brand = brand;
        this.color = color;
    }
    public void run(){
        System.out.println("我已经开动了...");
    }
    public void showInfo(){
        System.out.println("商标是:" + brand + ",颜色是" + color);
    }
}

class Car extends Vehicles{
    int seats;
    public Car(String brand,String color,int seats){
        /*this.brand = brand;
        this.color = color;*/
        super(brand,color);
        this.seats = seats;
    }
    public void showCar(){
        System.out.println("这是一个" + seats + "座位的车," + " 品牌是：" + brand + ",颜色是:" + color);
    }
}

class Truck extends Vehicles{
    float load = 20;
    public Truck(String brand,String color,float load){
        /*this.brand = brand;
        this.color = color;*/
        super(brand,color);
        this.load = load;
    }
    public void showTruck(){
        System.out.println("品牌" + brand + " 颜色" + color + "载重:" + load);
    }
}


public class Test{
    public static void main(String[] args){
        Vehicles v = new Vehicles();
        v.brand = "劳斯莱斯幻影";
        v.color = "霸气灰";
        v.run();
        v.showInfo();
        Car car = new Car("BMW","黑色",7);
        car.showCar();
        Truck truck = new Truck("EDM","yellow",23.5f);
        truck.showTruck();
    }
}
