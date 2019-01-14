package lt.vtvpmc.ems.akademijait.funcional01;

public class Poli implements Parrot {

    BehaviourStrategy behaviourStrategy; //idedam strategija i papugos klase (su tikslu panaudoti zemiau pakoregavimui jos atsakymo)

    public Poli (BehaviourStrategy behaviourStrategy) { //konstruktorius papugos objekto kurimui (numato kad kaip argumenta reikia paduoti strategija)
        this.behaviourStrategy = behaviourStrategy;
    }

    @Override //tekstas i kuri papuga atsako (seimininko tekstas). Returnina  teksta is strategijos
    public String speak(String textToReplyTo) {
        return "Poli sako: " + behaviourStrategy.answer(textToReplyTo);
    }
}
