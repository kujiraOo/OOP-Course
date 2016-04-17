// A program which reads an integer number (x) from the keyboard
// and calculates the value of y in the following formula: y=(3*x-1)/(x).
// The program must take care of all possible exceptions.

package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(calculate(inputInt()));

    }

    private static int inputInt() {

        System.out.println("Enter an integer");

        try {

            return sc.nextInt();

        } catch (InputMismatchException e) {

            // clean buffer
            sc.nextLine();

            return inputInt();
        }
    }

    private static int calculate(int x) {

        try {

            return (3 * x - 1) / x;

        } catch (ArithmeticException e) {

            System.out.println("Division by 0, try again");

            return calculate(inputInt());
        }
    }
}
