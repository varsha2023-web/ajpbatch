package lab05;

import java.util.ArrayList;

public class PrimeOperations {

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Find primes in a range
    public static ArrayList<Integer> primesInRange(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Prime factorization
    public static ArrayList<Integer> primeFactorization(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("isPrime(17): " + isPrime(17));
        System.out.println("isPrime(4): " + isPrime(4));

        System.out.println("primesInRange(1, 20): " + primesInRange(1, 20));

        System.out.println("primeFactorization(12): " + primeFactorization(12));
        System.out.println("primeFactorization(100): " + primeFactorization(100));
    }
}