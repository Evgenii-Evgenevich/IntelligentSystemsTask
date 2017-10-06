/**
 * Created by EE on 05.10.2017.
 */

package task8;

public class MyRandom {
    private long a;
    private long c;
    private long m;

    public MyRandom(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    // get xi
    // next = (a * prev + c) % m
    public long getNext(long prev) {
        return (this.a * prev + this.c) % this.m;
    }
}
