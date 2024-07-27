package lambda;

@FunctionalInterface
interface Cab2
{
    public  void bookCab(String source,String destination);
}

public class Lambda2 {

    public static void main(String[] args) {
        Cab2 cab=(so,des)->System.out.println("Ola Cab is BOOKED from "+so+" to "+des);
        cab.bookCab("Mysore","Bangalore");
    }
}
