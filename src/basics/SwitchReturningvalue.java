package basics;

import java.util.Scanner;

public class SwitchReturningvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        int input = sc.nextInt();
        //char input = sc.next().charAt(0);

        int val=switch(input)
        {
            case 1,2,3,4,5:
                yield 65;

            default:
                throw new IllegalStateException("Unexpected value: " + input);
        };
        System.out.println("Returned Value is: "+val);
    }
}
