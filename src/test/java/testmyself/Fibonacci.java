package testmyself;


public class Fibonacci {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int n =6;
         for(int i=0;i<=n;i++){
             System.out.print(fibonacci(i)+" ");
         }
    }
    public static long fibonacci(int n){
        if(n<=1)
            return n;

        return fibonacci(n-1)+fibonacci(n-2);

    }

}
