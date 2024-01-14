
import java.util.Scanner;

public class whereSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its position in the NotFibonacci sequence: ");
        int inputNumber = scanner.nextInt();
        int position = whereSeq(inputNumber);

        System.out.println("Position in the NotFibonacci sequence: " + position);
    }

    public static int whereSeq(int n){
        long[] hello = notFib(1000);
        for (int i = 0; i < hello.length; i++){
            if (n == hello[i]){
                return i+1;
            }
            else if (n < hello[i]){
                return i;
            }
        }
        return 0;
    }

    public static long[] notFib(int n){
        long[] hello = new long[n];
        hello[0] = 0;
        hello[1] = 1;

        for (int i = 2; i < n; i++){
            hello[i] = (2*hello[i-1]) + (3*hello[i-2]);
        }
        return hello;
    }

}
