/**
 * Created by EE on 03.10.2017.
 */

package task3;

import java.util.Scanner;

public class Main {

    // convert an input hexadecimal string into its equivalent decimal number
    public static long hexadecimalToDecimal(String hexadecimal) {
        long decimal = 0;

        for (int i = 0; i < hexadecimal.length(); ++i) {
            decimal *= 16;

            char c = hexadecimal.charAt(i);

            if (c >= 'a' && c <= 'f') {
                decimal += c - 'a' + 10;
            }
            else if (c >= 'A' && c <= 'F') {
                decimal += c - 'A' + 10;
            }
            else if (c >= '1' && c <= '9') {
                decimal += c - '0';
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hexadecimal: \t");

        String hexadecimal = scanner.nextLine();

        System.out.print("decimal:     \t" + hexadecimalToDecimal(hexadecimal));

        System.out.print("decimal:     \t" + Long.decode("0x" + hexadecimal));
    }
}
