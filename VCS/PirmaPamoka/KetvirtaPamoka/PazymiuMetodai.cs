using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KetvirtaPamoka
{
    class PazymiuMetodai
    {
        public static List<int> NuskaitykPazymius()
        {
            var pazymiai = new List<int>();

            Console.WriteLine("Iveskite pazymius:");

            bool arIvestaTuscia = false;
            while(!arIvestaTuscia)
            {
                var tekstas = Console.ReadLine();
                if (tekstas == "")
                {
                    arIvestaTuscia = true;
                }
                else
                {
                    var pazymys = int.Parse(tekstas);
                    pazymiai.Add(pazymys);
                }
                
            }


            return pazymiai;
        }

        public static double PaskaiciuokVidurki(List<int>pazymiai)
        {
            double suma = 0;

            foreach (var pazymys in pazymiai)
            {
                suma += pazymys;
            }
            return suma/pazymiai.Count;
        }

        public static double PaskaiciuokMediana(List<int> pazymiai)
        {
            double mediana = 0;
            pazymiai.Sort();

            if (pazymiai.Count % 2 == 0) // gaunam 0 arba 1
            {
                var indeksas1 = pazymiai.Count / 2;
                var indeksas2 = (pazymiai.Count / 2) - 1;
                mediana = (pazymiai[indeksas1] + pazymiai[indeksas2]) / 2.0; // dalinam is 2.0 o ne is 2, todel rezultatas su kableliu;

            }
            else
            {
                var indeksas = pazymiai.Count / 2; // dalinam is 2, o ne is 2.0, todel rezultatas be kablelio
                mediana = pazymiai[indeksas];
            }

            return mediana;
        }

        public static void IsveskPazymiuStatistika(List<int> pazymiai)
        {
            Console.WriteLine("================ Pazymiu statistika ==================");
            for (int i = 1; i <= 10; i++)
            {
                var counter = 0;

                for (int j = 0; j < pazymiai.Count; j++)
                {
                    if (pazymiai[j] == i)
                    {
                        counter++;
                    }
                }
                Console.WriteLine($"{i} yra {counter}.");
            }
        }
    }
}
