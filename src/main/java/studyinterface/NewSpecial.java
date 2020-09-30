package studyinterface;
interface Newsp{
    /**
     * 在接口中定义一个静态方法
     */
    public static  void printArr(int[] arr){
        for (int i = 0;i < arr.length; i++)
            //在方法体只有一句的时候可以省略花括号
            System.out.print(arr[i] + "\t");
    }
}


public class NewSpecial {
    public static void main(String[] args){
       Newsp.printArr(new int[]{3,5,6,7,1,21,9,18});
    }
}
