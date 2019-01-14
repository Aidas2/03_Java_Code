package lt.vtvpmc.greeting;

public class GreeterExclamationMarkDecorator implements Greeter {

    private Greeter original;

    public GreeterExclamationMarkDecorator (Greeter greeter) {
        this.original = greeter;
    }

    @Override
    public String greet(String firstName, String lastName) {
        //add exclamation mark
        return original.greet(firstName, lastName) + " !";
    }
}
