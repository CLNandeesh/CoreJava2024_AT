package function;

import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    double salary;
    int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}

public class FunctionInterface2 {

    public static void main(String[] args) {
        //Takes sal and exp, calculate bonus and give it
        Employee e1 = new Employee("Appu1", 51000, 46);

        Function<Employee, Integer> f1 = e ->
        {
            int age = e.age;
            double salary = e.salary;
            if (age > 20 && age <= 30) {
                 return  200;
            } else if (age > 30) {
                return 600;
            } else {
                return 100;
            }
        };
        System.out.println("Bonus is: "+f1.apply(e1));

        Predicate<Integer> p=i->i>500;
        if(p.test(f1.apply(e1)))
        {
            System.out.println("Employee of the Month");
        }
        else
        {
            System.out.println("Not Eligible");
        }

    }
}
