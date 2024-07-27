package predicates;

import java.util.function.Predicate;

public class Predicate3 {
    public static void main(String[] args) {
        int arr[]={2,44,33,11,24,56,44,34,78,12,3,0};

        Predicate<Integer> p1=i->(i%2==0);
        Predicate<Integer> p2=j->j>30;

        for(int x:arr)
        {
            if(p1.and(p2).test(x))
            {
                System.out.println(x + " is even and greater than 30");
            }
        }
    }
}
