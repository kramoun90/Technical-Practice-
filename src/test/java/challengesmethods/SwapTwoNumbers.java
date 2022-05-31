package challengesmethods;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swapUsingPlusAndMinus();
        swapUsingMultiplicationAndDivision();
        swapUsingThirdVariables();
        swapUsingOneStatement();
    }

    public static void swapUsingPlusAndMinus() {
        // using + - operators
        int a = 5, b = 25;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a was  5| now is :" + a + "| ===== using + - operators");
        System.out.println(" b was 25| now is : " + b + "| ===== using + - operators");
    }

    public static void swapUsingMultiplicationAndDivision() {
        // use * / operators
        int a = 5, b = 25;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println(" a was  5| now is :" + a + "| ===== using * / operators");
        System.out.println(" b was 25| now is : " + b + "| ===== using * / operators");
    }

    public static void swapUsingThirdVariables() {
        // use third variable
        int a = 5, b = 25;
        int c = a;
        a = b;
        b = c;
        System.out.println(" a was  5| now is :" + a + "| ===== Using Third Variable ");
        System.out.println(" b was 25| now is : " + b + "| ===== Using Third Variable ");
    }

    public static void swapUsingOneStatement() {
        // Using One statement
        int a = 5, b = 25;
        b = a + b - (a = b);
        System.out.println(" a was  5| now is :" + a + "| ===== Using One statement ");
        System.out.println(" b was 25| now is : " + b + "| ===== Using One statement ");
    }
}
