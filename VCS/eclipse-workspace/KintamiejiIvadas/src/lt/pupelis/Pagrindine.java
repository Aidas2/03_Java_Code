package lt.pupelis;

public class Pagrindine {

	public static void main(String[] args) {
		System.out.println("Sveikas pasauli !");
		int qq = 534;
		int zz = 454;
		System.out.println(qq);
		System.out.println("reikme yra lygi " + qq + "\n");
		System.out.println("reikme yra lygi " + zz);
//////////////////////////////////////////////////////////////////////////////////		
		int z = 4;
		int i = 5;
		if (i < z) {
			System.out.println("true");
			System.out.println("very beginner level");
		} else {
			System.out.println("skaicius didesnis uz " + z);
		}
////////////////////////////////////////////////////////////////////////////////		
		int user = 21;
		if (user <= 18) {
			System.out.println("Vartotojui 18 metu arba maziau");
		}
		else if(user > 18 && user < 40){
			System.out.println("Vartotojas yra tarp 19 ir 39 metu");
		}  
		else{
			System.out.println("Vartotojas vyresnis nei 40 metu");
		}
///////////////////////////////////////////////////////////////////////////////
		int a = 7;
		int b = 12;
		int c = 3;
		double d = 2;
		double e = 4;
		double f;
		
		f = a + b - c * d / e;
		
		if (f > 15) {
			System.out.println("f yra daugiau nei 15 ir lygus " + f);
		}
		else {
			System.out.println("f yra maziau nei 15 ir lygus " + f);
		}
//////////////////////////////////////////////////////////////////////////////		
	}
}