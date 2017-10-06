/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.io.InputStream;
import java.util.Scanner;
import java.text.BreakIterator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfWordsScanner {

    private Scanner scanner = null;
    private BreakIterator wordFinder = null;
    private String currentLine = null;

    public StreamOfWordsScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
        this.wordFinder = BreakIterator.getWordInstance();
        this.currentLine = "";
    }

    private Supplier<String> supplier = () -> {
        while (currentLine.length() == 0) {
            this.currentLine = this.scanner.nextLine();
        }

        // find word
        this.wordFinder.setText(this.currentLine);
        int start = this.wordFinder.first();
        int end = this.wordFinder.next();

        // get word from line
        String returnValue = this.currentLine.substring(start, end);

        if (end != this.currentLine.length()) {
            ++end;
        }

        // substring line
        this.currentLine = this.currentLine.substring(end);

        return returnValue;
    };

    public Stream<String> stream() {
        return Stream.generate(this.supplier);
    }
}
