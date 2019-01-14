import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    void shouldBeAbleGetAMessage() {
        MobilePhone mobilePhone = new MobilePhone();
        MobilePhoneAdapter mobilePhoneAdapter = new MobilePhoneAdapter(mobilePhone);
        assertEquals("Jus sveikina Java Pagrindu programa. Jūs teisingai paskambinote nurodytam telefono numeriui! Party! :)", AutomaticDialer.dial(mobilePhoneAdapter));
    }
}
