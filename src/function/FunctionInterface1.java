package function;

import java.util.function.Function;

public class FunctionInterface1 {
    public static void main(String[] args) {

        Function<Integer,Integer> f1=i->i*i;
        System.out.println(f1.apply(10));

        //String length
        Function<String,Integer> f2=s->s.length();
        System.out.println("Length is: "+f2.apply("Appu"));
    }
}
