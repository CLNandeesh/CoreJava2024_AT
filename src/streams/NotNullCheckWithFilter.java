package streams;

import java.util.Arrays;
import java.util.List;

public class NotNullCheckWithFilter {
    public static void main(String[] args) {
        List<String> originalData= Arrays.asList("appu","shivaraj",null,"dharshan",null,"sudeep");
        originalData.stream().filter(s->s!=null).forEach(s-> System.out.println(s));
    }
}
