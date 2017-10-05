package task7;

/**
 * Created by EE on 04.10.2017.
 */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = args[0];
        int numLines = Integer.parseInt(args[1]);

        List<String> linesList = new ArrayList<String>(numLines);

        File file = new File(filename);
        long length = file.length();

        RandomAccessFile raf = new RandomAccessFile(filename, "r");

        while (numLines != 0) {
            --numLines;

            long i = (long)(Math.random() * length);

            raf.seek(i);

            while (i != 0 && raf.read() != '\n') {
                --i;

                raf.seek(i);
            }

            linesList.add(raf.readLine());
        }

        raf.close();

        linesList.forEach(System.out::println);
    }
}
