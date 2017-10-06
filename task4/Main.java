/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        StreamOfDoublesScanner streamOfDoublesScanner = null;
        StreamOfIntegersScanner streamOfIntegersScanner = null;
        StreamOfLinesScanner streamOfLinesScanner = null;
        StreamOfWordsScanner streamOfWordsScanner = null;

        // test StreamOfDoublesScanner
        if (false)
        {
            streamOfDoublesScanner = new StreamOfDoublesScanner(System.in);
            DoubleStream stream = streamOfDoublesScanner.stream();
            stream.limit(5).forEach(System.out::println);
        }

        // test StreamOfIntegersScanner
        if (false)
        {
            streamOfIntegersScanner = new StreamOfIntegersScanner(System.in);
            IntStream stream = streamOfIntegersScanner.stream();;
            stream.limit(5).forEach(System.out::println);
        }

        // test StreamOfLinesScanner
        if (false)
        {
            streamOfLinesScanner = new StreamOfLinesScanner(System.in);
            Stream<String> stream = streamOfLinesScanner.stream();;
            stream.limit(5).forEach(System.out::println);
        }

        // test StreamOfWordsScanner
        if (true)
        {
            streamOfWordsScanner = new StreamOfWordsScanner(System.in);
            Stream<String> stream = streamOfWordsScanner.stream();;
            stream.limit(5).forEach(System.out::println);
        }
    }
}
