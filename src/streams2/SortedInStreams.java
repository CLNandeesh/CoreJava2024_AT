package streams2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedInStreams {
    public static void main(String[] args) {

        System.out.println("****SORTED********");
        List<String> list= Arrays.asList("a","b","1","c","d","3");
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
