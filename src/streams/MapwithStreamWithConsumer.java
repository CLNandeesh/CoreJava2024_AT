package streams;

import java.util.Arrays;
import java.util.List;

public class MapwithStreamWithConsumer {
    public static void main(String[] args) {
        List<String> originalData= Arrays.asList("appu","shivaraj","dharshan","sudeep");

        originalData.stream().map(s->s.length()).forEach(s->System.out.println(s));
    }
}
