package exercises;


import java.util.Arrays;

public class ExerciseSixteenth {
    public static void main(String[] args){
        int[] arr = {15,5,23,53,5,86,98,28,35,64,80};
        sortArr(arr);
        printArr(arr);
        /*String res = Arrays.toString(arr);
        System.out.println("原始数组：   " + res);
        Arrays.sort(arr);
        String res1 = Arrays.toString(arr);
        System.out.println("排序后的数组:" + res1);*/

        int index = Arrays.binarySearch(arr,86);
        System.out.println(index);

        Arrays.sort(arr,0,arr.length);
        for (int i = 0;i < arr.length; i ++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void sortArr(int[] arr){
        /**
         * 使用Arrays接口给数组升序排列
         */
        Arrays.sort(arr);
    }

    public  static void printArr(int[] arr){
        /**
         * 使用Arrays接口将数组转换为字符转
         */
        String resArr = Arrays.toString(arr);
        System.out.println(resArr);
    }
}
