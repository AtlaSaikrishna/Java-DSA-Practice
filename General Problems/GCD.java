package TcsNqt.part1;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        return b==0 ? a : gcd(b, a % b);

    }
    public static int findGcdOf3(int a, int b, int c){
            return gcd(gcd(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c=sc.nextInt();
        System.out.println("GCD: " + findGcdOf3(a, b,c));
        sc.close();

    }
}
