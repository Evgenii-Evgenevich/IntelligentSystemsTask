/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfLinesScanner {

    private Scanner scanner = null;

    public StreamOfLinesScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    private Supplier<String> supplier = () -> {
        return this.scanner.hasNextLine() ? this.scanner.nextLine() : null;
    };

    public Stream<String> stream() {
        return Stream.generate(this.supplier).filter(string -> string != null);
    }
}
