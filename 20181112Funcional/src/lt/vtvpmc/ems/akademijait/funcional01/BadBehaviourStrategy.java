package lt.vtvpmc.ems.akademijait.funcional01;

public class BadBehaviourStrategy implements BehaviourStrategy{
    @Override
    public String answer(String textToReply) {
        if (textToReply.toLowerCase().contains("sausainis")) { //isimtis jei seimininkas sako zodi "sausainis"
            return "yra gera ir nori sausainio";
        }

        return "Rupus miltai, kur sausainis ?"; //tekstas, kuriuo papuga atsako blogo elgesio aveju
    }
}
