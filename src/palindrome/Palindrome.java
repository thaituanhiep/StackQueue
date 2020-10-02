package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String words;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a string: ");
        words = scanner.nextLine();
        char[] arr = words.toCharArray();
        int length = arr.length;
        Stack stack = new Stack();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            stack.push(arr[i]);
            queue.offer(arr[i]);
        }

        boolean isPalindrome = true;
        for (int j = 0; j < length; j++) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }
}
