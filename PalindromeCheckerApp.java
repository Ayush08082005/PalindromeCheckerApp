public class PalindromeCheckerApp {

    static boolean isPalindrome(String word){

        String reversed = new StringBuilder(word).reverse().toString();

        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        if(isPalindrome(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}