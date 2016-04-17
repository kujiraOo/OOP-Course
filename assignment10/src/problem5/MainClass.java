// Define your own Exception class called UnacceptedValueException.
// Use this exception so that you throw this exception if the value
// of x is e.g. less than 0.

package problem5;

public class MainClass {


    public static void main(String[] args) {

        try {

            System.out.println(calculate(Integer.valueOf(args[0])));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Provide an integer parameter to the program");

        } catch (NumberFormatException e) {

            System.out.println("Wrong parameter, provide an integer as a parameter");

        } catch (ArithmeticException e) {

            System.out.println("Division by 0, try again");

        } catch (UnacceptedValueException e) {

            System.out.println("Parameter must be greater than 0");

        }
    }


    private static int calculate(int x) throws ArithmeticException, UnacceptedValueException {

        if (x < 0) throw new UnacceptedValueException("Parameter must be greater than 0");

        return (3 * x - 1) / x;
    }
}
