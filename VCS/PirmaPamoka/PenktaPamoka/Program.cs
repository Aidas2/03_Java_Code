using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PenktaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            ////========================== STRING OPERACIJOS ======================================================

            ////1.Deklaruokite stringą ir pasibandykite po kelias f-jas iš skaidrių prieš pradedant spręsti kitus uždavinius.
            StringOperacijos.Pabandyk();

            ////2.Parašykite programą, kuri nuskaito įvesta sakinį ir kiekviena sakinio žodį atspausdina atskiroje eilutėje
            StringOperacijos.NuskaitykIrIsvesk();

            ////3.Parašykite programą, kuri nuskaito įvesta eilutę ir išveda ja tarp kiekvieno simbolio idėjus tarpą atvirkščiai, pvz.: l o o h c s g n i d o c s u i n l i v
            StringOperacijos.NuskaitykIrIsveskAtvirksciai();

            ////4.Parašykite programą, kuri nuskaito sakinį, tada pirmą žodį, antrą žodį ir sakinyje, jei yra pirmas žodis, pakeičia jį antru
            StringOperacijos.ApkeiskVietomis();

            ////5.Parašykite programą, kuri paprašo įvesti sakinį su žodžiu nemoku, randa jį sakinyje, iškerpa ir gražina sakinį be jo. Panaudokite IndexOf ir Substring f-jas
            StringOperacijos.ZodisNemoku();    // 1-oji papildoma uzduotis

            ////2pap.Patobulinkite kalkuliatoriaus programą, kad būtų galima įvesti matematinį veiksmą vienoje eilutėje atskirtą tarpais, pvz.: “2 + 5”,  “12 / 4”
            StringOperacijos.KalkuliatoriusPatobulintas();

            ////3pap.Parašykite programą, kuri nuskaito sakinį ir išveda žodžius atvirkštine tvarka vienoje eiluėje, pašalina skyrybos ženklus ir visas raides paverčia didžiosiomis, pvz.: Labas, kaip sekasi? => SEKASI KAIP LABAS
            StringOperacijos.NuskaitykIrIsveskAtvirksciai2();

            ////========================== FAILŲ OPERACIJOS ======================================================

            ////1.Sukurkite failą su tekstu (ManoFailas.txt). Nuskaitykite jį ir išveskite į Console.
            FailuOperacijos.NuskaitykIrIsveskEilute("ManoFailas.txt");
            FailuOperacijos.NuskaitykIrIsvesk("ManoFailas.txt");

            ////2.Sukurkite failą su tekstu. Nuskaitykite tekstą, kas antros eilutės raides paverskite didžiosiomis ir įrašykite į failą
            FailuOperacijos.NuskaitykPakeiskIrasyk(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\bandomasis.txt");
            FailuOperacijos.NuskaitykIrIsveskAK(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\AdresuKnygute.txt");

            // ========================== KLAIDU APDOROJIMAS (try, catch) ======================================================

            //// 1-oji uzduotis. Parašykite programą, kaip ir pavyzdyje skaidrėse, kuri nuskaito du skaičius, padalina vieną iš kito ir grąžina rezultatą. 
            ////Programa turi nenulūžti, jei netyčia įves raidę, o išvesti klaidos pranešimą, kad įvesti duomenys yra neteisingi.
            ////Dalybos iš nulio atveju, programa irgi turi nenulūžti, o turi išvesti klaidos pranešimą, kad dalyba iš nulio yra negalima.
            try
            {
                Console.WriteLine("Iveskite pirma skaiciu");
                double skaicius1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Iveskite antra skaiciu");
                double skaicius2 = int.Parse(Console.ReadLine());

                double rezultatas = skaicius1 / skaicius2;

                Console.WriteLine($"{skaicius1} / {skaicius2} = {rezultatas}");
            }
            //catch (Exception DalybaIsNulio) // neaisku kaip uzsiduoti klaidos atapzinima ir klaidos pranesimo teksta ?
            //{
            //    Console.WriteLine($"Ivyko klaidele: {DalybaIsNulio.Message}");
            //}
            catch (Exception e)
            {
                Console.WriteLine($"Ivyko klaidele: {e.Message}");
            }

            //// 2-oji užduotis. Deklarauokite skaičių masyvą ir parašykite programą, kuri grąžina paprašytą i - ąjį skaičių iš masyvo ir išveda klaidos pranešimą, jei bandė pasiekti nesamą elementą.
            try
            {
                int[] skaiciuMasyvas = new int [] {6, 8, 15, 25, -14, 0, 62 };
                Console.WriteLine("Iveskite elemento, kuri norite isvesti, indeksa");
                int indeksas = int.Parse(Console.ReadLine());
                Console.WriteLine(skaiciuMasyvas[indeksas]);
            }
            catch (Exception e)
            {
                Console.WriteLine($"Ivyko klaidele: {e.Message}"); // tas pats klausimas kaip ir 1-oje uzduotyje 
            }

            ////6-ajai pamokai. Uzduotis "Adresu knygute":
            try
            {
                var eilutes = File.ReadAllLines(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\AdresuKnygute.txt").ToList();
                for (int i = 0; i < eilutes.Count; i++)
                {
                    Console.WriteLine($"{i + 1}. {eilutes[i]}");
                }

                Console.WriteLine("Iveskite nauja irasa:");
                var naujaEilute = Console.ReadLine();

                eilutes.Add(naujaEilute);

                File.WriteAllLines(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\AdresuKnygute.txt", eilutes);

            }
            catch(Exception e)
            {
                Console.WriteLine($"Ivyko klaidele: {e.Message}");
            }

            Console.ReadLine();
        }
    }
}
