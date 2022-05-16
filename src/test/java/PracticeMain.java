import java.util.ArrayList;
import java.util.List;

public class PracticeMain {
    // retrieve the first range of prime numbers

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<Integer>();
        int numbers = 2;
        int Limit = 10;
        int count = 0;

        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= numbers / 2; i++) {
                if (numbers % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numbers);
                count++;
            }
            if (count >= Limit) {
                break;
            }
            numbers++;
        }
        for (int number : primeNumbers) {
            System.out.println(number + " ");
        }
    }
}
