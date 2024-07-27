package streams2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class TerminalStreamFunctionDemo1 {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("bus","car","van","bus","van");

        System.out.println("********FOREACH********");
        list.stream().forEach(System.out::println);

        System.out.println("********DISTINCT********");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("******COUNT**********");
        long c=list.stream().distinct().count();
        System.out.println("Distinct Count is: "+c);

        System.out.println("******LIMIT**********");
        list.stream().limit(2).forEach(System.out::println);
        List set=list.stream().limit(4).collect(Collectors.toList());
        System.out.println("Size is: "+set.size());


    }
}
