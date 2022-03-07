package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDivideBy2 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack, stack.size(), 0);
        System.out.println(stack);
    }

    static void deleteFirstHalf(Stack<Integer> stack, int n, int curr) {
        if (stack.empty() || curr == n) {
            return;
        }
        int x = stack.pop();
        deleteFirstHalf(stack, n, curr + 1);
        if (curr < n - Math.floor(n / 2)) {
            stack.push(x);
        }
    }
}
