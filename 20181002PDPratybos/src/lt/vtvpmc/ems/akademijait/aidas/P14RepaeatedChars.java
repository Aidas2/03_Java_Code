package lt.vtvpmc.ems.akademijait.aidas;

// 14. Programa ieškanti pasikartojančių simbolių String’e.
public class P14RepaeatedChars {
    public static void main (String [] args){
        RepeatedChars("abrakadabra");

    }

    public static void RepeatedChars(String tekstas) {
        int count = 0;
        char [] inp = tekstas.toCharArray();
        System.out.println("Dublicate Characters are: ");
        for(int i = 0; i < tekstas.length(); i++) {
            for (int j = i+1; j < tekstas.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j] + " ");
                    count++;
                    break;
                }

            }
        }

    }
}
