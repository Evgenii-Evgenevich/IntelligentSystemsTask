package task1;

/**
 * Created by EE on 02.10.2017.
 */



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

    // Euclid’s algorithm with a rem function that produces the mathematical (non-negative) remainder
    public static int gcdRem(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = Math.abs(a % b);
            }
            else {
                b = Math.abs(b % a);
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
