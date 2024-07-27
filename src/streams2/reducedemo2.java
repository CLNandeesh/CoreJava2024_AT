package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reducedemo2 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> reducedResult=list.stream().reduce((value, combinedvalue)->
        {
            return value+combinedvalue;
        });

        System.out.println("Final Combined Result is: "+reducedResult.get());
    }
    }

