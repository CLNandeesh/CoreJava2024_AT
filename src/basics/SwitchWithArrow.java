package basics;

import java.util.Scanner;

public class SwitchWithArrow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 3");
        int num = sc.nextInt();

        switch (num) {
            case 1, 4, 5->System.out.println("ONE");
            case 2->System.out.println("ONE");
            case 3->System.out.println("ONE");
            default->System.out.println("INVALID DATA");

        }
    }
}
