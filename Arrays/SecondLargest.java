package Arrays.General;
import java.util.*;
class SecondLargest{
    public static void seclargest(int arr[]){
            Arrays.sort(arr);
            for(int j=arr.length-1;j>=0;j--){
                  if(arr[j]!=arr[j-1]){
                    System.out.println(arr[j-1]+" is the second Largest Element");
                    break;
                  }
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array of elements :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        seclargest(arr);
    }
}
