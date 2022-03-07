package stack;

import java.util.*;

public class StackPalandrom {

    public void checkPalindrome(String input) {
        Queue queue = new LinkedList();

        for (int i = input.length() - 1; i >= 0; i--) {
            queue.add(input.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (input.equals(reverseString))
            System.out.println("The given input is a palindrome.");
        else
            System.out.println("The given input is not a palindrome.");

    }
    //Write your code here

    public static void main(String[] args) {
        StackPalandrom obj = new StackPalandrom();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        obj.checkPalindrome(inputString);

    }
}
