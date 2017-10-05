package task9;

/**
 * Created by EE on 05.10.2017.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Spliterator<T> firstSpliterator = first.spliterator();
        Spliterator<T> secondSpliterator = second.spliterator();
        Spliterator<T> spliterator = null;

        Iterator<T> firstIterator = Spliterators.iterator(firstSpliterator);
        Iterator<T> secondIterator = Spliterators.iterator(secondSpliterator);
        Iterator<T> iterator = new Iterator<T>() {
            boolean nowfirst = true;

            @Override
            public boolean hasNext() {
                return (firstIterator.hasNext() || !this.nowfirst) && secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (this.nowfirst) {
                    this.nowfirst = false;
                    return firstIterator.next();
                }
                this.nowfirst = true;
                return secondIterator.next();
            }
        };

        int characteristics = firstSpliterator.characteristics() & secondSpliterator.characteristics()
                &  ~(Spliterator.DISTINCT | Spliterator.SORTED | Spliterator.SIZED);

        spliterator = Spliterators.spliteratorUnknownSize(iterator, characteristics);

        boolean isParallel = first.isParallel() || second.isParallel();

        return StreamSupport.stream(spliterator, isParallel);
    }

    public static void main(String[] args) {
        List<Float> firstList = new ArrayList<Float>();

        firstList.add(0.1f);
        firstList.add(0.2f);
        firstList.add(0.3f);
        firstList.add(0.5f);
        firstList.add(0.7f);
        firstList.add(1.1f);

        List<Float> secondList = new ArrayList<Float>();

        secondList.add(0.2f);
        secondList.add(0.4f);
        secondList.add(0.8f);
        secondList.add(1.6f);
        secondList.add(3.2f);
        secondList.add(6.4f);

        Stream<Float> stream = zip(firstList.stream(), secondList.stream());

        System.out.println(stream.map(f -> f.toString()).collect(Collectors.joining(", \t")));
    }
}
