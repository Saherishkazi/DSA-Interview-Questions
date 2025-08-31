import java.util.*;

public class Fibonacci {
    public static int fibo(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fib0 = 0;
        int fib1 = 1;
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fib = fnm1 + fnm2;
        return fib;
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(fibo(n));
    }
    
}

