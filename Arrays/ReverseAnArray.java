import java.util.Scanner;

public class ReverseAnArray {
    public static void reverseLoop(int[] arr) {

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        System.out.println("Enter array of elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array : ");
        printArray(arr);
        System.out.print("\nReverse Array : ");
        reverseLoop(arr);
        printArray(arr);
    }

}
