package streams;

import java.util.*;
import java.util.stream.Collectors;

public class NameLengthCheckUsingFilter {
    public static void main(String[] args) {
        List<String> originalData= Arrays.asList("appu","shivaraj","raghavendra rajkumar","dharshan","sudeep");
        Set<String> modifedNumberList=new HashSet<String>();

       // modifedNumberList= originalData.stream().filter(s->s.length()>3 && s.length()<7).collect(Collectors.toSet());

        originalData.stream().filter(s->s.length()>3 && s.length()<7).forEach(System.out::print);
       // System.out.println(modifedNumberList);
    }
}
