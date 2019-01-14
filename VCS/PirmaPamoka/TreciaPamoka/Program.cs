using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TreciaPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            ///// ! ! ! čia surašyti metodų IŠKVIETIMAI, o patys metodai yra surašyti žemiau ! ! !

            ////1.Parašykite metodą Pasisveikink.
            string tekstas = "Labas, as krabas";
            Pasisveikink(tekstas);                      //Metodo Pasisveikink iškvietimas
            Pasisveikink("Laba diena su vistiena");     //Metodo Pasisveikink iškvietimas
            Pasisveikink();                             //Metodo Pasisveikink iškvietimas

            ////Parašyti metodą, kuris prašo įvesti du skaičius ir juos sudaugina.
            int rezultatas1 = Sudaugink(3, 10);         //Metodo Sudaugink iškvietimas
            int rezultatas2 = Sudaugink(4, 3);          //Metodo Sudaugink iškvietimas

            ////Parašyti metodą, kuris prašo įvesti skaiciu ir ji perduoda (return)
            Console.WriteLine("Iveskite piramides auksti");
            int aukstis = NuskaitykSk();                //Metodo NuskaitykSk iškvietimas
        
            Console.Read();

            ////3.Parašyti metodą, kuris suskaičiuoja žmogaus kūno masės indeksą ir grąžina. Priima du parametrus - svorį ir ūgį. Formulė: svoris kg / (ūgis metrais) ^ 2).
            Console.WriteLine("Iveskite svori (kg)");
            double svoris = NuskaitykSk();              //Metodo NuskaitykSk iškvietimas
            Console.WriteLine("Iveskite ugi (m)");
            double ugis = NuskaitykSk();                //Metodo NuskaitykSk iškvietimas

            //Papildyti 3 pratimo programą parašant metodą, kuris pagal gautą KMI nustato žmogaus fizinę būseną (Šis metodas savyje turi iškviesti KMI skaičiuojantį metodą)
            NustatykBuklePagalKMI(svoris, ugis);        //Metodo NustatykBuklePagalKMI iškvietimas

            ///2.Parašyti metodą, kuris prašo įvesti du skaičius ir apkeičia juos vietomis. Pvz.: input – 2,3 result – „Pirmas skaičius yra 3, antras skaičius yra 2“.
            ApkeiskSkaicius(1, 2);                      //Metodo ApkeiskSkaicius iskvietimas

            Console.Read();


            ////1.Parašykite metodą, kuris atspausdina gautą skaičių masyvą į vieną eilutę su tarpais.
            int[] skaiciai = new int[] { 1, 14, 99, 10, 55 };
            int[] skaiciai2 = new int[] { 44, 0, 10, 10, 99, 88, 57 };

            AtspausdinkMasyva(skaiciai);                //Metodo AtspausdinkMasyva iskvietimas
            NunulinkMasyva(skaiciai);                   //Metodo NunulinkMasyva iskvietimas
            AtspausdinkMasyva(skaiciai);                //Metodo AtspausdinkMasyva iskvietimas

            AtspausdinkMasyva(skaiciai2);               //Metodo AtspausdinkMasyva iskvietimas

            ////2.Parašykite metodą Max, kuris priima skaičių masyvą ir grąžiną didžiausią skaičių. (reikės naudoti for ciklą ir sąlygas, bet ne Math biblioteką!
            int[] skaiciai3 = new int[] { 44, 0, 10, -10, 99, 88, 57 };
            var max = Max(skaiciai3);                   //metodo Max iškvietimas
            Console.WriteLine($"Didziausia masyvo reiksme yra {max}.");

            ////3. Parašyti metodą, kuris atspausdina, kokia dabar savaitės diena ir suskaičiuoja už kiek dienų bus penktadienis. Rezultato pvz.: „Today is Thursday, Friday is in 1 day“.
            Console.WriteLine($"Penktadienis bus po {KadaPenktadienis()} dienu.");

            Console.Read();
        }

        ///// ! ! ! čia surašyti patys METODAI, o jų iškvietimai yra surašyti aukščiau ! ! !

        public static void Pasisveikink(string zinute = "Labukas")  //metodas Pasisveikink
        {
            Console.WriteLine(zinute);
        }

        public static int Sudaugink(int x, int y)                   //metodas Sudaugink
        {
            return x * y;
        }

        public static double NuskaitykSk()                          //metodas NuskaitykSk
        {
            string tekstas = Console.ReadLine();
            double skaicius = double.Parse(tekstas);
            return skaicius;
        }

        public static double PaskaiciuokKMI(double svoris, double ugis) //metodas PaskaiciuokKMI
        {
            return svoris / Math.Pow(ugis, 2);
        }

        static void NustatykBuklePagalKMI(double svoris, double ugis)   // metodas NustatykBuklePagalKMI
        {
        var kmi = PaskaiciuokKMI(svoris, ugis);
        Console.WriteLine("Kuno mases indeksas yra: " + kmi);

            if (kmi < 15)
            {
                Console.WriteLine("Badaujantis zmogus");
            } 
            else if (kmi >= 15 && kmi < 18.5)
            {
                Console.WriteLine("Liesas zmogus");
            }
            else
            {
                Console.WriteLine("Reikia maziau esti !");
            }
        }

        public static void ApkeiskSkaicius(int sk1, int sk2)            //metodas ApkeiskSkaicius
        {
            Console.WriteLine($"Pirmas skaicius yra {sk2}, antras skaicius yra {sk1}");
        }

        public static void AtspausdinkMasyva(int[] masyvas)             //metodas  AtspausdinkMasyva
        {
            foreach (var elementas in masyvas)
            {
                Console.Write($"{elementas}  ");
            }
            Console.WriteLine();
        }

        public static void NunulinkMasyva(int[] masyvas)                //metodas NunulinkMasyva
        {
            for (int i = 0; i < masyvas.Length; i++)
            {
                masyvas[i] = 0;
            }
        }

        public static int Max(int[] masyvas)                            //metodas Max
        {
            int max = masyvas[0];
            for (int i = 0; i < masyvas.Length; i++)
            {
                if (masyvas[i] > max)
                    {
                        max = masyvas[i];
                    }
            }
            return max;
        }

        public static int KadaPenktadienis()                            //metodas KadaPenktadienis
        {
            DateTime siandiena = DateTime.Now;
            var savaitesDiena = (int) siandiena.DayOfWeek;
            if (savaitesDiena <= 5)
            {
                return 5 - savaitesDiena;
            }
            else
            {
                return (7 - savaitesDiena) + 5;
            }
          }
    }
}
