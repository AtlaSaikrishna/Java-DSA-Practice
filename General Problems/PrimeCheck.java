package TcsNqt.part1;

import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n){
        if( n < 2){
            return false;
        }
        if( n== 2){
            return true;
        }
        for( int i=2; i<n ; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
        
    }
}
