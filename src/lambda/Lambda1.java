package lambda;

@FunctionalInterface
interface Cab
{
    public  void bookCab();
}
public class Lambda1 {
    public static void main(String[] args) {
        Cab cab=()->System.out.println("Ola Cab is BOOKED");
        cab.bookCab();
    }

}
