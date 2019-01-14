public class PositiveNegativeNumber {
    public static String checkNumber(int number) {
        if(number > 0){
            return "positive";
        }
        if(number < 0){
            return "negative";
        }
        return "zero";
    }
}
