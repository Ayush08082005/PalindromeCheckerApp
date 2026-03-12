public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "nurses run";

        text = text.replaceAll(" ", "");

        String reversed = new StringBuilder(text).reverse().toString();

        if(text.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}