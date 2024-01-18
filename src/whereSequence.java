
import java.util.Scanner;

public class whereSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its position in the NotFibonacci sequence: ");
        long inputNumber = scanner.nextLong();
        long position = whereSeq(inputNumber);

        System.out.println("Position in the NotFibonacci sequence: " + position);
    }

    public static long whereSeq(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        long first = 0;
        long second = 1;
        int i = 3;

        while (i <= n) {
            long current = (2 * second) + (3 * first);
            first = second;
            second = current;
            i++;
        }
        return second;
    }
}
