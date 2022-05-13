package testmyself;

public class IsNumberPrime {
    public static void main( String[] args){
        int primeNumber = 31 ;
        boolean isPrime = true ;

        for (int i = 2 ; i <= primeNumber /2 ; i++){
            if(primeNumber % i == 0 ){
                isPrime = false ;
            }
        }
        if (isPrime) {
            System.out.println(isPrime + " " +primeNumber + " is prime number");
        }else {
            System.out.println(isPrime + " " + primeNumber + " is Not prime number");
        }
    }
}
