package lt.vtvpmc.greeting;

public class GreeterImpl implements Greeter {

    @Override
    public String greet(String firstName, String lastName) {
        return "Sveikas gyvas " + firstName + " " + lastName;
    }
}

