using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntraPamoka
{
    class Program
    {
        static void Main(string[] args)
        {
            ////////////////////////////////////////////////////////////////////////////////////////////////////
            // MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI MASYVAI
            ////1.Parašyti programą, kuri nuskaito 10 elementų į masyvą ir jį atspausdina.

            string [] manoMasyvas = new string[10];
            for (var i = 0; i < 10; i++)
            {
                var elementas = Console.ReadLine();
                manoMasyvas[i] = elementas;
            }
            for (var i = 0; i < 10; i++)
            {
                Console.WriteLine(manoMasyvas[i]);
            }
            Console.ReadLine();

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////2.Parašyti programą, kuri prašo įvesti masyvo dydį ir tada nuskaito n elementų į masyvą ir atspausdina jį atvirkščiai.

            /*Console.WriteLine("Iveskite masyvo dydi:");
            int masyvDydis = int.Parse(Console.ReadLine());
            string[] manoMasyvas = new string[masyvDydis];
            for (var i = 0; i < masyvDydis; i++)
            {
                var elementas = Console.ReadLine();
                manoMasyvas[i] = elementas;
            }
            for (var i = masyvDydis - 1; i >=0; i--)
            {
                Console.WriteLine(manoMasyvas[i]);
            }
            Console.ReadLine();*/
            ////////////////////////////////////////////////////////////////////////////////////////////////////
            ////3.Apibrėžti ir priskirti reikšmes dvimačiam bool masyvui, kuris turi 4 eilutes ir 7 stulpelius ir atspausdinti jį ekrane 
            ////(Jei elemento reikšmė true - tai *, jei false, tai -).

            /*bool[,] manoMasyvas = new bool[4, 7]
            {
                {false, false, false, true, false, false, false },
                {false, false, true, false, true, false, false },
                {false, true, true, true, true, true, false },
                {true, true, true, true, true, true, true },
            };
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 7; j++)
                {
                    if (manoMasyvas[i,j] == true) {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write("-");
                    }
                }
                Console.WriteLine();
            }
            Console.ReadLine();*/

            ////////////////////////////////////////////////////////////////////////////////////////////////////
            // Sukurti programą, kuri nuskaitinėja eilutes tol, kol negauna tuščios ir deda eilutes į masyvą. Naudojant foreach ciklą atspausdinti masyvą.
            /*bool negavauTusciosEilutes = true;
            string[] eiluciuMasyvas = new string[10];
            int iteratorius = 0;

            while (negavauTusciosEilutes)
            {
                Console.WriteLine("Iveskite eilute");
                var eilute = Console.ReadLine();
                if (eilute == "")
                {
                    negavauTusciosEilutes = false;
                }
                else
                {
                    eiluciuMasyvas[iteratorius] = eilute;
                    iteratorius++;
                }
            }

            foreach (var eilute in eiluciuMasyvas)
            {
                Console.WriteLine(eilute);
            }

            Console.ReadLine();*/
        }
    }
}