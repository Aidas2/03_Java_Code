package lt.vtvpmc.ems.akademijait.funcional02;

import java.util.function.Function;

/**
 * cia yra tekstas kuris eina i javadoc
 * @author
 * @param
 * @return
 */
interface  Behavior {
    String answer(String message);
}

interface  Speaker {
    String speak(String message);
}

    public class App {
    public static void main(String[] args) {
        speakWithParrot(App::behaveGood); //speakWithParrot((message) -> message); analogiskas variantas su lambda
        speakWithParrot(App::behaveBadly);

        simpleSpeak(App::speakGood);
        simpleSpeak(App::speakBadly);

        simplySpeakJavaEdition(App::speakGood);
        simplySpeakJavaEdition(App::speakBadly);
    }

    public static void simplySpeakJavaEdition(Function<String, String> f) {
        System.out.println(f.apply("labukas"));
        System.out.println(f.apply("sausainis"));
        System.out.println(f.apply("piratas"));
    }


    public static void simpleSpeak(Speaker speaker) {
        System.out.println(speaker.speak("labukas"));
        System.out.println(speaker.speak("sausainis"));
        System.out.println(speaker.speak("piratas"));
    }

    public static void speakWithParrot(Behavior behavior) {
        System.out.println(speakWithBehavior(behavior,"labukas"));
        System.out.println(speakWithBehavior(behavior,"sausainis"));
        System.out.println(speakWithBehavior(behavior, "piratas"));
    }

    public static String speak(String message) {
        return "Poli sako " + message;
    }

    public static String speakWithBehavior(Behavior behavior, String message) {
        return "Poli sako " + behavior.answer(message);
    }


    /////////
    public static  String speakGood(String message) {
        return speakWithBehavior(App::behaveGood, message);
    }

    public static  String speakBadly(String message) {
        return speakWithBehavior(App::behaveBadly, message);
    }
    ///////////



    public static String behaveGood(String message) {
        return message;
    }

    public static String behaveBadly(String message) {
        if(message.contains("sauainis")) {
            return "noriu sausainio";
        } else {
            return "rupus miltai, kur sausainis ?";
        }
    }

}
