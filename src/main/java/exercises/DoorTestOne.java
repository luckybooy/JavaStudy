package exercises;

/**
 * 定义一个接口
 */
interface Door{
    public void openDoor();
    public void closeDoor();
}

/**
 * 定义一个抽象类
 */
abstract class AbsDoor implements Door{
    String brand;
    double price;
    public abstract void lockDoor();
    public void windProof(){
        System.out.println("这扇门具有防风的功能...");
    }
}

/**
 * 继承这个抽象类
 */
class ThiefProof extends AbsDoor{

    public void closeDoor(){
        System.out.println("轻轻地把门关严实");
    }
    public void openDoor(){
        System.out.println("轻轻地把门关推开");
    }
    public void lockDoor(){
        System.out.println("需要将这扇门锁上20道");
    }
    public void thief(){
        System.out.println("这是一个防盗门");
    }
}


public class DoorTestOne{
    public static void  main(String[] args){
        ThiefProof tf = new ThiefProof();
        tf.brand = "甜甜的";
        tf.closeDoor();
        tf.lockDoor();
        tf.windProof();
        tf.openDoor();
        tf.thief();
    }
}