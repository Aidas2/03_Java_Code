public class AutomaticDialer {

    public static String dial(Phone phone){
        phone.dial("+37060013245");
        return phone.getResponse();
    }
}
