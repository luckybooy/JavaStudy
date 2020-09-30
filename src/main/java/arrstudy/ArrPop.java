package arrstudy;

public class ArrPop {
    public static void main(String[] args){
        int[] arr = {20,18,33,48,70,54};
        int[] arrRe = {22,36,31,45,98,72};


        arrPop(arr);
        System.out.println("原始数组为:" +"\n"+ "22   36    31    45  98   72" );
        reverseArr(arrRe);
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

        for(int i = 0 ;i<arrRe.length;i++){
            System.out.print(arrRe[i] + "\t");
        }
    }

    //冒泡排序算法
    public static void  arrPop(int[] arr){
        if(arr.length != 0 && arr != null){
            //外层比较的轮数  轮数=数组的长度-1
            for (int i = 0; i < arr.length-1;i++){
                //相邻两个数的比较   比较的次数=数组的长度 - 第几轮 - 1
                for (int j = 0; j < arr.length - i -1;j++){
                    if(arr[j+1] > arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }

    //数组倒置
    public static void reverseArr(int[] arr){
        //1,5,6,9,21,45,98——>98,45,21,9,6,5,1
        for(int i = 0; i < arr.length/2; i++){
            //中间数后边的数 = arr[arr.length-i-1]
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
    }
}
