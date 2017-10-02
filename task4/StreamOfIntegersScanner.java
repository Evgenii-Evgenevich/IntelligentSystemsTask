package task4;

/**
 * Created by EE on 03.10.2017.
 */

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamOfIntegersScanner {

    private Scanner scanner = null;

    public StreamOfIntegersScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }
}
