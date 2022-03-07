package stack;

import java.util.Scanner;
import java.util.*;


public class ReverseStack {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        for (int i = 0; i < data.length(); i++) {
            s.push(data.charAt(i));
        }
        char[] reverseString = new char[data.length()];
        int i = 0;
        while(!s.isEmpty()){
            reverseString[i++] = s.pop();
        }
        System.out.println(new String(reverseString));
        //write your code here

    }
}
