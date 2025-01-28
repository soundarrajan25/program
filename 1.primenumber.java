import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Prompt user for an integer
			System.out.print("Enter an integer: ");
			int number = scanner.nextInt();

			System.out.println("Prime numbers up to " + number + ":");

			// Loop through numbers from 2 to the entered number
			for (int i = 2; i <= number; i++) {
			    if (isPrime(i)) {
			        System.out.print(i + " ");
			    }
			}
		}
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
