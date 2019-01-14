import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class PhoneAdapter implements Phone {
    private MobilePhone mobilePhone;
    String zinute;

    public PhoneAdapter(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void dial(String s) {
       zinute = mobilePhone.dial(s);

    }

    @Override
    public String getReponse() {
        return zinute;
    }
}
