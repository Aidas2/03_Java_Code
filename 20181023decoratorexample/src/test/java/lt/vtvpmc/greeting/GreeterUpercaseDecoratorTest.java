package lt.vtvpmc.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterUpercaseDecoratorTest {

    @Test
    public void shouldReturnUpperLettersV1() {
        Greeter upperGreeter = new GreeterUpercaseDecorator(new GreeterImpl());
        String firstName = "Aidas";
        String lastName = "Pupelis";

        assertEquals("SVEIKAS GYVAS AIDAS PUPELIS", upperGreeter.greet(firstName, lastName));
    }

    @Test
    public void shouldReturnUpperLettersV2() {
        Greeter upperGreeter = new GreeterUpercaseDecorator(new GreeterImpl());
        String greetingas = upperGreeter.greet("Aidas", "Pupelis");

        assertEquals("SVEIKAS GYVAS AIDAS PUPELIS", greetingas);
    }

    @Test
    public void shouldReturnUpperLettersV3() {
        Greeter upperGreeter = new GreeterExclamationMarkDecorator(new GreeterUpercaseDecorator(new GreeterImpl()));
        String greetingas = upperGreeter.greet("Aidas", "Pupelis");

        assertEquals("SVEIKAS GYVAS AIDAS PUPELIS !", greetingas);
    }
}