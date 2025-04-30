import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr)
            arrSum += num;
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Missing Number: " + findMissingNumber(arr, n + 1));
        sc.close();
    }
}
