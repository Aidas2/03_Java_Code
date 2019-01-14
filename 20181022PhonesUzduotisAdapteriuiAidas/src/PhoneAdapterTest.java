import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneAdapterTest {
    @Test
    public void shouldBeAbleToDealAndGetResponse () {
        MobilePhone mobilePhone = new MobilePhone();
        PhoneAdapter phoneAdapter = new PhoneAdapter(mobilePhone);

        assertEquals("Jus sveikina Java Pagrindų programą. Jūs teisingai paskambinote nurodytam telefono numeriui! Party! :)", AutomaticDialer.dial(phoneAdapter));
    }
}