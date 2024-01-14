public class notFibonacci {
    public static void main(String[] args){
        System.out.println("Input: 10");
        long[] result = notFib(10);
        for (long num : result) {
            System.out.println(num);
        }
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
