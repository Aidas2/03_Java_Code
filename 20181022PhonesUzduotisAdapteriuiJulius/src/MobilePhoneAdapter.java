public class MobilePhoneAdapter implements Phone {
    private MobilePhone mobilePhone;
    private String response;

    public MobilePhoneAdapter (MobilePhone mobilePhone){
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void dial(String strin) {
        response = mobilePhone.dial(strin);
    }

    @Override
    public String getResponse() {
        return response;
    }
}