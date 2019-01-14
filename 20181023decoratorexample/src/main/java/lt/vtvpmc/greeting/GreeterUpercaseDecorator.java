package lt.vtvpmc.greeting;

public class GreeterUpercaseDecorator implements Greeter {

    private Greeter original;

    public GreeterUpercaseDecorator (Greeter greeter) {
        this.original = greeter;
    }

    @Override
    public String greet(String firstName, String lastName) {
        // String.toUpperCase;
        return original.greet(firstName, lastName).toUpperCase();

    }
}
