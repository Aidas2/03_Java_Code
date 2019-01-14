package lt.pupelis;

import java.util.Date;
import java.util.Random;

public class Pagrindine {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int kauliukas = rand.nextInt(60) + 1;
		System.out.println(kauliukas);
		
		Date data = new Date();
		System.out.println(data);

	} 

}
