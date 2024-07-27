package streams;

import java.util.ArrayList;
import java.util.List;

class Products
{
    String name;
    int price;
    int exp;

    Products(String name,int price,int exp)
    {
        this.name=name;
        this.price=price;
        this.exp=exp;
    }
}
public class ObjectProcessingUsingFilter {
    public static void main(String[] args) {
        Products p1=new Products("MysoreSandal",50,2023);
        Products p2=new Products("Lux",30,2026);
        Products p3=new Products("Colgate",40,2020);
        Products p4=new Products("Vim",10,2025);

        List<Products> prod=new ArrayList<Products>();
        prod.add(p1);
        prod.add(p2);
        prod.add(p3);
        prod.add(p4);

        prod.stream().filter(p->p.exp>=2024).forEach(p-> System.out.println("Product "+p.name+" price is: "+p.price));

    }
}
