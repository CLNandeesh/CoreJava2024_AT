package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountMinMaxInStreamDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 0);

        System.out.println("*****COUNT************");
        long evenCount = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println("Even no count is: "+evenCount);

        System.out.println("*****MIN************");
        Optional<Integer> min = list.stream().min((val1, val2) ->
        {
            return val1.compareTo(val2);
        });
        System.out.println("Min value is: "+min.get());

        System.out.println("*****MAX************");
        Optional<Integer> max = list.stream().max((val1, val2) ->
        {
            return val1.compareTo(val2);
        });
        System.out.println("Max value is: "+max.get());
    }
}
