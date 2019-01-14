using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NamuDarbai1
{
    class ND1Metodai
    {
        public static void Pasisveikink(string vardas)  // Namu darbu uzduotis Nr.4 paprastas variantas
        {
            Console.WriteLine($"Labas, {vardas} !");
        }

        public static void Pasisveikinimas()   // Namu darbu uzduotis Nr.4 variantas su vardo ivesimu
        {
            Console.WriteLine("Koks tavo vardas ?");
            string vardas = Console.ReadLine();
            Console.WriteLine($"Labas, {vardas} !");
        }

        public static int SusumuokMasyva(int[] masyvas)   // Namu darbu uzduotis Nr.5 masyvo elementu susumavimas
        {
            int suma = 0;
            foreach (var einamasis in masyvas)
            {
                suma += einamasis;
            }
            return suma;
        }

        public static int[] SukurkMasyva(int masyvoDydis) //    Namu darbu uzduotis Nr.6
        {
            var masyvas = new int[masyvoDydis];
            return masyvas;
        }

        public static int[] NunulinkElementa(int elementoIndeksas, int[] masyvas) //    Namu darbu uzduotis Nr.7
        {
            masyvas[elementoIndeksas] = 0;
            return masyvas;
        }

        // Mano pradiniai variantai buvo padaryti neteisingai supratus uzduoti:

        public static int[] SukurkMasyva01(int masyvoDydis) //    Namu darbu uzduotis Nr.6
                                                            // (sukuria ne tik tuscia masyva bet ir masyva su paeiliui ivedamomis reiksmemis)
        {
            var masyvas = new int[masyvoDydis];
            for (int i = 0; i < masyvoDydis; i++)
            {
                Console.WriteLine("Iveskite masyvo elementa:");
                int elementas = int.Parse(Console.ReadLine()); 
                masyvas[i] = elementas;
            }
            return masyvas;
        }

        public static int[] NunulinkElementa01(int nunulinimoDydis, int [] masyvas) //    Namu darbu uzduotis Nr.7
                                                                                    // (is kiekvieno elemento atima nunulinimoDydis)
        {
            for (int i = 0; i < masyvas.Length; i++)
            {
                 masyvas[i] = masyvas[i] - nunulinimoDydis;
            }
            return masyvas;
        }  
    }
}
