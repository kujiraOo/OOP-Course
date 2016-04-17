package problem5;


public class UnacceptedValueException extends Exception {
    String type;

    public UnacceptedValueException (String msg) {
        type = msg;
    }

    @Override
    public String toString() {
        return "UnacceptedValueException [" + type + "]";
    }
}
