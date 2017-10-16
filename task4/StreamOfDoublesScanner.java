/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;

public class StreamOfDoublesScanner {

    private Scanner scanner = null;

    public StreamOfDoublesScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    private DoubleSupplier supplier = () -> {
        while (!this.scanner.hasNextDouble() && this.scanner.hasNext()) {
            this.scanner.next();
        }

        if (this.scanner.hasNextDouble()) {
            return this.scanner.nextDouble();
        }
        else {
            return 0d;
        }
    };

    public DoubleStream stream() {
        return DoubleStream.generate(this.supplier);
    }
}
