package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighest {
    public static void thirdHighest(int[] arr) {
        int firstHighest = -1, secondHighest = -1, thirdHigh = -1;
        Arrays.sort(arr);
        int len = arr.length;
        firstHighest = arr[len - 1];
        try{
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] != firstHighest) {
                secondHighest = arr[i];

                if (arr[i - 1] != secondHighest) {
                    thirdHigh = arr[i-1];
                    break;
                }
            }
        }
    }catch(Exception e){
        System.out.println("Third highest not found!");
        thirdHigh = -1;
    }
        System.out.println("First Highest is : " + firstHighest);
        System.out.println("Second Highest is : " + secondHighest);
        System.out.println("Third Highest is : " + thirdHigh);
    }

    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        thirdHighest(arr);
    }
}
