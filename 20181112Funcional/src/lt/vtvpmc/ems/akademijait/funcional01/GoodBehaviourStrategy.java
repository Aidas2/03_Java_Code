package lt.vtvpmc.ems.akademijait.funcional01;

public class GoodBehaviourStrategy implements BehaviourStrategy {
    @Override
    public String answer(String textToReply) {
        return textToReply; // tekstas, kuriuo papuga atsako gero elgesio aveju (tiesiog atkartoja tą patį)
    }
}
