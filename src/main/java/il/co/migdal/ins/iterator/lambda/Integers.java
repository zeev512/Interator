package il.co.migdal.ins.iterator.lambda;

import java.util.Iterator;

public class Integers implements Iterable<Integer> {

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    public static class IntIterator implements Iterator {
        private int i = 0;
        public boolean hasNext() {
            return true;
        }

        public Integer next() {
            // return i++;
            return i = i + 1;
        }

    }

}
