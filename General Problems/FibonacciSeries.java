import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        System.out.print("Enter number of terms to print : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci series : ");
        for( int i=0; i<num; i++){
            System.out.print(a+" ");
            int temp = a+b;
            a=b;
            b=temp;
        }

    }
}
