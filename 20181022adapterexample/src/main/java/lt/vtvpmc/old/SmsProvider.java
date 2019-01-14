package lt.vtvpmc.old;

public interface SmsProvider {
    
    boolean sendMessage(long number, String text);
    
}
