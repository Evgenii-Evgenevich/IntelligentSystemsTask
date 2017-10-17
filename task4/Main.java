/**
 * Created by EE on 03.10.2017.
 */

package task4;

import java.util.PrimitiveIterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    DoubleStream doubleStreamScanner(Scanner scanner) {
        PrimitiveIterator.OfDouble iterator = new PrimitiveIterator.OfDouble() {
            @Override
            public double nextDouble() {
                return scanner.nextDouble();
            }

            @Override
            public boolean hasNext() {
                while (!scanner.hasNextDouble() && scanner.hasNext()) {
                    scanner.next();
                }

                return scanner.hasNextDouble();
            }
        };

        return StreamSupport.doubleStream(
                Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED | Spliterator.NONNULL),
                false);
    }

    IntStream integerStreamScanner(Scanner scanner) {
        PrimitiveIterator.OfInt iterator = new PrimitiveIterator.OfInt() {
            @Override
            public int nextInt() {
                return scanner.nextInt();
            }

            @Override
            public boolean hasNext() {
                while (!scanner.hasNextInt() && scanner.hasNext()) {
                    scanner.next();
                }

                return scanner.hasNextInt();
            }
        };

        return StreamSupport.intStream(
                Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED | Spliterator.NONNULL),
                false);
    }

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
            IntStream stream = streamOfIntegersScanner.stream();
            stream.limit(5).forEach(System.out::println);
        }

        // test StreamOfLinesScanner
        if (false)
        {
            streamOfLinesScanner = new StreamOfLinesScanner(System.in);
            Stream<String> stream = streamOfLinesScanner.stream();
            stream.limit(5).forEach(System.out::println);
        }

        // test StreamOfWordsScanner
        if (true)
        {
            streamOfWordsScanner = new StreamOfWordsScanner(System.in);
            Stream<String> stream = streamOfWordsScanner.stream();
            stream.limit(5).forEach(System.out::println);
        }
    }
}
