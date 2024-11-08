import java.util.Scanner;

public class FactorialDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            int digitSum = calculateDigitSum(factorial);

            System.out.println("Factorial of " + number + " is: " + factorial);
            System.out.println("Sum of digits of the factorial: " + digitSum);
        }

        scanner.close();
    }

    public static long calculateFactorial(int n) 
    {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateDigitSum(long number) {
        int sum = 0;
        while (number > 0) {
            int digit = (int) (number % 10);
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

