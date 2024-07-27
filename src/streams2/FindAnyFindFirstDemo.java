package streams2;

import java.util.Arrays;
import java.util.List;

public class FindAnyFindFirstDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("two mango","","one elephant","one orange","five apple");

        //System.out.println(list.stream().filter(s->s.length()>10).findFirst().get());
        System.out.println(list.stream().filter(s->s.length()>10).findAny().get());
    }
}
