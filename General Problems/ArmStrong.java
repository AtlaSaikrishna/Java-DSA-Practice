import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(), arm =0, count =String.valueOf(n).length(), number = n, b=n;
        // while(n>0){
        //     count++;
        //     n = n/10;            
        // }

        while(b>0){
           // int rem = 0,add =1;
           int rem= b % 10;
            // for(int i=0;i<count;i++){
            //     add *= rem;
            // }
            // arm =arm + add;
            arm += Math.pow(rem, count);
            //System.out.println(arm);
            b=b/10;
        }
       System.out.println( number == arm ? "Armstrong" : "Not armstrong");
    }
}
