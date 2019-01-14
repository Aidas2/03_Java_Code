 using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PenktaPamoka
{
    class StringOperacijos
    {
        public static void Pabandyk()       // 1-oji uzduotis
        {
            Console.WriteLine("labai labai ilgas mano sakinys".Length);

            var tekstas1 = "Vilnius Coding School";

            Console.WriteLine(tekstas1.Contains("School"));
            Console.WriteLine(tekstas1.Contains("Learning"));

            Console.WriteLine(tekstas1.ToLower());
            Console.WriteLine(tekstas1.ToUpper());

            var zodziai = tekstas1.Split(' ');
            foreach (var zodis in zodziai)
            {
                Console.WriteLine($"{zodis} ilgis yra {zodis.Length}");
            }
            
            var arYraShool = tekstas1
                .ToLower()
                .Replace(" ", "*")
                .Contains("school");
            Console.WriteLine(arYraShool);

            var tekstas2 = string.Join("*", zodziai);
            Console.WriteLine(tekstas2);

        }

        public static void NuskaitykIrIsvesk()       // 2-oji uzduotis
        {
            Console.WriteLine("Iveskite sakini is keliu zodziu");
            var tekstas = Console.ReadLine();

            string[] zodziai = tekstas.Split(' ');

            foreach (var zodis in zodziai)
            {
                Console.WriteLine(zodis);
            }
          
        }

        public static void NuskaitykIrIsveskAtvirksciai()    // 3-ioji uzduotis
        {
            Console.WriteLine("Iveskite sakini is keliu zodziu");
            var tekstas = Console.ReadLine();

            for (int i = tekstas.Length - 1; i >= 0; i--)
            {
                if(tekstas[i] != ' ')
                Console.Write($"{tekstas[i]} ");
            }
            Console.WriteLine();
        }

        public static void ApkeiskVietomis()    // 4-oji uzduotis
        {
            Console.WriteLine("Iveskite sakini is keleto zodziu");
            var sakinys = Console.ReadLine();

            Console.WriteLine("Iveskite pirma zodi");
            var zodis1 = Console.ReadLine();

            Console.WriteLine("Iveskite antra zodi");
            var zodis2 = Console.ReadLine();

            var rezultatas = sakinys.Replace(zodis1, zodis2);
            Console.WriteLine(rezultatas);

        }

        public static void ZodisNemoku()    // 1-oji papildoma uzduotis. Isvesti sakini be zodzio "nezinau"
        {
            Console.WriteLine("Iveskite sakini su zodziu nezinau");
            var sakinys = Console.ReadLine();

            var indeksas = sakinys.IndexOf("nemoku");
            var tekstodalis1 = sakinys.Substring(indeksas, 6);

            var rezultatas = sakinys.Replace(tekstodalis1, "");

            Console.WriteLine(rezultatas);
        }

        public static void KalkuliatoriusPatobulintas ()    // 2-oji papildoma uzduotis. Patobulintas kalkuliatorius
        {
            Console.WriteLine("Iveskite pirma skaiciu, operacija, antra skaiciu:");
            string sakinys = Console.ReadLine();
            string [] zodziai = sakinys.Split(' ');
            int skaicius1 = int.Parse(zodziai[0]);
            var operacija = zodziai[1];
            int skaicius2 = int.Parse(zodziai[2]);
            
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
        }

        public static void NuskaitykIrIsveskAtvirksciai2()    // 3-ioji papildoma uzduotis. Isvesk zodzius atvirksciai ir be zenklu
        {
            Console.WriteLine("Iveskite sakini is keliu zodziu");
            var tekstas = Console.ReadLine().ToUpper();
            //tekstas = tekstas.ToUpper();
            char[] delimeterChars = {' ', ',', '.', '-', '?', '\t' };
            string[] zodziai = tekstas.Split(delimeterChars);
            for (int i = zodziai.Length - 1; i >= 0; i--)
            {
                     Console.Write($"{zodziai[i]} ");
            }
            Console.WriteLine();
        }

    }
}
