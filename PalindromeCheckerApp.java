import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";
        Queue<Character> queue = new LinkedList<>();

        for(char c : word.toCharArray()){
            queue.add(c);
        }

        String forward = "";
        while(!queue.isEmpty()){
            forward += queue.remove();
        }

        String reverse = new StringBuilder(forward).reverse().toString();

        if(forward.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}