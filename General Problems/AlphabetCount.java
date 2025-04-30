import java.util.Scanner;

public class AlphabetCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                continue;
            } else {
                consonants++;
            }
        }
        System.out.println("vowels : " + vowels + "\nconsonants " + consonants);
    }
}
