package classstudy;

class MyTime{
    /**
     * 小时
     */
   private int hour;
    /**
     * 分钟
     */
    private int minute;
    /**
     * 秒钟
     */
    private int second;

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return  hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public void addHour(int hou){
        this.hour+=hou;

        this.hour %= 24;
    }

    public void subHour(int hou){
        this.hour-=hou;
        if (hour <= 0){
            hour = 0;
        }
    }

    public void addMinute(int min){
        this.minute+=min;
        this.minute %= 60;
    }

    public void subMinute(int min){
        this.minute-=min;
        if (minute <= 0){
            minute = 0;
        }
    }

    public void addSecond(int sec){
        this.second+=sec;
        this.second %= 60;
    }

    public void subSecond(int sec){
        this.second-=sec;
        if (second <= 0){
            second = 0;
        }
    }


    public void display(){
        System.out.println("时间为:" + hour + "时" + minute + "分" + second + "秒");
    }

}

public class TestTime {
    public static  void main(String[] args){
        MyTime myTime = new MyTime();
        myTime.setHour(23);
        myTime.setMinute(58);
        myTime.setSecond(36);
        myTime.display();
        myTime.addHour(2);
        myTime.addMinute(21);
        myTime.addSecond(30);
        myTime.display();
        myTime.subHour(3);
        myTime.subMinute(20);
        myTime.subSecond(7);
        myTime.display();
        myTime.addHour(100);
        myTime.addMinute(100);
        myTime.addSecond(100);
        myTime.display();


    }

}
