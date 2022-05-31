package challengesmethods;

public class SumTwoIntegersWithoutUsingOperator {
    public static void main(String[] args) {
        int a = 20, b = 25;
        System.out.println(sumOfNumbers(a, b));
    }

    public static int sumOfNumbers(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;

        }
        return a;
    }

}
