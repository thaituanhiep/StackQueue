package binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int numberDecimal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Decimal number: ");
        numberDecimal = scanner.nextInt();
        Stack stack = new Stack();
        while (numberDecimal > 0) {
            stack.push(numberDecimal % 2);
            numberDecimal /= 2;
        }
        String binaryNumber = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            binaryNumber += ("" + stack.pop());
        }
        System.out.println(binaryNumber);
    }
}
