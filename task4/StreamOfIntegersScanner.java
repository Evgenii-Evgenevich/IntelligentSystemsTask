/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class StreamOfIntegersScanner {

    private Scanner scanner = null;

    public StreamOfIntegersScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    private IntSupplier supplier = () -> {
        return this.scanner.nextInt();
    };

    public IntStream stream() {
        return IntStream.generate(this.supplier);
    }
}
