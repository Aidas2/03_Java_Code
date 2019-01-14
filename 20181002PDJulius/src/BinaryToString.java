public class BinaryToString {
    public static String convert(String binaryString) {
        String[] str = binaryString.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            char ch = (char) Integer.parseInt(str[i], 2);
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
