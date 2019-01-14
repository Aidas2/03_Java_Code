public class StringToHexadecimal {
    public static String convert(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(Integer.toHexString(str.charAt(i)) + " ");
        }

        int length = stringBuilder.length();

        stringBuilder.delete(length - 1, length);
        return stringBuilder.toString();
    }
}

