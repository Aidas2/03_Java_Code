public class StringToBinary {
    public static String convert(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int charInt = (int)str.charAt(i);

            for (int j = 0; j < 8; j++)
            {
                stringBuilder.append((charInt & 128) == 0 ? 0 : 1);
                charInt <<= 1;
            }

            //int charInt = (int)str.charAt(i);
            stringBuilder.append(" ");
        }
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());

        return stringBuilder.toString();
    }
}
