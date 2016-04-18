// Modify your solution for the previous problem so that the program
// receives the number as an argument. The program must take care of
// all possible exceptions and print a user friendly message to the standard output device.

package problem2;

public class ReadInt {


    public static void main(String[] args) {

        try {

            System.out.println(calculate(Integer.valueOf(args[0])));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Provide an integer parameter to the program");

        } catch (NumberFormatException e) {

            System.out.println("Wrong parameter, provide an integer as a parameter");

        }
    }


    private static int calculate(int x) {

        try {

            return (3 * x - 1) / x;

        } catch (ArithmeticException e) {

            System.out.println("Division by 0, try again");

            return 0;
        }
    }
}
