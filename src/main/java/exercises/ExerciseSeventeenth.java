package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciseSeventeenth {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        sortArr(arr);
        printArr(arr);
    }
    public static void sortArr(int[] arr){
        Arrays.sort(arr);
    }

    public static void printArr(int[] arr){
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
