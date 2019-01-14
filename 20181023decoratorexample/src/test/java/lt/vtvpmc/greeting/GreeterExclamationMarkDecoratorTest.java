package lt.vtvpmc.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterExclamationMarkDecoratorTest {

    @Test
    public void shouldReturnWithExclamationMark() {
        Greeter exclamtionGreeter = new GreeterExclamationMarkDecorator(new GreeterImpl());
        String firstName = "Aidas";
        String lastName = "Pupelis";

        assertEquals("Sveikas gyvas Aidas Pupelis !", exclamtionGreeter.greet(firstName, lastName));

    }

}