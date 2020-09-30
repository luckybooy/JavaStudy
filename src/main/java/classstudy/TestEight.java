package classstudy;


class Rect{
    double width;
    double height;

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public Rect(){
        /**
         * 默认构造器可以初始化属性值   初始化时一定不要再在前边加数据类型
         */
         width = 23.4;
         height = 30.8;
    }

    public Rect(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double calEara(){
        return  width * height;
    }

    public double calPerimeter(){
         return  (this.width + height) * 2;
    }
}


public class TestEight {
    public static void main(String[] args){
        Rect r = new Rect(12.3,24.6);
        r.calEara();
        r.calPerimeter();

        Rect r1 = new Rect();
       /* r1.setWidth(10.4);
        r1.setHeight(20.2);*/
       // r1.calPerimeter();
        double eara1 = r1.calEara();
        double perimeter1 = r1.calPerimeter();
        System.out.println(eara1);
        System.out.println(perimeter1);
    }
}
