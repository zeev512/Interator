package il.co.migdal.ins.iterator.lambda;

import java.util.Iterator;
import java.util.function.Function;

public class Mapper<T> {
    public Iterator<T> map(Function<T, T> func, Iterator<T> it) {
        return new Iterator<T>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            public T next() {
                return func.apply(it.next());
            }

        };
    }
}

