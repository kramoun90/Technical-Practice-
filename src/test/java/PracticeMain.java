import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PracticeMain {


    // prime number is divisible on 1 and the number its self only
    public static void main(String[] args) {
        int numberRange = 20;
        int numberToCheck = 2;
        int count = 0;
        List<Integer> primeNumbers = new ArrayList<Integer>();
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= numberToCheck / 2; i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
                count++;
            }
            if (count >= numberRange) {
                break;
            }
            numberToCheck++;
        }

        for (int numbers : primeNumbers) {
            System.out.println(numbers);
        }
    }
}
