package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithStream {
    public static void main(String[] args) {
        List<String> originalData= Arrays.asList("appu","shivaraj","dharshan","sudeep");
        List<String> modifedData=new ArrayList<String>();

      modifedData=originalData.stream().map(s->s.toUpperCase()).collect(Collectors.toList());



        System.out.println(modifedData);

    }
}
