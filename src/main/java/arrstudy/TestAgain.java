package arrstudy;



public class TestAgain {

    public static void sort(int[] arr){
        //冒泡排序回顾
        for (int i = 0;i < arr.length; i++){
            for(int j = 0; j < arr.length - i -1;j++){
                if(arr[j+1] > arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args){
        int[] arrT = {10,23,34,52,26,74,92,89};

        sort(arrT);
        for (int i = 0; i< arrT.length; i++){
            System.out.print(arrT[i] + "\t");
        }
    }
}