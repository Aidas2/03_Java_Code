package lt.vtvpmc.fancy;

public class NewProvider {
    
    public boolean sendShortMessage(String phoneNumber, String message) {
        System.out.println("@ " + phoneNumber + ": " + message);
        return true;
    }
    
}
