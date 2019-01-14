package lt.vtvpmc.ems.akademijait.funcional01;

public class App {
    public static void main(String[] args) {
        Parrot parrot = new Poli(new BadBehaviourStrategy()); //papugos objektas, kuriam paduodama strategija (pagal konstrukoriu)

        System.out.println(parrot.speak("labukas"));
        System.out.println(parrot.speak("Sausainis"));
        System.out.println(parrot.speak("delfinas"));
    }
}
