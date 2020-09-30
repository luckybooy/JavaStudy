package classstudy;

public class TestGirl {
    public static void main(String[] args){
        Girl girl = new Girl();

       /* girl.name = "李萍";
        girl.age = 18;
        girl.tel = "17718819900";*/
        girl.introduce();
    }
}

class Girl{
   private String name;
   private int age;
   private String tel;
    /**
     * 封装的概念：
     *     对每一个私有的属性提供一对公用的(public)set和get方法来供外界访问我们的私有属性
     */



    /**
     * 提供了一个公用的设置属性的方法
     * @param myName
     */
   public void setName(String myName){
       name = myName;
   }

    /**
     * 提供了一个公用的获取属性的方法
     * @return
     */
   public String getName(){
       return  name;
   }

   public void setAge(int myAge){
       age = myAge;
   }

   public int getAge(){
       return age;
   }

   public void setTel(String myTel){
       tel = myTel;
   }

   public String getTel(){
       return tel;
   }


    /**
     * 共用的方法可以被其他的类来访问,这个方法有属于Girl这个类,所以可以访问私有属性
     * 我们可以在其他类中通过调用这个共用的方法来间接的访问Girl里边的私有属性
     */
    public void introduce(){
        System.out.println("My name is "+ name + "," + "I am " + age + "years old " + "," + "and my telphoneNo is " + tel );
    }
}