package lt.vtvpmc.sender;

import lt.vtvpmc.fancy.NewProvider;
import lt.vtvpmc.old.OldSmsProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    
    @Test
    public void canSendMessages() {
        MessageSender sender = new MessageSender();
        NewProvider newSmsProvider = new NewProvider();
        
        boolean result = sender.sendMessages(
                new NewToOldAdapter(newSmsProvider)
        );
        
        assertTrue(result);
        
    }

}