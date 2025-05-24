package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsContainCharacter {

     public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++) {
            if(words[i].indexOf(x) != -1){
                al.add(i);
            }
        }
        System.out.print("Charecter "+x+" is present at index in the list of words : ");
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many strings do you want to enter? : ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] words = new String[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter string "+(i+1)+" :");
            words[i] = sc.nextLine();
        }
        System.out.print("Enter Character to check if it is present in how many strigs ? : ");
        char ch = sc.next().charAt(0);
        System.out.println(findWordsContaining(words,ch));
        
    }
}
