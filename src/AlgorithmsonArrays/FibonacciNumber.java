package AlgorithmsonArrays;

public class FibonacciNumber {

    static int fibonacciNumber(int n)
    {
        int[] f = new int[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i<=n ; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int fib = 9;
        int output = fibonacciNumber(fib);
        System.out.println("The fibonacci series of "+fib+ " is " +output);
    }
}
