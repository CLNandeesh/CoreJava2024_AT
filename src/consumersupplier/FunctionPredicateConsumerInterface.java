package consumersupplier;

import java.util.function.Consumer;
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


public class FunctionPredicateConsumerInterface {
    public static void main(String[] args) {

        Employee e1 = new Employee("Appu1", 51000, 26);
        Employee e2 = new Employee("Appu2", 70000, 36);
        Employee e3 = new Employee("Appu3", 30000, 46);

        Employee[] emp = {e1, e2, e3};

        for (Employee x : emp) {
            Function<Employee, Integer> f = e ->
            {
                if (e.age < 30) {
                    return 400;
                } else {
                    return 1000;
                }
            };
            Predicate<Integer> p = b -> b >= 500;
            Consumer<Boolean> c = s -> {
                System.out.println(s);
            };

            c.accept(p.test(f.apply(x)));
        }

    }
}
