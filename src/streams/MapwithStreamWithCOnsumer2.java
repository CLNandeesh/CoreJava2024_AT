package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MapwithStreamWithCOnsumer2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5);
        list.stream().map(n->n*5).forEach(System.out::println);
    }
}
