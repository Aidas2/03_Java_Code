package lt.pupelis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pagrindine {

	public static void main(String[] args) {

		 for (int i = 1; i < 10; i++) { System.out.println("reiksme yra : " + i); }
		 
///// PIRMA UZDUOTIS //////// Parasyti FOR cikla, kuris butu vykdomas bent 5 kartus bei prie gautos reiksmes butu pridedamas 2, rezultatas turi buti atspausdinamas i ekrana
		for (int i = 1; i < 6; i++) {
			System.out.println("reiksme yra : " + (i+2));
		}
		
///////////////////////////////////////////////////////////////////////////////////	
/////// ANTRA UZDUOTIS ////// Parasyti programa, kuri atspausdintu tik nelyginius skaicius iki 10.
			for (int i = 1; i < 10; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		
///////////////////////////////////////////////////////////////////////////////////	
//////CIKLO WHILE UZDUOTIS //////		
		int x = 20; 
		while( x > 10 ) { 
		System.out.print("Reiksme x : " + x ); 
		x--; 
		System.out.print("\n");
		}
		
///////////////////////////////////////////////////////////////////////////////////	
//////OPERATORIUS SWITCH //////
		int day = 5;
		String dayOfWeek;
		switch (day) {
		case 1:
			dayOfWeek = "Pirmadienis";
			break;
		case 2:
			dayOfWeek = "Antradienis";
			break;
		case 3:
			dayOfWeek = "Treciadienis";
			break;
		case 4:
			dayOfWeek = "Ketvirtadienis";
			break;
		case 5:
			dayOfWeek = "Penktadienis";
			break;
		case 6:
			dayOfWeek = "Sestadienis";
			break;
		case 7:
			dayOfWeek = "Sekmadienis";
			break;
		default:
			dayOfWeek = "Negaliojanti diena";
			break;
		}
		System.out.println(dayOfWeek);
		
///////////////////////////////////////////////////////////////////////////////////	
////////PRAKTINE UZDUOTIS NR.1 ////// Parasyti programa, kuriai ivedus skaiciu butu atitinkamai atliekamas veiksmas:
//////////////////////////////////////1 – eiti tiesiai, 2 – eiti atgal, 3 – sukti i kaire, 4 – sukti i dešine		
		 Scanner reader = new Scanner(System.in);
		 // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println(n);
		reader.close();
		// int kryptis = n; - si eilute nereikalinga nes n jau uzduota auksciau
		String KurReikiaEiti;
		switch (n) {
		case 1:
			KurReikiaEiti = "eiti tiesiai";
			break;
		case 2:
			KurReikiaEiti = "eiti atgal";
			break;
		case 3:
			KurReikiaEiti = "sukti i kaire";
			break;
		case 4:
			KurReikiaEiti = "sukti i dešine";
			break;
		default:
			KurReikiaEiti = "Negaliojanti kryptis";
			break;
		}
		System.out.println(KurReikiaEiti);
		
///////////////////////////////////////////////////////////////////////////////////	
//////PRAKTINE UZDUOTIS NR.2 /////// Parasyti programa, kuri leistu vartotojui ivesti norima skaiciu ir po to parasytu ar sis skaicius yra lyginis, ar nelyginis. Naudoti IF salyga.
		System.out.println("Ivesk skaiciu: ");
		int ivestas = (new Scanner(System.in)).nextInt();
		System.out.println(ivestas);
//		reader.close(); - nebenaudojamas nes nera reader kaip anksciau
		if (ivestas % 2 != 0) {
			System.out.println("Ivestas skaicius yra nelyginis");
		} else {
				System.out.println("Ivestas skaicius yra lyginis");
			}
		
///////////////////////////////////////////////////////////////////////////////////	
//////PRAKTINE UZDUOTIS NR.2 ////// DAUGYBOS LENTELE. Parašyti programa, kuri i ekrana isvestu daugybos lentele nuo 1 iki 9.
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
//				System.out.println(i * j);			
				System.out.format("%4d", i * j);
			}
				System.out.print("\n"); ////- jei ikelti po vidinio for tai bus nauja eilute po kiekvienos skaiciaus,
										////- jei ikelti po isorinio for tai bus nauja eilute po kiekvienos eilutes.		
		}
		
///////////////////////////////////////////////////////////////////////////////////	
//////PRAKTINE UZDUOTIS NR.3 ////// ZODIS PABAIGA. Parasyti programa, kuri paprasytu vartotojo ivesti zodi ir ji is karto atvaizduotu, tada vel paprasytu ivesti kita zodi ir procesas butu kartojamas tol, kol nebus ivestas zodis „pabaiga“.
		Scanner reader = new Scanner(System.in); ////- galima uzsiduoti per dvi eilutes su reader
		System.out.println("Iveskite bet koki zodi: ");
		String tekstas = (new Scanner(System.in)).nextLine(); //// o va cia irasyti tik reader
		System.out.println("Jus ivedete zodi " + tekstas);
		while (!"pabaiga".equals(tekstas)) {
			System.out.println("Iveskite bet koki zodi dar karta: ");
			tekstas = (new Scanner(System.in)).nextLine();
		}
		System.out.println("sistema baige darba");
		
///////////////////////////////////////////////////////////////////////////////////	
//////PRAKTINE UZDUOTIS NR.3 ////// IVESTU SKAICIU SUMA. Parasyti programa, kuri paprasytu vartotojo vesti skaicius tol, kol bus ivestas skaicius 0. Pabaigoje programos turi buti atvaizduojama ivestu skaiciu suma.
		int suma = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite skaiciu: ");
		int skaicius = reader.nextInt();
		while (skaicius != 0) {
			suma = suma + skaicius; // suma =+ skaicius;
			System.out.println("Iveskite kita skaiciu: ");
			skaicius = reader.nextInt();
		}
		System.out.println("suma yra " + suma);
		System.out.println("sistema baige darba");
		
///////////////////////////////////////////////////////////////////////////////////	
////// MASYVAI ////// Patikrinti abieju masyvu ilgius, kodel jie skiriasi?
		int[] masyvas = new int[156];
		int[] masyvas1 = {1, 5, 7, 9, 0, 1};
		System.out.println(masyvas.length);
		System.out.println(masyvas1.length);
		
///////////////////////////////////////////////////////////////////////////////////	
///////PRAKTINE UZDUOTIS ////// Surasti maksimalia masyvo reiksme ir atspausdinti ekrane				
		double[] myArray = new double []{1.9, 10.1, 2.9, 5.5, 3.4, 6.9, 4.5, 7.8};
		Arrays.sort(myArray);  		//cia yra iskvieciama funkcija (reikia import'inti)
		double max = myArray[myArray.length - 1];
		System.out.println(max);
	
///////PRAKTINE UZDUOTIS ////// Pasunkinimas: Surasti didziausia skaiciu masyve ir surasti jo vieta		
		double[] myList = {1.9, 10.1, 2.9, 5.5, 3.4, 6.9, 4.5, 7.8}; 
		double max = myList[0];
		int maxIndex = 0;
		for (int i = 0; i < myList.length; i++) {
		System.out.print(myList[i] + " ");  // Spausdina visus masyvo elementus				
			if (myList[i] > max) {
				max = myList[i];
				maxIndex = i;						
			}
		}
		System.out.println();
		System.out.println("maksimali reiksme yra: " + max);
		System.out.println("maksimalios reiksmes vieta yra: " + maxIndex);
		
///////////////////////////////////////////////////////////////////////////////////		
//////NAMU DARBAI. Nr.1 Masyva uzpildome skaiciais nuo 1 iki 9. Programa turi atspausdinti visus masyvo skaicius, kurie dalinasi iš 3.	
		int[] masyvas = new int[10];
		for (int i = 1; i < masyvas.length; i++) {
			masyvas[i] = i;
//			System.out.println(masyvas[i]);
			if (masyvas[i] % 3 == 0) {
				System.out.println(masyvas[i]);
		}
			}
///////////////////////////////////////////////////////////////////////////////////	
//////NAMU DARBAI. Nr.2 /////// Parasyti programa, kuri suskaiciuotu visus pirminius skaicius nuo 10 iki 100. Pirminis skaicius yra tas skaicius, kuris dalinasi is 1 ir is pats saves. Atsakymas turi buti toks : 11, 13, … 97.
		for (int i = 10; i <= 100; i++) {
			if (i % 2 != 0  && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.print(i + " ");
		}
			}
			
///////////////////////////////////////////////////////////////////////////////////			
///////// NAMU DARBAI. Nr.3 === Kauliuko zaidimas.
///////// Zaidimui prasidejus zaidejas turi 100 pinigu, jo paklausiama ka jis nori daryti: 1 – zaisti, 2 – pasiimti turimus ar likusius pinigus ir baigti zaidima/programa.
///////// Zaidejui nusprendus zaisti jo paprasoma ivesti statymo suma min – 5, max – 20 pinigu. Turi buti tikrinimas ar ivedete teisinga suma.
///////// Pastacius suma prasoma ivesti skaiciu nuo 1 iki 6, tuomet ridenamas kauliukas ir tikrinima ar atspejote skaiciu, jei atspejote statoma suma dauginasi is 6, jei ne tuomet minusuojama iš turimos.
///////// Zaidimas baigiamas tuomet kai zaidejas nusprendzia pabaigti zaidima (paspaudzia 2, kiekviena karta turi buti klausiama ka jis nori daryti) arba baigiasi pinigai.
			int biudzetas = 100;
			int statymas;
			int kauliukasSpejamas;
			int kauliukasFaktinis;
			Random rand = new Random();
			boolean on  = true;
			
			System.out.println("Pasirinkite ka norite daryti: 1 – zaisti " + "/n" + " 2 – pasiimti turimus ar likusius pinigus ir baigti zaidima/programa");
			Scanner s = new Scanner(System.in);
			int pasirinkimas = s.nextInt();
			
			while (on) {
			switch (pasirinkimas) {	
			case 1:
				System.out.println(pasirinkimas);
				System.out.println("Iveskite statymo suma, min – 5, max – 20 pinigu");
				statymas = s.nextInt();
				if (statymas >= 5 && statymas <= 20 && biudzetas >= statymas) {
					System.out.println("Iveskite spejama skaiciu nuo 1 iki 6:");
					kauliukasSpejamas = s.nextInt();
					System.out.println("spejamas skaicius yra: " + kauliukasSpejamas);
					kauliukasFaktinis = rand.nextInt(6) + 1;
					System.out.println("Ismestas kauliukas yra:" + kauliukasFaktinis);
					if (kauliukasSpejamas == kauliukasFaktinis) {
						statymas = statymas * 6;
						biudzetas = biudzetas + statymas;
					} else { 
						System.out.println("Bandykite dar karta");
						biudzetas = biudzetas - statymas;
					}
					System.out.println("Turima pinigu suma yra:" + biudzetas);
				} else {
					System.out.println("Statymas yra netinkamas, pasirinkote neteisinga suma arba nepakanka lesu");
				}
				System.out.println("Pasirinkite ka norite daryti: 1 – zaisti " + "/n" + " 2 – pasiimti turimus ar likusius pinigus ir baigti zaidima/programa");
				pasirinkimas = s.nextInt();
				break;
			case 2:
				System.out.println(pasirinkimas + " Zaidimas baigtas");
				on = false;
				break;
			default:
					System.out.println("Blogai ivestas skaicius. Skaicius turi buti nuo 1 iki 2");
					pasirinkimas = s.nextInt();
					System.out.println(pasirinkimas);	
				break;
			}
			}
		
///////////////////////////////////////////////////////////////////////////////////	
//////List'ai
		List listas = new ArrayList();
		listas.add("Pavyzdys");
		listas.add("Nepavyzdys");
//		listas.remove("Pavyzdys");
		System.out.println(listas);
//		System.out.println(listas.get(0));		// spausdina listo elementa ties nuliniu indeksu
//		System.out.println(listas.isEmpty());	// tikrina ar listas yra tuscias (true false)
//		System.out.println(listas.size());		//	spausdina listo dydi	
		
		List listasKitas = new ArrayList();
		listasKitas.add("Kitas");
		listasKitas.add("KitasKitas");
		listasKitas.add("Pavyzdys");
		
////		listas.addAll(listasKitas);				// prideda visas reiksmes is kito masyvo. Naudojama pvz. kai reikia istrinti pasikartojancius (pries tai apjungiama)
///			System.out.println(listas);				// atspausdina ta pati list bet jau su pridetomis kito masyvo reiksmemis
		
		for (int i = 0; i < listas.size(); i++) {	
			System.out.println(listas.contains("Pavyzdys"));	// tikrina ar liste yra zodis "Pavyzdys" (true false)
			System.out.println(listas.get(i));					// atspausdina listo elementa ties i-tuoju indeksu
			if ("Pavyzdys".equals(listas.get(i))) {
				System.out.println();							// atspausdina tuscia eilute
			}
//			System.out.println(listas);
		}
		
			if (!"Pavyzdys".equals(listas.get(1))) {		//cia siaip pvz. su inversija
			System.out.println("Nelygus zodziai");
			}		
///////////////////////////////////////////////////////////////////////////////////	
////// Paprastas list. Parametrizuotas list. Abiem atvejais pabandome pakeisti paskutiniji elementa i skaiciu 1		
		List sarasas = new ArrayList();
		sarasas.add("Pirmas");
		sarasas.add("Antras");
		//sarasas.add("Trecias");
		sarasas.add(1);					//be kabuciu
		System.out.println(sarasas);
		
		List<String>sarasasP = new ArrayList();
		sarasasP.add("Pirmas");
		sarasasP.add("Antras");
		//sarasasP.add("Trecias");
		sarasasP.add("1");				//tik su kabutemis
		System.out.println(sarasasP);

		List<Integer>sarasasI = new ArrayList();
		sarasasI.add(new Integer(9));
		sarasasI.add(7);
		if (sarasasI.get(0) == 9) {
			System.out.println("Lygus");
		}
		System.out.println(sarasasI);
		
///////////////////////////////////////////////////////////////////////////////////
/////Uzduotis 1. Turime list‘a su reiksmemis 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. Sistema sugeneruoja atsitiktini skaiciu ne didesni nei 10 ir is anksciau sukurto list‘o turi buti pasalintos tos reiksmes, kurios dalinasi iš sugeneruoto skaiciaus.
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		List<Integer> sarasas = new ArrayList();
		List<Integer> sarasasGalutinis = new ArrayList();
		for (int z = 1; z < 101; z++) {
			sarasas.add(z);
		}
		System.out.println("atsitiktinis skaicius yra " + n);
		System.out.println("sarasas yra " + sarasas);
		for (int q = 0; q < sarasas.size(); q++) {
			if (sarasas.get(q) % n != 0) {
				sarasasGalutinis.add(sarasas.get(q));
			}
		}
		System.out.println("sarasasGalutinis yra " + sarasasGalutinis);
		
/////Uzduotis 2. Kiek kartu raides a b c yra nurodytame tekste
		int kiekis = 0;
		String tekstas = "labasClabas";
		for (int q = 0; q < tekstas.length(); q++) {
			if (tekstas.charAt(q) == 'a' || tekstas.charAt(q) == 'b' || tekstas.charAt(q) == 'c' || tekstas.charAt(q) == 'A' || tekstas.charAt(q) == 'B' || tekstas.charAt(q) == 'C') {
				kiekis = kiekis + 1;			
			}
				}
		System.out.println(kiekis);
		
/////Uzduotis 3. Kiek kartu raides a .....z  A.....Y yra nurodytame tekste (zr. ACSII table)			
		int kiekis = 0;
		String tekstas = "labasClabas";
		for (int i = 0; i < tekstas.length(); i++) {
			int number = tekstas.charAt(i);			//skaicius pagal ACSII table, pvz. 97 yra a
//			System.out.println(number);
			if ((number >= 97 && number <= 99) || (number >= 65 && number <= 67)) {
				kiekis++;			
			}
		}
		System.out.println(kiekis);
		
/////Uzduotis 4. Susikuriame list, kuriame irasome reiksmes kaip String tipo objektus: “5“, “3“, 6“, “4“, “ 9“.
/////Programa turi atvaizduoti skaiciu sarasa, kuriame prie lyginiu skaiciu turi buti pridetas 1. Kitaip sakant saraae neturetu likti lyginiu skaiciu.
		List<String> sarasas = new ArrayList<String>();
		sarasas.add("5");
		sarasas.add("3");
		sarasas.add("6");
		sarasas.add("4");
		sarasas.add("9");
		System.out.println(sarasas);
		int n;
		List<Integer> sarasasInt = new ArrayList<Integer>();
		for (String skaicius : sarasas) {
			n = Integer.parseInt(skaicius);
			if (n % 2 == 0) {
				sarasasInt.add(n+1);
			} else {
				sarasasInt.add(n);
			}
		}
			System.out.println(sarasasInt);

///////////////////////////////////////////////////////////////////////////////////
/////	Namu darbas Nr.1. Turime x ir y koordinaciu plokstuma, joje yra du taskai, taskas A(x=1, y=3), B(x=5, y =2). Suraskite tiesiausia atstuma tarp koordinaciu.
//////Destytojo variantas:
		double Ax = 1, Ay = 3;
		double Bx = 5, By = 2;
		System.out.println(Math.sqrt((Bx - Ax) * (Bx - Ax) + (By - Ay) * (By - Ay)));
//////Mano variantas:			
		int statinisx;
		int statinisy;
		double istrizaine;
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite tasko A koordinate x asyje: ");
		int Ax = reader.nextInt();
		System.out.println("Iveskite tasko A koordinate y asyje: ");
		int Ay = reader.nextInt();
		System.out.println("Iveskite tasko B koordinate x asyje: ");
		int Bx = reader.nextInt();
		System.out.println("Iveskite tasko B koordinate y asyje: ");
		int By = reader.nextInt();
		System.out.println("Tasko A koordinates yra " + Ax + " ir " + Ay);
		System.out.println("Tasko B koordinates yra " + Bx + " ir " + By);
		reader.close();
		statinisx = Ax - Bx; // kai ivesti kad grazintu be minuso ?
		statinisy = Ay - By;
		System.out.println("Statinis X asyje yra: " + statinisx + " Statinis y asyje yra " + statinisy);
		istrizaine = Math.sqrt((statinisx*statinisx)+(statinisy*statinisy)); // kodel nepraso importuoti Math ?
		System.out.println("Tiesiausio atstumo ilgis yra: " + istrizaine);
		
///////////////////////////////////////////////////////////////////////////////////
//////Namu darbas Nr.2. Parasyti programa, kuri paprasytu vartotojo ivesti 5 zodzius, tik po to kai bus suvesti zodžiai, jie turi buti atvaizduojami.
//////Destytojo variantas:
		int kiekis = 5;
		System.out.println("Iveskite 5 zodzius: ");
		Scanner sc = new Scanner(System.in);
		String tekstas;
		List<String> sarasas = new ArrayList<String>();
		for (int i = 0; i < kiekis; i++) {
			tekstas = sc.nextLine();
			sarasas.add(tekstas);
		}
		System.out.println(sarasas);
//////Mano variantas:
		int count = 0;
		String zodis;
		String sakinys = null;
		Scanner reader = new Scanner(System.in);
		while (count < 5) {
			System.out.println("Iveskite bet koki zodi: ");
			zodis = reader.nextLine();
			count++;
			sakinys = sakinys + "  " + zodis;
			if (count == 5) {
				System.out.println(sakinys);
			}
		}
		reader.close();
		
///////////////////////////////////////////////////////////////////////////////////
//////Namu darbas Nr.3. BANKOMATAS.
/////		a) Bankomate yra 500 pinigu, naudotojas paleides programa yra paprasomas ivesti pin koda, kuris yra “testas“, jei ivestas kodas teisingas naudotojas gauna pranesima, kad sekmingai prisijungete. Tuomet papraso ivesti pinigu kieki, kuri nori isssigryninti. Kiekis negali buti didesnis nei bankomate yra pinigu, jei iveda daugiau, tuomet informuojamas, kad bankomate nera tiek pinigu ir papraso ivesti mažesne suma. Ivedus tinkama suma, ji yra isgryninama ir parasoma, jog pinigai isgryninti ir programa baigia darba.
/////		b) Tikrinti pin kodo ivedima 3 kartus. Kai vartotojas teisingai iveda pin koda, sistema jo paklausia ka nori daryti isgryninti pinigu ar baigti darba. Pasirinkus baigti darba iseinama is programos, kitu atveju kartojamas pinigu isgryninimas tol, kol bankomate yra pinigu arba nusprendžiama baigti darba. Jei suvestas pin kodas 3 kartus neteisingai, tai parasoma yra ekrana, kad saskaita blokuota ir iseinama is programos. Kitu atveju programa baigia veikti, jei i musu bankomato klausima “Ar dar norite vykdyti tolesne operacija?“ yra atsakoma ne arba bankomate pinigu likutis yra mažesnis nei 10. P.S nuimta pinigu suma minusuojasi is buvusio bankomato likucio.
//
////		Dalis a).
//////Destytojo variantas:		

//////zr. sprendima faile Google diske;		
		
//////Mano variantas:
		int bankomatas = 500;
		String kodas = "testas";
		String PIN;
		int grynieji;

		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite PIN koda: ");
		PIN = reader.nextLine();

		while (!kodas.equals(PIN)) {
			System.out.println(PIN + " - sis PIN kodas yra neteisingas. Bandykite dar karta: ");
			PIN = reader.nextLine();
		}
		System.out.println(PIN + " - sis PIN kodas yra teisingas. Prisijungete sekmingai.");

		while (bankomatas > 0) {
			System.out.println("Iveskite  pinigu kieki, kuri norite issigryninti: ");
			grynieji = reader.nextInt();
			if (grynieji <= bankomatas) {
				bankomatas = bankomatas - grynieji;
				System.out.println("Jus isgryninote " + grynieji + " pinigu. " + "Bankomate liko " + bankomatas + " pinigu.");
			} else {
				System.out.println("Bankomate nera tiek pinigu. Iveskite mazesne suma: ");
			}
		}
		System.out.println("Bankomate nebera pakankamai pinigu. Sistema baige darba. Viso gero.");
		reader.close();		
///////////////////////////////////////////////////////////////////////////////////		
//////Namu darbas Nr.3. Bankomatas. Dalis b).
		int bankomatas = 500;
		String kodas = "testas";
		String PIN;
		int grynieji;
		int count = 0;
		int pasirinkimas;
		boolean on = true;

		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite PIN koda: ");
		PIN = reader.nextLine();

		while (!kodas.equals(PIN)) {
			count++;
			if (count == 3) {
				System.out.println("Jus ivedete PIN koda neteisingai tris kartus. Saskaita blokuota.");
				System.exit(0);
			} else {
			System.out.println(PIN + " - sis PIN kodas yra neteisingas. Bandykite dar karta: ");
			PIN = reader.nextLine();
			}
		}
		System.out.println(PIN + " - sis PIN kodas yra teisingas. Prisijungete sekmingai.");

		while (on) {
		System.out.println("Ka norite daryti ? 1 - issigryninti pinigu, 2 - baigti darba.");
		pasirinkimas = reader.nextInt();
		switch (pasirinkimas) {
		case 1:
			System.out.println("Iveskite  pinigu kieki, kuri norite issigryninti: ");
			grynieji = reader.nextInt();			
			if (grynieji <= bankomatas) {
				bankomatas = bankomatas - grynieji;
				System.out.println("Jus isgryninote " + grynieji + " pinigu. " + "Bankomate liko " + bankomatas + " pinigu.");
				if (bankomatas < 10) {
					System.out.println("Bankomate nebera pakankamai pinigu. Sistema baige darba. Viso gero.");
					System.exit(0);
				}
			} else {
				System.out.println("Bankomate nera tiek pinigu. Reikia ivesti mazesne suma.");
			}
		break;
		case 2:
			System.out.println("Sistema baige darba. Viso gero.");
			on = false;
			break;
		default:
			System.out.println("Blogai ivestas skaicius. Skaicius turi buti nuo 1 iki 2");
			break;
		}
		}
		reader.close();
/////////////////////////////////////////////////////////////////////////////////// 
	}
}