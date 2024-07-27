package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberListUsingFilter {
    public static void main(String[] args) {
        List<Integer> originalData=Arrays.asList(2,3,4,5,6,7,8,0);
        List<Integer> evenNumberList=new ArrayList<Integer>();

        //evenNumberList=originalData.stream().filter(n->n%2==0).collect(Collectors.toList());

//        System.out.println("ORIGINAL DATA");
//        System.out.println(originalData);
//        System.out.println("MODIFIED DATA");
//        System.out.println(evenNumberList);

        originalData.stream().filter(n->n%2==0).forEach(n-> System.out.println("Even No is: "+n));
        originalData.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
