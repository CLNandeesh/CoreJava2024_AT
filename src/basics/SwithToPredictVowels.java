package basics;

import java.util.Scanner;

public class SwithToPredictVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char input = sc.next().charAt(0);

        switch (input) {
            case 'a','e','i','o','u'->System.out.println("VOWELS");
            default->System.out.println("NOT A VOWELS");
        }
    }
}
