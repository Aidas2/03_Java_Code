package lt.vtvpmc.ems.akademijait.aidas;

public class Keistenybes {
    public static void main(String[] args) {

        String str1 = "10";
        int in1 = 10;
        //System.out.println(str1 + in1); //1010
        //System.out.println(in1 + str1 + in1); //101010
        //System.out.println(str1 + in1 + in1); //101010 (pirma sudeda str ir in, gauna str, paskaui dar kasrta str + in)
        //System.out.println(in1 + in1 + str1); //2010 (pirma sudeda du in, o paskui prie rezultato prideda string
        //System.out.println(in1 + str1 - in1); //Error
        //System.out.println(str1 + in1 * in1); //10100
        //System.out.println(str1 * in1); //Error

//        in1 = in1++ + ++in1; // 22

//        in1 = ++in1 + in1++; // 22

//        in1 = in1++ + in1++ + in1++; // 33

        in1 += in1++ + in1-- + in1++; // 41
//
            System.out.println(in1);
//
        int in2 = 20;
        in2 = ++in2 + 1; // 22 postkrementas

        System.out.println(in2);
    }
}
