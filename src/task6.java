/**
 * Calculates the power of a given number to an integer exponent using recursion.
 * @param a The base number.
 * @param n The exponent.
 * @return The result of raising 'a' to the power of 'n'.
 * If n is 0, return 1 (anything raised to the power of 0 is 1
 * // Compute a^(n/2) recursively
 * If n is even, return temp * temp
 * If n is odd, return temp * temp * a
 * Print the result
 */

import java.util.Scanner;

public class Power {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = power(a, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        }
        else {
            return temp * temp * a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double result = power(a, n);
        System.out.println(result);

        scanner.close();
    }
}
