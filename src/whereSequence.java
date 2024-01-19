
import java.util.Scanner;

public class whereSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its position in the NotFibonacci sequence: ");
        long inputNumber = scanner.nextLong();
        long position = whereSeq(inputNumber);

        System.out.println("Position in the NotFibonacci sequence: " + position);
    }

    public static int whereSeq(long n) {
        long first = 0;
        long second = 1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        long current = (2 * second) + (3 * first);
        int i = 2;

        while (current < n) {
            current = (2 * second) + (3 * first);
            first = second;
            second = current;
            i++;
        }
        if(current == n){
            return i;
        }
        return i-1;
    }

}
