package predicates;
import java.util.function.*;

class Employee
{
    String name;
    double salary;
    int age;
    public Employee(String name,double salary,int age)
    {
        this.name=name;
        this.salary=salary;
        this.age=age;
    }
}
public class Predicate2 {

    public static void main(String[] args) {
        Employee e1=new Employee("Appu1",51000,26);
        Employee e2=new Employee("Appu2",70000,36);
        Employee e3=new Employee("Appu3",30000,46);

        Employee[] emp={e1,e2,e3};
        Predicate<Employee> pr=i->(i.salary>50000 && i.age>30);

        for(Employee e:emp)
        {
            if(pr.test(e))
            {
                System.out.println(e.name+" Salary is: "+e.salary+" and his age is: "+e.age);
            }
        }

    }
}
