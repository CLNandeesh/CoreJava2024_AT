package basics;

public class StringDemo {
    public static void main(String[] args) {
        String s1="Appu";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1.concat("raj");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1=s1.concat("raj");
        System.out.println(s1);
        System.out.println(s1.hashCode());



    }
}
