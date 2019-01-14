package lt.vtvpmc.sender;

import lt.vtvpmc.fancy.NewProvider;
import lt.vtvpmc.old.SmsProvider;

public class NewToOldAdapter implements SmsProvider {
    
    private NewProvider newProvider;
    
    public NewToOldAdapter(NewProvider newProvider) {
        this.newProvider = newProvider;
    }


    public boolean sendMessage(long number, String text) {
        return newProvider.sendShortMessage(
                Long.toString(number),
                text
        );
    }
}
