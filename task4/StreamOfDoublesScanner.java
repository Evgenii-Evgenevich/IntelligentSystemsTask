package task4;

/**
 * Created by EE on 03.10.2017.
 */

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class StreamOfDoublesScanner {

    private Scanner scanner = null;

    public StreamOfDoublesScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }
}
