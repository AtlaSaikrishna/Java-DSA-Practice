import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int org=n,reverse=0;
          while(n > 0){
                int rem = n%10;
                reverse = reverse * 10 + rem ;
                n /= 10;
          }
           return reverse==org;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "Palindrome" : "Not Palindrome");
        sc.close();

    }
}
