package lt.vtvpmc.ems.adapter;


/**
 * Adapter
 *
 */
public class AppAdapter
{
    static class User {
        public static String shout(Megaphone megaphone) {
            return megaphone.speak("labas");
        }
    }

    static interface Megaphone {
        String speak(String message);
    }

    static class Loudspeaker {
        public String speakInto(String message) {
            return message.toUpperCase() + "!";
        }
    }

    static class LoadspeakerToMegaphoneAdapter implements Megaphone {

        private Loudspeaker loudspeaker;

        public LoadspeakerToMegaphoneAdapter(Loudspeaker loudspeaker) {
            this.loudspeaker = loudspeaker;
        }

        @Override
        public String speak(String message) {
            return this.loudspeaker.speakInto(message);
        }

    }

    public static void main(String[] args)
    {
        String result = User.shout(
                new LoadspeakerToMegaphoneAdapter(
                        new Loudspeaker()
                )
        );

        System.out.println(result);
    }
}