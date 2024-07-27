package streams2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("two mango","","one elephant","one orange","five apple");

        //boolean status=list.stream().anyMatch(s->s.startsWith("one"));
        //boolean status=list.stream().anyMatch(s->s.endsWith("one"));
        boolean status=list.stream().anyMatch(s->s.contains("one"));
        System.out.println("Result is: "+status);
    }
}
