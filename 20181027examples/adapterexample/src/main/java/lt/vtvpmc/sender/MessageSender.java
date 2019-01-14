package lt.vtvpmc.sender;

import lt.vtvpmc.old.SmsProvider;

public class MessageSender {
    
    public boolean sendMessages(SmsProvider provider) {
        return provider.sendMessage(80300000, "Labas rytas!")
            && provider.sendMessage(370250211, "Labas rytas!")
            && provider.sendMessage(584395839, "Labas rytas!");
    }
    
}
