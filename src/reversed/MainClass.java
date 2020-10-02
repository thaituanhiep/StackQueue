package reversed;

import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        String mWord = "Lorem Ipsum is simply dummy text";
        String[] words = mWord.split(" ");
        String newWord = "";
        Stack stackWord = new Stack();
        for (int i = 0; i < words.length; i++) {
            stackWord.push(words[i]);
        }
        for (int j = 0; j < words.length; j++) {
            newWord += (stackWord.pop() + " ");
        }
        System.out.println(newWord);
    }
}
