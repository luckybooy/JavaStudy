package studyinterface;

/**
 * 定义一个求面积和周长的接口
 */
interface Cal{
    public static final double PI = 3.14;
    public double getArea();
    public double getPerimeter();
}

/**
 * 计算圆的面积和周长
 */
class CalCircle implements Cal{
    double r;
    public CalCircle(double r){
        this.r = r;
    }
    public double getArea(){
       return Cal.PI * r *r;
    }

    public double getPerimeter(){
        return 2 * Cal.PI * r;
    }
}

/**
 * 计算正方形的面积和周长
 */
class Square implements Cal{
    double r;
    public Square(double r){
        this.r = r;
    }
    public double getArea() {
        return r*r;
    }
    public double getPerimeter(){
        return 4 * r;
    }
}

/**
 * 计算平行四边形的面积和周长
 */
class Parellelogram implements Cal{
    double bottom ;
    double height;
    double wide;
    public Parellelogram(double bottom,double height,double wide){
        this.bottom = bottom;
        this.height = height;
        this.wide = wide;
    }


    public double getArea(){
        return bottom * height;
    }
    public double getPerimeter(){
        return 2 * (wide + bottom);
    }
}

public class calMethod {
    public static void main(String[] args){
        CalCircle c = new CalCircle(10);
        double cArea = c.getArea();
        double cLong = c.getPerimeter();
        System.out.println("圆的面积:" + cArea +",  圆的周长为:" + cLong);

        Square s = new Square(5);
        double sArea = s.getArea();
        double sPerimeter = s.getPerimeter();
        System.out.println("正方形的面积:" + sArea + ",   正方形的周长为:" + sPerimeter  );

        Parellelogram parellelogram = new Parellelogram(3.0,2.5,4);
        double pArea = parellelogram.getArea();
        double pLong = parellelogram.getPerimeter();
        System.out.println("平行四边形的面积:" + pArea + ",     平行四边形的周长:" + pLong);
    }
}
