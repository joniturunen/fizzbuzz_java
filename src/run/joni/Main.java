package run.joni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Welcome to FizzBuzzer! " +
            "\nType numbers to see if they fizz or buzz. Type 0 to exit program.\n");

	while(true) {
        System.out.print("Number? ");
        int number = scn.nextInt();
        if (number == 0) {
            break;
        }

        Boolean fizz = ((number)%3 == 0);
        Boolean buzz = ((number)%5 == 0);

        if (fizz && buzz)
            System.out.println("FizzBuzz");
        else if (fizz)
            System.out.println("Fizz");
        else if (buzz)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
        System.out.println("Bye bye!");

    }
}
