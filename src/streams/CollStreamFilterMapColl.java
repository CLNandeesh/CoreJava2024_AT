package streams;

import java.util.ArrayList;
import java.util.List;

class Employee
{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class CollStreamFilterMapColl {
    public static void main(String[] args) {
        Employee e1=new Employee("Appu1",20000);
        Employee e2=new Employee("Appu2",90000);
        Employee e3=new Employee("Appu3",10000);
        Employee e4=new Employee("Appu4",50000);
        Employee e5=new Employee("Appu5",40000);

        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("FILTER");
        list.stream().filter(s->s.salary>25000).forEach(s-> System.out.println(s.name+" "+s.salary));
        System.out.println("MAP");
        list.stream().map(s->s.salary=s.salary+5000).forEach(m-> System.out.println(m));
        System.out.println("FILTER MAP");
        list.stream().filter(s->s.salary>25000).map(s->s.salary=s.salary+5000).forEach(s-> System.out.println(s));

    }
}
