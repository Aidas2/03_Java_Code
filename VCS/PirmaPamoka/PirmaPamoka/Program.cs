using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PirmaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Sveikas pasauli !");
            Console.WriteLine("Aidas");
            Console.WriteLine("Pupelis");
            Console.WriteLine("42");
            Console.ReadLine();

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////1.Parašyti programą, kuri nuskaito įvestą tekstą ir atspausdina jį ekrane. Atspausdintus duomenis rodyti, kol nepaspaudžiamas ENTER
            /*Console.WriteLine("Iveskite bet koki teksta");
            var tekstas = Console.ReadLine();
            Console.WriteLine(tekstas);
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////2.Parašyti programą, kuri ATSKIRAI prašo įvesti vardą, pavardę, amžių ir atspausdina juos ekrane. Naudoti kintamuosius.
            /*Console.WriteLine("Iveskite varda");
            var vardas = Console.ReadLine();
            Console.WriteLine("Iveskite pavarde");
            var pavarde = Console.ReadLine();
            Console.WriteLine("Iveskite amziu");
            var amzius = Console.ReadLine();
            Console.WriteLine($"{vardas}, {pavarde}, {amzius}");
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////Parašyti programą, kuri prašo įvesti apskritimo spindulį ir pagal jį suskaičiuoja jo ilgį ir plotą.
            /*Console.WriteLine("Iveskite apskritimo spinduli");
            var spindulysTekstas = Console.ReadLine();
            var spindulys = int.Parse(spindulysTekstas);
            var ilgis = 2 * Math.PI * spindulys;
            //var plotas = Math.PI * spindulys * spindulys;
            var plotas = Math.PI * Math.Pow(spindulys, 2); 
            Console.WriteLine($"{ilgis}, {plotas}");
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////Parašyti programą, kuri prašo įvesti atstumą (metrais) ir laiką (sekundėmis), o iš įvestų duomenų suskaičiuoja greitįkm/h formatu.
            /*Console.WriteLine("Iveskite atstuma metrais");
            var atstumasM = double.Parse(Console.ReadLine());
            Console.WriteLine("Iveskite laika sekundemis");
            var laikasS = double.Parse(Console.ReadLine());
            var atstumasKm = atstumasM / 1000;
            var laikasH = laikasS / 3600;
            var greitis = atstumasKm / laikasH;
            Console.WriteLine("Greitis yra: " + greitis + " km/h.");
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////Parašyti programą, kuri prašo įvesti vardą, pavardę ir gimimo vietą ir atspausdina juos ekrane tokiu formatu:
            ////“Jonas Jonaitis deginasi Palangoje” 
            ////Panaudoti +, string.Concat(), string.Format(), bei interpoliaciją

            /*Console.WriteLine("Koks Jusu vardas ?");
            var vardas = Console.ReadLine();
            Console.WriteLine("Kokia Jusu pavarde ?");
            var pavarde = Console.ReadLine();
            Console.WriteLine("Kuriame mieste gimete ?");
            var miestas = Console.ReadLine();

            var tekstas1 = vardas + " " + pavarde + " deginasi " + miestas;
            var tekstas2 = string.Concat(vardas, " ", pavarde, " deginasi ", miestas);
            var tekstas3 = string.Format("{0} {1} deginasi {2}", vardas, pavarde, miestas);
            var tekstas4 = $"{vardas} {pavarde} deginasi {miestas}";

            Console.WriteLine(tekstas1);
            Console.WriteLine(tekstas2);
            Console.WriteLine(tekstas3);
            Console.WriteLine(tekstas4);
       
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////1.Parašyti programą, kuri prašo įvesti du skaičius ir patikrina ar jie lygūs. Rezultatą išvesti tokiu formatu: 
            ////“skaičius1 ir skaičius2 yra lygūs / nelygūs”
            /*Console.WriteLine("Iveskite pirma skaiciu");
            var skaicius1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Iveskite antra skaiciu");
            var skaicius2 = int.Parse(Console.ReadLine());
            if (skaicius1 == skaicius2)
            {
                Console.WriteLine($"{skaicius1} ir {skaicius2} yra lygus.");
            }
            else
            {
                Console.WriteLine($"{skaicius1} ir {skaicius2} yra nelygus.");
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////2.Parašyti programą, kuri prašo įvesti 3 skaičius ir nustato didžiausią iš jų
            /*Console.WriteLine("Iveskite pirma skaiciu");
            var skaicius1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Iveskite antra skaiciu");
            var skaicius2 = int.Parse(Console.ReadLine());
            Console.WriteLine("Iveskite trecia skaiciu");
            var skaicius3 = int.Parse(Console.ReadLine());
            if (skaicius1 > skaicius2 && skaicius1 > skaicius3)
            {
                Console.WriteLine($"Didziuasias skaicius yra {skaicius1}.");
            }
            else if (skaicius2 > skaicius1 && skaicius2 > skaicius3)
            {
                Console.WriteLine($"Didziausias skaicius yra {skaicius2}.");
            }
            else
            {
                Console.WriteLine($"Didziausias skaicius yra {skaicius3}.");
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////3.Parašyti programą, kuri prašo įvesti mokinio pažymį ir ekrane išspausdina jo apibūdinimą. (10 – puiku, 9-8 – labai gerai, 7-6- gerai, 5 - vidutiniškai, 4 – bent teigiamas, 3-2-1 – labai blogai
            /*Console.WriteLine("Iveskite mokinio pazymi");
            var pazimys = int.Parse(Console.ReadLine());
            switch (pazimys) {
                case 10:
                    Console.WriteLine("Puiku !");
                    break;
                case 9:
                case 8:
                    Console.WriteLine("Laba gerai");
                    break;
                case 7:
                case 6:
                    Console.WriteLine("Gerai");
                    break;
                case 5:
                    Console.WriteLine("Vidutiniškai");
                    break;
                case 4:
                    Console.WriteLine("Teigiamas");
                    break;
                case 3:
                case 2:
                case 1: //kad uzimtu maziau vietos, galime case surasyt i viena eilute sitaip
                    Console.WriteLine("Labai blogai!");
                    break;
                default:
                    Console.WriteLine("Toks pazimys neegzistuoja");
                    break;
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////4.Parašyti programą, kuri nuskaito įvestą skaičių ir patikrintų ar jis yra lyginis ar nelyginis
            /*Console.WriteLine("Iveskite naturaluji skaiciu:");
            var skaicius = int.Parse(Console.ReadLine());
            var lyginis = skaicius % 2 == 0;
            if (lyginis)
            {
                Console.WriteLine($"{skaicius} yra lyginis");
            }
            else
            {
                Console.WriteLine($"{skaicius} yra nelyginis");
            }
            Console.ReadLine();*/
            //arba panaudojant trinari operatoriu
            //Console.WriteLine("Iveskite naturaluji skaiciu: ");
            //int skaicius = int.Parse(Console.ReadLine());
            //Console.WriteLine($"Skaicius yra { (skaicius % 2 == 0 ? "lyginis" : "nelyginis") } ");
            //Console.ReadLine(); 

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////5.Parašyti programą, kuri nuskaito savaitės dienos numerį ir atspausdina jos žodinį pavadinimą ekrane
            /*Console.WriteLine("Iveskite savaites dienos numeri");
            var diena = int.Parse(Console.ReadLine());
            switch (diena) {
                case 1:
                    Console.WriteLine("Pirmadienis");
                    break;
                case 2:
                    Console.WriteLine("Antradienis");
                    break;
                case 3:
                    Console.WriteLine("Treciadienis");
                    break;
                case 4:
                    Console.WriteLine("Ketvirtadienis");
                    break;
                case 5:
                    Console.WriteLine("Penktadienis");
                    break;
                case 6:
                    Console.WriteLine("Sestadienis");
                    break;
                case 7:
                    Console.WriteLine("Sekmadienis");
                    break;
                default:
                    Console.WriteLine("Tokia diena neegzistuoja");
                    break;
            }

            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////6.Parašyti programą kalkuliatorių, kuri nuskaito 2 skaičius, nuskaito matematinį veiksmą, atlieka veiksmą ir atspausdina rezultatą ekrane tokiu formatu:
            ////“{ pirmas skaicius} { matematinis veiksmas} { antras skaičius} = { rezultatas}”
            /*Console.WriteLine("Iveskite pirma skaiciu");
            int skaicius1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Iveskite operacija");
            string operacija = Console.ReadLine();
            Console.WriteLine("Iveskite antra skaiciu");
            int skaicius2 = int.Parse(Console.ReadLine());

            switch (operacija)
            {
                case "+":
                    Console.WriteLine($"{skaicius1} + {skaicius2} = {skaicius1 + skaicius2}");
                    break;
                case "-":
                    Console.WriteLine($"{skaicius1} - {skaicius2} = {skaicius1 - skaicius2}");
                    break;
                case "/":
                    Console.WriteLine($"{skaicius1} / {skaicius2} = {skaicius1 / skaicius2}");
                    break;
                case "*":
                    Console.WriteLine($"{skaicius1} * {skaicius2} = {skaicius1 * skaicius2}");
                    break;
                case "%":
                    Console.WriteLine($"{skaicius1} % {skaicius2} = {skaicius1 % skaicius2}");
                    break;
                case "^":
                    Console.WriteLine($"{skaicius1} ^ {skaicius2} = {Math.Pow(skaicius1, skaicius2)}");
                    break;
                default:
                    Console.WriteLine("Nesuprantu tokios operacijos.");
                    break;
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////tas pats 6 uždavnys, tik vietoj switch naudojamas if-else
            /*Console.WriteLine("Iveskite pirma skaiciu: ");
            int skaicius1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Iveskite operacija:");
            string operacija = Console.ReadLine();

            Console.WriteLine("Iveskite antra skaiciu:");
            int skaicius2 = int.Parse(Console.ReadLine());

            double rezultatas = 0;

            if (operacija == "+")
            {
                rezultatas = skaicius1 + skaicius2;
            }
            else if (operacija == "-")
            {
                rezultatas = skaicius1 - skaicius2;
            }
            else if (operacija == "*")
            {
                rezultatas = skaicius1 * skaicius2;
            }
            else if (operacija == "/")
            {
                rezultatas = skaicius1 / skaicius2;
            }
            else if (operacija == "%")
            {
                rezultatas = skaicius1 % skaicius2;
            }
            else if (operacija == "^")
            {
                rezultatas = Math.Pow(skaicius1, skaicius2);
            }

            Console.WriteLine($"{skaicius1} {operacija} {skaicius2} = {rezultatas}");

            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////1.Parašyti programą naudojant while ciklą, kuri nuskaitinėja įvestus skaičius tol, kol jų suma nėra daugiau 50
            /*int riba = 50;
            int suma = 0;
            while (suma <= riba)
            {
                Console.WriteLine("Iveskite skaiciu:");
                int skaicius = int.Parse(Console.ReadLine());
                suma += skaicius;
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////2.Parašyti programą naudojant while ciklą, kuri nuskaitinėja paspaustus klavišus ir išveda jų pavadinimus tol, kol nepaspaudžiamas ESC klavišas
            /*while (true)
            {
                Console.WriteLine("Nuspauskite klaviaturos mygtuka:");
                var mygtukas = Console.ReadKey().Key;
                if (mygtukas == ConsoleKey.Escape)
                {
                    break;
                }
                else
                {
                    Console.WriteLine(mygtukas.ToString());
                }
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////1.Parašyti programą naudojant for ciklą, kuri suskaičiuoja pirmų 10 natūraliųjų skaičių sumą.
            /*int suma = 0;
            for (var i = 1; i <= 10; i++)
            {
                suma += i;
            }
            Console.WriteLine(suma);
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////2.Parašyti programą naudojant for ciklą, kuri prašo įvesti natūralųjį skaičių ir atspausdina visus žemesnius natūraliuosius skaičius mažėjančia tvarka
            /*Console.WriteLine("Iveskite skaiciu:");
            int skaicius = int.Parse(Console.ReadLine());
            for (int i = skaicius - 1; i > 0; i--)
            {
                Console.WriteLine(i);
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////3.Parašyti programą naudojant for ciklą, kuri prašo įvesti skaičių ir atspausdina jo daugybos lentelę
            /*Console.WriteLine("Iveskite skaiciu:");
            int skaicius = int.Parse(Console.ReadLine());
            for (int i = 1; i <= 10; i++)
            {
                Console.WriteLine($"{skaicius} * {i} = {skaicius * i}");
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            // PIRAMIDĖ.Parašyti programą naudojant for ciklą, kuri prašo įvesti piramidės aukštį ir atspausdina skaičių piramidę
            /*Console.WriteLine("Iveskite piramides auksti:");
            var aukstis = int.Parse(Console.ReadLine());
            var isvedamasSkaicius = 1;

            for (int i = 1; i <= aukstis; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write(isvedamasSkaicius + " ");
                    isvedamasSkaicius++;
                }
                Console.WriteLine();
            }*/
            Console.ReadLine();
        }
    }
}

