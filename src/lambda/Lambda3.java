package lambda;

@FunctionalInterface
interface Cab3
{
    public  int bookCab(String source,String destination);
}

public class Lambda3 {
    public static void main(String[] args) {
        Cab3 cab=(so,des)->
        {
            System.out.println("Ola Cab is BOOKED from "+so+" to "+des);
             return 100;
        };
       int price= cab.bookCab("Mysore","Bangalore");
        System.out.println("Price is: "+price);
    }
}
