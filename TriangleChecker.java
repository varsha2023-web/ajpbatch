package lab02;

import java.util.*;

public class TriangleChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three side lengths: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");

            if (a == b && b == c) {
                System.out.println("Type: Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }

            
            double max = Math.max(a, Math.max(b, c));

            double x, y;

            if (max == a) {
                x = b;
                y = c;
            } else if (max == b) {
                x = a;
                y = c;
            } else {
                x = a;
                y = b;
            }

            if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(max, 2)) {
                System.out.println("It is a Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}