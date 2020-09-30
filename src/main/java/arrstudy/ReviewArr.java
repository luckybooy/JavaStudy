package arrstudy;

public class ReviewArr {
    public  static  void main(String[] args){
        int[] arr = {11,22,55,44,77,33,99,101};
        int[] arr1 = {12,54,65,90,45};
        int[] arr2 = mergeArr(arr,arr1);
        printArr(arr2);
        System.out.println();
        sortArr(arr2);
        printArr(arr2);
    }

    /**
     * 数组合并
     * @param arr
     * @param arr1
     * @return
     */

    public static  int[]  mergeArr(int[] arr,int[] arr1){
        int[] arr2 = new int[arr.length + arr1.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i]=arr[i];
        }
        for(int j = 0; j < arr1.length ; j++){
            arr2[arr.length + j] = arr1[j];
        }
        return arr2;
    }

    /**
     *打印数组
     */
    public  static  void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 冒泡排序
     * @param arr
     */

    public static void sortArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
