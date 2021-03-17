package SimpleAlgo;

public class Fibonacci {
    private static long fib_cache[] = new long[256];

    public static long fib(int n)
    {
        if(n<fib_cache.length && fib_cache[n]!=0)
            return fib_cache[n];

        long res;
        if(n <= 1)
            res = 1;
        else
            res = fib(n-2) + fib(n-1);

        if (n<fib_cache.length)
            fib_cache[n] = res;
        return res;
    }

}
