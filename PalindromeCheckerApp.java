public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String[] words = {"madam","hello","level","java"};

        for(String word : words){

            String reversed = new StringBuilder(word).reverse().toString();

            if(word.equals(reversed)){
                System.out.println(word + " is Palindrome");
            }else{
                System.out.println(word + " is Not Palindrome");
            }
        }
    }
}