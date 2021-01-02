package il.co.migdal.ins.iterator.lambda;

import java.util.Iterator;
import java.util.List;


public class Squint {

    public List<Integer> run(int size) throws Exception {
        Integers integers = new Integers();
        Iterator iterator = integers.iterator();
        return take(size, squaresOf(iterator));
    }

    private Iterator<Integer> squaresOf(Iterator<Integer> it) {
        Mapper<Integer> mapper = new Mapper<>();
        return mapper.map(x -> x * x, it);
    }

    private List<Integer> take(int n, Iterator<Integer> it) {
        Taker<Integer> taker = new Taker<>();
        return taker.take(n, it);
    }

}

