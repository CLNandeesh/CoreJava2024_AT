package streams;

import java.util.Arrays;
import java.util.List;

public class MapWithFiletrWithStream {
    public static void main(String[] args) {
        List<String> originalData= Arrays.asList("appu","shivaraj","dharshan","sudeep");

        originalData.stream().map(s->s.length()).filter(s->s<5).forEach(System.out::println);
    }
}
