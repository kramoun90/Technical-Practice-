package challengesmethods;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber_Range {
    public static void main(String[] args) {

//     in this method is to find all prime numbers in range of e.g. 100
        int number = 20;
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for (int NumberToCheck = 2; NumberToCheck <= number; NumberToCheck++) {
            boolean isPrime = true;
            for (int factor  = 2; factor <= NumberToCheck/2; factor++) {
                if (NumberToCheck % factor == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(NumberToCheck);
            }
        }
        for (int numbers : primeNumbers) {
            System.out.println(numbers);
        }
    }


//    public static void main(String[] args) {
//        // this methode ias to fine the first prime numbers ___ example find the first 50 prime it doesn't matter what range
//        Scanner scan = new Scanner(System.in);
//        int limit =  scan.nextInt();
//        int count = 0;
//       int numberToCheck = 2;
//        List<Integer> primeNumbers = new ArrayList<Integer>();
//
//       while (true) {
//            boolean isPrime = true;
//            for (int factor  = 2; factor <= numberToCheck/2; factor++) {
//                if (numberToCheck % factor == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                primeNumbers.add(numberToCheck);
//                count++;
//            }
//            if (count >= limit){
//                break;
//            }
//           numberToCheck++;
//        }
//        for(int numbers : primeNumbers) {
//            System.out.println(numbers);
//        }
//    }
}
