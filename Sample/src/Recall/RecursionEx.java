package Recall;

public class RecursionEx {

    public static long[] fibonacciCache;

    public static void display(int n) {
        if (n < 1) {
            return;
        }
        display(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {

        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthTerm = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciCache[n] = nthTerm;
        return nthTerm;

    }


    public static void main(String[] args) {

//        display(5);
//        int res = fact(5);
//        System.out.printf("5! = " + res);

        int n = 6;
        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

}
