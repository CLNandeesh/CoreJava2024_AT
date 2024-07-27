package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reducedemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","1","c","d","3");
       Optional<String> reducedResult=list.stream().reduce((value, combinedvalue)->
        {
           return value+combinedvalue;
        });

        System.out.println("Final Combined Result is: "+reducedResult.get());
    }
}
