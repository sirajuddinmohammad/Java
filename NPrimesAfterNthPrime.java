import java.util.Scanner;

public class NPrimesAfterNthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int nthPrime = findNthPrime(n);
        printNPrimes(n, nthPrime);

        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    private static int findNthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) if (isPrime(++num)) count++;
        return num;
    }

    private static void printNPrimes(int n, int startPrime) {
        System.out.println("The first " + n + " prime numbers after the " + startPrime + "th prime number are:");
        for (int count = 0, num = startPrime + 1; count < n; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
        }
    }
}
