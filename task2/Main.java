package task2;

/**
 * Created by EE on 02.10.2017.
 */

public class Main {

    // encode/decode the string using Rot13 algorithm
    public static String rot13(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);

            if (c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M') {
                c += 13;
            }
            else if (c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z') {
                c -= 13;
            }

            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String string = args[0];
        System.out.println(string);

        string = rot13(string);
        System.out.println(string);

        string = rot13(string);
        System.out.println(string);
    }
}
