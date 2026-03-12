public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "Madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}