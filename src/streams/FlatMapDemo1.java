package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);

        List<List<Integer>> list4 = Arrays.asList(list1, list2, list3);


       // List<Integer> list5 = list4.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
      //  System.out.println(list5);
        List<Integer> list5 = list4.stream().flatMap(x -> x.stream().map(y->y+100)).collect(Collectors.toList());
        System.out.println(list5);


    }
}
