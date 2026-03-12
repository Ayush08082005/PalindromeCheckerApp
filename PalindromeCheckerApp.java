import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}