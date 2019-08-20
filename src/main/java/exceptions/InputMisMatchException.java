package exceptions;

import java.util.InputMismatchException;

public class InputMisMatchException extends InputMismatchException {

    public InputMisMatchException(String message){ // you can pass in your own message
        super(message);
    }

    public InputMisMatchException(){ // or use the default message
        super("You have entered a non numeric field value");
    }

}

