import java.util.Scanner;

public class PalindromeCheckerApp {

    static boolean isPalindrome(String word){

        String cleaned = word.replaceAll(" ", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = sc.nextLine();

        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}