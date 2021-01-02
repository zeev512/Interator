package il.co.migdal.ins.iterator.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Taker<T> {
    public List<T> take(int n, Iterator<T> it) {
        List<T> taken = new ArrayList<T>();
        for ( int i = 0; it.hasNext() && i < n; i++ )
            taken.add(it.next());
        return taken;
    }

}
