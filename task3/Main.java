package task3;

/**
 * Created by EE on 03.10.2017.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hexadecimal: \t");
        System.out.print("decimal:     \t" + Long.decode("0x" + scanner.nextLine()));
    }

}
