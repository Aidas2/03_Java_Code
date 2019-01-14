using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SestaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            //============= SKRUZDEDA ======================
            Skruzdeda manoSkruzdeda = new Skruzdeda(); // sukuriam objekta pagal konstruktorius
            
            manoSkruzdeda.Amzius = 100;                //cia ir toliau: taikom savybes ar metodus jau paciam objektui

            manoSkruzdeda.Vardas = "Petras";
            Console.WriteLine(manoSkruzdeda.Vardas);

            manoSkruzdeda.Vardas = "";
            Console.WriteLine(manoSkruzdeda.Vardas);

            manoSkruzdeda.SpausdinkSavoSavybes();

            var skruzdeliuSkaicius = manoSkruzdeda.KiekSuvalgeiSkruzdeliu();
            Console.WriteLine(skruzdeliuSkaicius);*/

            //============= AUTOMOBILIS ======================
            Automobilis manoAutomobilis = new Automobilis("Mazda 323F", 1995, 1.5); // sukuriam objekta pagal konstruktoriu
            var kmKiekis = manoAutomobilis.KiekNuvaziavoKm();
            Console.WriteLine($"Automobilis nuvaziavo: {kmKiekis} km");

            Automobilis darbinisAuto = new Automobilis("Ford Focus", 2013, 6.2);    // sukuriam kita objekta pagal konstruktoriu
            darbinisAuto.Uzsivesk();
            //Console.WriteLine($"Automobilio marke yra: {darbinisAuto.Marke}, turis yra: {darbinisAuto.VariklioTuris}, ");
            manoAutomobilis.DuomenysIsRegitros();
            darbinisAuto.DuomenysIsRegitros();

            //============= APSKRITIMAS ======================
            var apskritimas1 = new Circle(2);       // sukuriam objekta pagal konstruktoriu
            var apskritimas2 = new Circle(55);      // kontruktoriaus vardas priekyje nebutinas ?!

            Circle apskritimas3 = new Circle(6);    // sukuriam trecia objekta pagal konstruktoriu
            Circle apskritimas4 = new Circle(9);    // sukuriam ketvirta objekta pagal konstruktoriu

            var plotas1 = apskritimas1.GetArea();
            var plotas2 = apskritimas2.GetArea();
            var plotas3 = apskritimas3.GetArea();
            var plotas4 = apskritimas4.GetArea();

            Console.WriteLine("Pirmo apskritimo plotas yra: " + plotas1);
            Console.WriteLine("Antro apskritimo plotas yra: " + plotas2);
            Console.WriteLine("Trecio apskritimo plotas yra: " + plotas3);
            Console.WriteLine("Ketvirto apskritimo plotas yra: " + plotas4);

            //============= ADRESU KNYGELE ======================
            try
            {
                var zmones = new List<Zmogus>();    // cia yra tik listas (o ne objektas !).
                                                    // Objektus sukursim veliau. Po sukurimo ikelsim i si lista.
                                                    // Listo pavadinimas yra ne bet koks, o su klases Zmogus pavadinimu. Tai reiskia kad lista pildysim objektais is klases Zmogus.
                var eilutes = File.ReadAllLines(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\AdresuKnygute.txt").ToList();
                                                        // .ToList(); - pavercia failo turini i lista (list tipo masyva)

                foreach (var eilute in eilutes)
                {
                    var eilutesDuomenys = eilute.Split(' '); // is failo nuskaitytas eilutes suskaldom i atskirus duomenis
                    var zmogus = new Zmogus(eilutesDuomenys[0], eilutesDuomenys[1], eilutesDuomenys[2]); // konstruktorius :) !
                    zmones.Add(zmogus); // pridedam objekta prie listo 
                }

                foreach (var zmogus in zmones)
                {
                    zmogus.AtspausdinkInformacija();
                }

                for (int i = 0; i < eilutes.Count; i++)
                {
                    Console.WriteLine($"{i + 1}. {eilutes[i]}");
                }

                Console.WriteLine("Iveskite nauja irasa:");
                var naujaEilute = Console.ReadLine();

                eilutes.Add(naujaEilute);

                File.WriteAllLines(@"D:\vilniuscoding.lt\PROGRAMAVIMO PAGRINDAI PER 6 SAVAITES\Google Drive\C#\AdresuKnygute.txt", eilutes);

            }
            catch (Exception e)
            {
                Console.WriteLine($"Ivyko klaidele: {e.Message}");
            }

            Console.ReadLine();
        }
    }
}