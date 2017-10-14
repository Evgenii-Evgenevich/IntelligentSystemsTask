/**
 * Created by EE on 02.10.2017.
 */

package task1;

public class Main {

    // Euclid’s algorithm with %
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        return a | b;
    }

    // Euclid’s algorithm with floorMod
    public static int gcdFloorMod(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = Math.floorMod(a, b);
            }
            else {
                b = Math.floorMod(b, a);
            }
        }
        return a | b;
    }

    // produce the mathematical (non-negative) remainder
    public static int remainder(int a, int b) {
        if (b < 0) {
            return remainder(a, -b);
        }
        if (a < 0) {
            return remainder(-a, b);
        }
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    // Euclid’s algorithm with a rem function
    public static int gcdRem(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = remainder(a, b);
            }
            else {
                b = remainder(b, a);
            }
        }
        return a | b;
    }

    public static void main(String[] args) {
        int a = 44;
        int b = 121;

        System.out.println("positive values:              " + a + ", " + b);
        System.out.println("gcd         \t" + gcd(a, b));
        System.out.println("gcdFloorMod \t" + gcdFloorMod(a, b));
        System.out.println("gcdRem      \t" + gcdRem(a, b));

        System.out.println("\nnegative and positive values: " + (-a) + ", " + b);
        System.out.println("gcd         \t" + gcd(-a, b));
        System.out.println("gcdFloorMod \t" + gcdFloorMod(-a, b));
        System.out.println("gcdRem      \t" + gcdRem(-a, b));

        System.out.println("\npositive and negative values: " + a + ", " + (-b));
        System.out.println("gcd         \t" + gcd(a, -b));
        System.out.println("gcdFloorMod \t" + gcdFloorMod(a, -b));
        System.out.println("gcdRem      \t" + gcdRem(a, -b));

        System.out.println("\nnegative values:              " + (-a) + ", " + (-b));
        System.out.println("gcd         \t" + gcd(-a, -b));
        System.out.println("gcdFloorMod \t" + gcdFloorMod(-a, -b));
        System.out.println("gcdRem      \t" + gcdRem(-a, -b));
    }
}
