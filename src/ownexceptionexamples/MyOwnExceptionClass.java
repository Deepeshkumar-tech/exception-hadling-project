package ownexceptionexamples;

public class MyOwnExceptionClass extends Exception{

    public MyOwnExceptionClass() {
    }

    public MyOwnExceptionClass(String message) {
        super(message);
    }
}
