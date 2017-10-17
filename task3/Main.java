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
            char c = hexadecimal.charAt(i);

            if (c >= 'a' && c <= 'f') {
                decimal <<= 4;
                decimal |= c - 'a' + 10;
            }
            else if (c >= 'A' && c <= 'F') {
                decimal <<= 4;
                decimal |= c - 'A' + 10;
            }
            else if (c >= '1' && c <= '9') {
                decimal <<= 4;
                decimal |= c - '0';
            }
            else if (c == '0') {
                decimal <<= 4;
            }
            else {
                break;
            }
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hexadecimal: \t");

        String hexadecimal = scanner.nextLine();

        System.out.println("decimal:     \t" + hexadecimalToDecimal(hexadecimal));

        // System.out.println("decimal:     \t" + Long.decode("0x" + hexadecimal));
    }
}
