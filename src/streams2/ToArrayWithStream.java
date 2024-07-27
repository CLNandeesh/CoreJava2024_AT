package streams2;

import java.util.Arrays;
import java.util.List;

public class ToArrayWithStream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","1","c","d","3");
        Object arr[]=list.stream().toArray();
        System.out.println(arr);
        System.out.println(arr.length);

    }
}
