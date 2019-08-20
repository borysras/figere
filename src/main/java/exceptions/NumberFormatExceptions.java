package exceptions;

public class NumberFormatExceptions extends java.lang.NumberFormatException {

    public NumberFormatExceptions(String message){ // you can pass in your own message
        super(message);
    }

    public NumberFormatExceptions(){ // or use the default message
        super("maximum number of figures 2");
    }
}
