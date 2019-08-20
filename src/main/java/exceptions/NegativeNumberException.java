package exceptions;

public class NegativeNumberException extends IllegalArgumentException {

    public NegativeNumberException(String message){ // you can pass in your own message
        super(message);
    }

    public NegativeNumberException(){ // or use the default message
        super("Zero or negative number is not valid");
    }

}