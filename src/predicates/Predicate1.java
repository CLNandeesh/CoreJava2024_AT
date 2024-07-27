package predicates;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {

        //To check number is greater than 10 using Lambda exp and Predicate Interface
        Predicate<Integer> p= i->(i>10);
        System.out.println("Result is: "+p.test(100));
        System.out.println("Result is: "+p.test(2));

        System.out.println("****************************");

        //To check length of string is greater than 4 using Lambda exp and Predicate Interface
        Predicate<String> p2= str->(str.length()>4);
        System.out.println("Result is: "+p2.test("Appu"));
        System.out.println("Result is: "+p2.test("Shivaraj"));

        System.out.println("****************************");

        //Print Array element whose length is greater than 4
        String names[]={"appu","punith rajkumar","shivaraj"};
        for(String name:names)
        {
              if(p2.test(name))
              {
                  System.out.println(name);
              }
        }
    }
}
