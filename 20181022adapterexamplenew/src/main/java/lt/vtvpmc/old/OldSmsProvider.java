package lt.vtvpmc.old;

public class OldSmsProvider implements SmsProvider {


    public boolean sendMessage(long number, String text) {
        System.out.println(number + ":" + text);
        return true;
    }
}
