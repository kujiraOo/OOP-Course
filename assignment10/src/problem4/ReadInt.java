// Modify your solution for the previous problem so
// that you define the method for doing the calculation
// so that it throws possible exceptions related to the
// calculation. In the main method call the method and
// take care of necessary exceptions.

package problem4;

public class ReadInt {


    public static void main(String[] args) {

        try {

            System.out.println(calculate(Integer.valueOf(args[0])));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Provide an integer parameter to the program");

        } catch (NumberFormatException e) {

            System.out.println("Wrong parameter, provide an integer as a parameter");

        } catch (ArithmeticException e) {

            System.out.println("Division by 0, try again");

        }
    }


    private static int calculate(int x) throws ArithmeticException {

        return (3 * x - 1) / x;

    }
}
