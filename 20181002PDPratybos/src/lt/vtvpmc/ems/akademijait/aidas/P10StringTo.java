package lt.vtvpmc.ems.akademijait.aidas;


// 10. Programa keičianti String į dvejetainį kodą.
// 11. Programą keičianti dvejetainį kodą į String.
// 12. Programa keičianti String į aštuntainį kodą.
// 13. Programa keičianti String į šešioliktainį kodą.

public class P10StringTo {
    public static void main (String [] args) {
        StringToBinary("Akademija");
        //BinaryToString(10011100); //ka cia irasyti skliaustuose ?
        // 01000001 01101011 01100001 01100100 01100101 01101101 01101001 01101010 01100001
        StringToOctal("Akademija");
        StringToHexedecimal("Akademija");
    }

        public static void StringToBinary(String stringas1) {
            //String stringas = "Akademija";
            byte[] bytes = stringas1.getBytes();
            StringBuilder binary = new StringBuilder();
            for (byte b : bytes) {
                int val = b;
                for (int i = 0; i < 8; i++) {
                    binary.append((val & 128) == 0 ? 0 :1);
                    val <<= 1;
                }
                binary.append(' ');
            }
            System.out.println("'" + stringas1 + "' to binary: " + binary);
        }

        public static void BinaryToString(String binaryString) {
            String[] str = binaryString.split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.length; i++) {
                char ch = (char) Integer.parseInt(str[i], 2);
                stringBuilder.append(ch);
            }
            System.out.println("'" + binaryString + "' to string: " + stringBuilder.toString());
        }

        public static void StringToOctal(String stringas2) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < stringas2.length(); i++) {
                stringBuilder.append(Integer.toOctalString(stringas2.charAt(i))+" ");
            }
            stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
            System.out.println("'" + stringas2 + "' to octal: " + stringBuilder.toString());
        }

        public static void StringToHexedecimal(String stringas3) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < stringas3.length(); i++) {
                stringBuilder.append(Integer.toHexString(stringas3.charAt(i)) + " ");
            }

            int length = stringBuilder.length();

            stringBuilder.delete(length - 1, length);
            System.out.println("'" + stringas3 + "' to hexadecimal: " + stringBuilder.toString());
        }
}
